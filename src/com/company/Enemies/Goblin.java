package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Goblin extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name ;
    private int life;
    private int strength = 1;
//-----------------------CONSTRUCTEURS---------------------------------//


    public Goblin(String name, int life, int strenght) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    public Goblin() {
        this.name = "Goberlin";
        this.life = 6;
        this.strength = 1;
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

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //-------------------- METHODS-----------------------------//
    @Override
    public String toString() {
        return "Un " + name + " qui à une force de " + strength + " et " + life + " PV";

    }



}
