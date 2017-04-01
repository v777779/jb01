package lib.pets;

/**
 * Created by V1 on 01-Apr-17.
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Individual() {
    }

    public Individual(String name) {
        this.name = name;
    }

    public long getIg() {
        return id;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        return (o instanceof Individual) && (id == ((Individual) o).id);
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = result * 37 + name.hashCode();
        }
        result = result * 37 + (int) id;
        return result;
// IDEA version
//        int result = (int) (id ^ (id >>> 32));
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        return result;
    }

    @Override
    public int compareTo(Individual o) {
        String type = getClass().getSimpleName();       // тип текущего объекта
        String typeArg = o.getClass().getSimpleName();  // тип аргумента
        int cmp = type.compareTo(typeArg);
        if (cmp != 0) {
            return cmp; // вернуть результат сравнения
        }
        if (name != null && o.name != null) {
            int cmp2 = name.compareTo(o.name); // результат сравнения по первому аргументу
            if (cmp2 != 0) {
                return cmp2;
            }
        }
        return (id < o.id ? -1:(id == o.id ? 0: 1));  // стандартная форма
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " "+(name == null ? "" : name);
    }
}
