package ch14.ex16.access.coffee;

import java.util.HashMap;

/**
 * Created by V1 on 09-Mar-17.
 */
public class TypeCount extends HashMap<Class<?>, Integer> {
    private Class<?> baseType;

    public TypeCount(Class<?> baseType) {  // назначается базовый класс
        this.baseType = baseType;
    }

    private void countClass(Class<?> type) {
        Integer q = get(type);
        if (q == null) {
            put(type, 1);
        } else {
            put(type, q + 1);
        }
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && baseType.isAssignableFrom(superClass)) {  // рекурсивный вызов всей иерархии классов
            countClass(superClass);
        }
    }

    public void count(Object object) {
        Class<?> type = object.getClass();          // получить класс от входного объекта
        if (!baseType.isAssignableFrom(type)) {     // сравнение классов типа <baseType> n = new <type>
            throw new RuntimeException("catch: wrong type :" + type.getSimpleName() +
                    " must be subclass of:" + baseType.getSimpleName());
        }
        countClass(type); // посчитать
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (Entry<Class<?>, Integer> entry : entrySet()) {
            sb.append(entry.getKey().getSimpleName());
            sb.append(":");
            sb.append(entry.getValue());
            sb.append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append("}");
        return sb.toString();
    }
}
