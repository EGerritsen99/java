package cake;

public class TasteTester {

    public static void main(String[] args) {

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(15.99);
        birthdayCake.setFlavour("strawberry");
        birthdayCake.setCandles(6);

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(151.75);
        weddingCake.setFlavour("vanilla");
        weddingCake.setTiers(4);

        System.out.println("The " + birthdayCake.getFlavour() +
                " birthday cake is $" + birthdayCake.getPrice() +
                " and has " + birthdayCake.getCandles() + " candles.");

        System.out.println("The " + weddingCake.getFlavour() +
                " flavoured wedding cake with " + weddingCake.getTiers()
                + " tiers is $" + weddingCake.getPrice());
    }
}
