// src/Eagle.java
class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle is flying high in the sky");
    }

    @Override
    void makeSound() {
        System.out.println("Eagle makes a sharp 'chirp' sound");
    }
}
