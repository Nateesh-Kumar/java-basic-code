// src/Main.java
public class BirdsMain {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        Bird hawk = new Hawk();
        hawk.fly();
        hawk.makeSound();
    }
}
