package fruitmarket;

public class Market {

    public static void main(String[] args) {

        Apple apple = new Apple();
        apple.setCalories(65);
        apple.removeSeeds();

        Banana banana = new Banana();
        banana.setCalories(92);
        banana.peel();

        squeeze(apple);
        squeeze(banana);

    }

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
