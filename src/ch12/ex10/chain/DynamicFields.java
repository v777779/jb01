package ch12.ex10.chain;

/**
 * Created by V1 on 01-Mar-17.
 */
public class DynamicFields {
    private Object[][] fields;


    public DynamicFields(int initSize) {
        fields = new Object[initSize][2];
        for (int i = 0; i < initSize; i++) {
            fields[i] = new Object[]{null, null};  // два поля
        }
    }

    private int hasField(String key) {               // проверка по ключу
        for (int i = 0; i < fields.length; i++) {
            if (key.equals(fields[i][0])) {
                return i;
            }
        }
        return -1; // не нашли
    }

    private int getFieldNumber(String key) throws NoSuchFieldException {  // стандартное исключение выдаем
        int fieldNum = hasField(key); // получаем номер поля или -1
        if (fieldNum == -1) {
            throw new NoSuchFieldException(); // генерим исключение
        }
        return fieldNum;
    }

    private int makeField(String key) {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i][0] == null) {  // заполняем первое пустое поле
                fields[i][0] = key;
                return i;
            }
        }
        // пустых полей нет
        int cSize = fields.length;
        Object[][] tmp = new Object[cSize + 1][2];// новый массив на 1 больше
        for (int j = 0; j < cSize; j++) {
            tmp[j] = fields[j];
        }
        tmp[cSize] = new Object[]{null, null};     // один объект на новый индекс
        fields = tmp;                           // просто сбрасываем предыдущий объект

        return makeField(key); //cSize; // индекс получаем в 1 раз рекурсивном вызове
    }

    public Object getField(String key) throws NoSuchFieldException {  // пробрасывае Exception
        return fields[getFieldNumber(key)][1];
    }

    public Object setField(String key, Object value) throws DynamicFieldsException {  // пробрасывае Exception
        if (value == null) {
            DynamicFieldsException dfe = new DynamicFieldsException(); // если value null выдаем exception
            dfe.initCause(new NullPointerException()); // здесь указываем причину
            throw dfe; // выбрасываем Custom Exception с источником внутри
        }

        int fieldNumber = hasField(key);  // проверили есть поле или нет
        if (fieldNumber == -1) {
            fieldNumber = makeField(key); // создаем поле или заполняем
        }
        Object result = null;
        try {
            result = getField(key);            // получаем старое значение объекта
        } catch (NoSuchFieldException e) {  // это дублирование но фиг с ним
            throw new RuntimeException(e);  // выбрасываем на уровне RunTime с причиной внутри
        }
        fields[fieldNumber][1] = value;
        return result; // вернули старое значение
    }



    @Override
    public String toString() {
        StringBuilder stringB = new StringBuilder();
        for (Object[] field : fields) {             // прогнать все элементы
            stringB.append(field[0].toString());    // каждый элемент распаковать в stringBuilder
            stringB.append(" : ");
            stringB.append(field[1].toString());
            stringB.append("\n");
        }
        return stringB.toString();                  // выдать stringBulder в строку
    }


}
