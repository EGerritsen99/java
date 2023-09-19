package farmanimals;

public class Pig extends Animal {


    @Override
    public void eat() {
        System.out.println("Pig is eating...");
    }

    @Override
    void makeSound() {
        System.out.println("Oink");
    }
}
