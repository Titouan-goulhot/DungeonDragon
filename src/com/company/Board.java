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
public void fillBoard(){
        for(int i = 0 ; i< 4; i ++){
            board.add(new Case());
            board.add(new Enemy("Gobelin", 3,1));
            board.add(new Weapon("Sword",4));
            board.add(new Potion("Potion de vie standard ", 2));
            System.out.println("A la case "+ i + board );

        }
    /*for (Case caseBoard : board){


    }*/

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
        if(currentPlace <= 64 ) {
            this.currentPlace = currentPlace;
        }else{
            this.currentPlace = 64;
            throw new PersonnageHorsPlateauException();
        }
    }
}
