package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Sorcier extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name;
    private int life;
    private int strength = 2;


//-----------------------CONSTRUCTEURS---------------------------------//


    public Sorcier(String name, int life, int strenght) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    public Sorcier() {
        name = "Sorcier";
        life = 9;
        strength = 2;
    }

// -----------------------------GETTER & SETTER--------------------------- //


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLife() {
        return life;
    }

    @Override
    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strenght) {
        this.strength = strenght;
    }

    //-------------------- METHODS-----------------------------//
    @Override
    public String toString() {
        return "Un " + name + " qui à une force de " + strength + " et " + life + " PV";

    }

}
