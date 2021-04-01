package com.company.Plateau;

import com.company.Interact;
import com.company.Potion.*;
import com.company.Enemies.Dragon;
import com.company.Enemies.Goblin;
import com.company.Enemies.Sorcier;
import com.company.Weapons.*;

import java.util.ArrayList;
import java.util.Collections;

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
        return "Le joueur est à la position " + currentPlace + "/64\n-----------------------------------------------------";
    }

    public void fillBoard() {


        for (int i = 0; i < 10; i++) {
            board.add(new Sorcier());
            board.add(new Goblin());
        }
        for (int i = 0; i < 6; i++){
            board.add(new PotionStandard());
        }

        for (int i = 0; i < 5; i++){
            board.add(new Massues());
            board.add(new Eclair());
        }
        for (int i = 0; i < 4; i++){
            board.add(new Sword());
            board.add(new Dragon());

        }
        for (int i = 0; i < 2; i++){
            board.add(new BouleDeFeu());
            board.add(new GrandePotion());
        }



        //CREER UNE METHODE POUR ENVOYER EN RANDOM LES ELEMENTS DANS LE TABLEAU
        Collections.shuffle(board);
        System.out.println("Vous êtes tombés sur " + board.get(currentPlace));



        //Chercher un élément dans l'Arraylist

        if(board.contains(new Dragon())){
            System.out.println("As-tu vu le beau Dragon ?");
        }else{
            System.out.println("Mais de quel Dragon tu cause ?");
        };


        //Supprimer un élément de mon Arraylist
        board.remove(new Dragon());

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
    /**
     *
     * @throws PersonnageHorsPlateauException  Si  le player sort du plateau.
     * @param currentPlace renvoit la position du player
     */
    public void setCurrentPlace(int currentPlace) throws PersonnageHorsPlateauException {
        if (currentPlace <= 64) {
            this.currentPlace = currentPlace;
        } else {
            this.currentPlace = 64;
            throw new PersonnageHorsPlateauException();
        }
    }
}
