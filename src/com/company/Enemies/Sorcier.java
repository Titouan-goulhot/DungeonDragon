package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Sorcier extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//


//-----------------------CONSTRUCTEURS---------------------------------//


    public Sorcier(String name, int life, int strength) {
        super(name, life, strength);
    }

    public Sorcier() {
        setName("Sorcier");
        setLife(9);
        setStrength(2);
    }

// -----------------------------GETTER & SETTER--------------------------- //


    //-------------------- METHODS-----------------------------//
    @Override
    public String toString() {
        return "Un " + getName() + " qui à une force de " + getStrength() + " et " + getLife() + " PV";

    }

}
