package lib.pets;

/**
 * Created by V1 on 09-Mar-17.
 */
public class IndividualOld implements Comparable<IndividualOld> {
    private static long count;
    private static final long id = count++;
    private String name;

    public IndividualOld() {
    }

    public IndividualOld(String name) {
        this.name = name;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(IndividualOld arg) {
        String first = getClass().getSimpleName();
        String argFirst = arg.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if(firstCompare != 0)
            return firstCompare;
        if(name != null && arg.name != null) {
            int secondCompare = name.compareTo(arg.name);
            if(secondCompare != 0)
                return secondCompare;
        }
        return (arg.id < id ? -1 : (arg.id == id ? 0 : 1));

    }
}
