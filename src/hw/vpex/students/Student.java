package hw.vpex.students;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Student {
    String name;
    String room;
    String budget;
    int missed;
    double mark;
    String sex;

    public Student(String name, String room, String budget, int missed, double mark, String sex) {
        this.name = name;
        this.room = room;
        this.budget = budget;
        this.missed = missed;
        this.mark = mark;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student " + name + " "
                + room + " "
                + budget + " "
                + missed +" "
                + mark+" "
                + sex ;
    }
}
