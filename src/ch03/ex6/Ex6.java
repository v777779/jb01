package ch03.ex6;

/**
 * Created by V1 on 04-Feb-17.
 */
public class Ex6 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("spot   ", "gav gav");
        Dog dog2 = new Dog("scruffy", "wov wov wooooo");
        Dog dog3 = dog1;
        Dog dog4 = new Dog("scruffy", "wov wov wooooo");

        System.out.println("\nDog exercise\n");
        System.out.println(dog1.name+" says: "+dog1.says);
        System.out.println(dog2.name+" says: "+dog2.says);
        System.out.println("link comparison dog1 = dog3 : "+dog1.equals(dog3));
        System.out.println("link comparison dog4 = new(): "+dog2.equals(dog4));

    }
}
