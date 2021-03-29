package com.company;

import java.util.ArrayList;

public class Board {


    //Attributs
    private ArrayList<Case> board;
    private int currentPlace;


    // Constructeurs : Initialiser les attributs

    public Board() {
        board = new ArrayList<>();
        currentPlace = 0;


    }

//---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "Le joueur est à la position " + currentPlace + "/64";
    }

    public void fillBoard() {

        for (int i = 0; i < 5; i++) {

            board.add(new EmptyCase("empty"));

            //--------------------Enemy-----------------------------//

            board.add(new Enemy("Gobelin", 6, 1));
            board.add(new Enemy("Sorcier", 9, 2));
            board.add(new Enemy("Dragon", 15, 4));

            //--------------------Weapon-----------------------------//

            board.add(new Weapon("Sword", 4));
            board.add(new Weapon("Massue", 3));
            board.add(new Weapon("Eclair", 2));
            board.add(new Weapon("Boule de Feu", 7));

            //--------------------Potion-----------------------------//

            board.add(new Potion("Potion de vie standard ", 2));
            board.add(new Potion("Grande potion de vie ", 5));


        }
        System.out.println("Vous êtes tombés sur " + board.get(currentPlace));


    }


    // -----------------------------GETTER & SETTER--------------------------- //
    public ArrayList<Case> getBoard() {
        return board;
    }

    public void setBoard(ArrayList<Case> board) {
        this.board = board;
    }

    public int getCurrentPlace() {
        return currentPlace;
    }

    //---------------------------------METHODS--------------------------------------//

    public void setCurrentPlace(int currentPlace) throws PersonnageHorsPlateauException {
        if (currentPlace <= 64) {
            this.currentPlace = currentPlace;
        } else {
            this.currentPlace = 64;
            throw new PersonnageHorsPlateauException();
        }
    }
}
