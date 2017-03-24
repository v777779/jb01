package ch05.ex15;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Message  {
    String s;
    {
        s="Message init in normal init block{}";
    }

    public Message() {
    }

    public Message(String s) {

        this.s = s;
    }
}
