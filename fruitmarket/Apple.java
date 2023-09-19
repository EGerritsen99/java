package fruitmarket;

public class Apple extends Fruit {

    public void removeSeeds() {
        System.out.println("Seeds are removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made");
    }
}
