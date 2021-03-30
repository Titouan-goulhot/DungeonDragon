package com.company.Enemies;

import com.company.Personnage.Personnage;
import com.company.Plateau.Case;

public  class Enemy extends Case {
    //-------------------------ATTRIBUTS-------------------------------------//
    private String name;
    private int life;
    private int strength;

    //-----------------------CONSTRUCTEURS---------------------------------//

    public Enemy(String name, int life, int strength) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    public Enemy() {

    }

    // -----------------------------GETTER & SETTER--------------------------- //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
//---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "Un " + name + " qui a  " + strength + " de Force et " + life + " PV";


    }
    //Méthode Abstract hérité de la classe parent Case (qui est en Abstract)

    @Override
    public  void interaction(Personnage personnage){

        personnage.setLife(personnage.getLife() - getStrength());
        System.out.println("il vous attaque, vous perdez " + getStrength()+ " Point de vie \nIl vous en reste " + personnage.getLife());

    }
}

