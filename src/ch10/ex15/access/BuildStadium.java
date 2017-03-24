package ch10.ex15.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class BuildStadium {

    public Stadium getStadium() {
        return new Stadium("Green",12){
            {
                setField(getField()+"Field");
                setSections(getSections()+4);
            }
        };
    }
}
