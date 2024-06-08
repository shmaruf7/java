package assignment;

public class Cat extends Animal {
    String sound;
    @Override
    void makeSound(){
        System.out.println("Cat sound: "+sound);
    }
}
