package com.company;

import java.util.ArrayList;

public class Board {


    //Attributs
    private ArrayList<Integer> board;
    private int currentPlace;


    // Constructeurs : Initialiser les attributs

    public Board() {
        board = new ArrayList<>(64);
        currentPlace = 0;
    }

    //Methodes

    @Override
    public String toString() {
        return "Le joueur est à la position" + currentPlace + " /64";
    }

    //Getters / Setters
    public ArrayList<Integer> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Integer> board) {
        this.board = board;
    }

    public int getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(int currentPlace) {
        if(currentPlace <= 64 ) {
            this.currentPlace = currentPlace;
        }else{
            this.currentPlace = 64;
            System.out.println("Tu as poussé le bouchon un peu trop loin Maurice... Recule un peu... Cest bon ne bouge plus !");
        }
    }
}
