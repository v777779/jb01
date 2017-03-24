package ch14.ex24.local;

/**
 * Created by V1 on 12-Mar-17.
 */
public class Position {
    private String title;
    private Person person;

    public Position(String jobTitle, Person employee) {
        title = jobTitle;
        person = employee;
    }

    public Position(String jobTitle) {
        title = jobTitle;
        person = Person.NULL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newtitle) {
        this.title = title;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        if (person == null) {
            this.person = Person.NULL; // INull Object
        }
    }
    @Override
    public String toString() { // for toString <ArrayList>
        return String.format("Position: %-20s %s",title,person);
    }

}
