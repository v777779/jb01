package hw.vpex.students;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 10-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FixedArrayStudents extends Students {

    FixedArrayStudents() {
        students = new ArrayList<>();
        students.add(new Student("Kripov Artem", "LA-54", "Budjet", 4, 4.5, "men"));
        students.add(new Student("Pasichnik Jenya", "LA-63", "Kontrakt", 108, 3.2, "men"));
        students.add(new Student("Sedaya Ira", "LA-63", "Budjet", 18, 4.8, "women"));
        students.add(new Student("Ostrovskiy German", "LA-54", "Budjet", 28, 4.1, "men"));
        students.add(new Student("Krivcov Egor", "LA-54", "Kontrakt", 40, 5, "men"));
        students.add(new Student("Morozov Stas", "LA-63", "Kontrakt", 35, 3.45, "men"));
    }


    private static Comparator<Student> cMark = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.mark > o2.mark ? -1 : (o1.mark < o2.mark ? 1 : 0);
        }
    };

    private static  Comparator<Student> cMissed = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.missed > o2.missed ? 1 : (o1.missed < o2.missed ? -1 : 0);
        }
    };

    private static  Comparator<Student> cSex = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.sex.compareTo(o2.sex);
        }
    };

    public Student getStudent(Comparator<Student> comparator) {
        Collections.sort(students,comparator);
        return students.get(0);
    }

    public List<Student> getName(char c) {
        List<Student> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(".*"+c+".*");
        for (Student student : students) {
            Matcher m = pattern.matcher(student.name);
            if (m.matches()) {
                list.add(student);
            }
        }
        return list;
    }

    public List<Student> getSex(String sex) {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.sex.equals(sex)) {
                list.add(student);
            }
        }
        return list;
    }

    public List<Student> getBudget() {
        List<Student> list = new ArrayList<>();
        for (Student student : students) {
            if (student.budget.equals("Budjet")) {
                list.add(student);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        FixedArrayStudents fx = new FixedArrayStudents();
        System.out.println("mark  :"+fx.getStudent(cMark));
        System.out.println("missed:"+fx.getStudent(cMissed));
        System.out.println("A     :"+fx.getName('A'));
        System.out.println("Budjet:"+fx.getBudget());
        fx.getStudent(cSex); // sort by sex
        System.out.println("sort by sex:"+fx.students);
        System.out.println(fx.getSex("women").get(0));

    }
}
