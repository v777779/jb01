package ch10.ex15.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Stadium {
    private String field;
    private int sections;

    public Stadium(String field, int sections) {
        this.field = field;
        this.sections = sections;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public int getSections() {
        return sections;
    }

    public void setSections(int sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "field='" + field + '\'' +
                ", sections=" + sections +
                '}';
    }
}
