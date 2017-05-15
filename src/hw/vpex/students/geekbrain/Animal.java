package hw.vpex.students.geekbrain;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Animal {
    String name;
    String type;
    String voice;
    int age;
    int speed;

    public Animal(String name, String type, String voice, int age, int speed) {
        this.name = name;
        this.type = type;
        this.voice = voice;
        this.age = age;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getVoice() {
        return voice;
    }

    public int getAge() {
        return age;
    }

    public int getSpeed() {
        return speed;
    }
}
