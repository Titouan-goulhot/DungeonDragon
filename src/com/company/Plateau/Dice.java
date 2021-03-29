package com.company.Plateau;

public class Dice {

    private int minDice = 1;
    private int maxDice = 7;

    public int getMinDice() {
        return minDice;
    }

    public void setMinDice(int minDice) {
        this.minDice = minDice;
    }

    public int getMaxDice() {
        return maxDice;
    }

    public void setMaxDice(int maxDice) {
        this.maxDice = maxDice;
    }


    //------------------------------------METHODES-----------------------------------------------------
    public int randomDice() { // Méthode pour simuler un lancé de dé. (X1)
        return (int) Math.floor(Math.random() * (maxDice - minDice) + minDice);

    }


}
