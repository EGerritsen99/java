package farmanimals;

public class Duck extends Animal {

    @Override
    public void eat() {
        System.out.println("Duck is eating...");
    }

    @Override
    void makeSound() {
        System.out.println("Quack");
    }
}
