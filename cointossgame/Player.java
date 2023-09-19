package cointossgame;

public class Player {

    ///////////// Fields ////////////////
    private String name;
    private String guess;

    ////////////////// Constructor ///////////////
    public Player(String name) {
        setName(name);
    }

    //////////////// Getters and Setters ////////////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
