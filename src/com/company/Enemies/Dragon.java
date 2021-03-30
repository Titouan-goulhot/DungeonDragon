package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Dragon extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name ;
    private int life;
    private int strength = 4;

//-----------------------CONSTRUCTEURS---------------------------------//

//Constructeur personnalisable
    public Dragon(String name, int life, int strenght) {
        this.name = name;
        this.life = life;
        this.strength = strenght;
    }
//Constructeur par Def
    public Dragon(){
        name = "Dragon";
        life = 15;
        strength = 4;
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
