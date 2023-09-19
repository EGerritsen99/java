package cointossgame;

import java.util.Random;

public class Coin {

    //////////////// Fields //////////////////////
    private String side;
    public static String HEADS = "Heads";
    public static String TAILS = "Tails";

    //////////// Getters and Setters /////////////
    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }

    //////////////// Method /////////////////////
    public String flip() {
        if(new Random().nextBoolean()) {
            setSide(HEADS);
        }
        else {
            setSide(TAILS);
        }

        return getSide();
    }
}
