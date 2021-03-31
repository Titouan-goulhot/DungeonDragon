package com.company.Plateau;

import com.company.Item;
import com.company.Personnage.Personnage;
import com.company.Personnage.Warrior;
import com.company.Potion.*;
import com.company.Enemies.Dragon;
import com.company.Enemies.Goblin;
import com.company.Enemies.Sorcier;
import com.company.Weapons.*;

import java.util.ArrayList;

public class Board {


    //Attributs
    private ArrayList<Case> board;
    private ArrayList<Item> item;
    private int currentPlace;


    // Constructeurs : Initialiser les attributs

    public Board() {
        board = new ArrayList<>();

        currentPlace = 0;


    }

//---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "Le joueur est à la position " + currentPlace + "/64\n-----------------------------------------------------";
    }

    public void fillBoard() {

        for (int i = 0; i < 64; i++) {

            //CREER UNE METHODE POUR ENVOYER EN RANDOM LES ELEMENTS DANS LE TABLEAU

            board.add(new EmptyCase("empty"));

            //--------------------Enemy-----------------------------//

            board.add(new Goblin());
            board.add(new Sorcier());
            board.add(new Dragon());

            //--------------------Weapon-----------------------------//

            board.add(new Sword());
            board.add(new Massues());
            board.add(new Eclair());
            board.add(new BouleDeFeu());


            //--------------------Potion-----------------------------//

            board.add(new PotionStandard());
            board.add(new GrandePotion());


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
