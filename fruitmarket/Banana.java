package fruitmarket;

public class Banana extends Fruit {

    public void peel() {
        System.out.println("Banana has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made");
    }
}
