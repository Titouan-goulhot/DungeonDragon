package com.company.Enemies;

public class Goblin extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name ;
    private int life;
    private int strenght;
//-----------------------CONSTRUCTEURS---------------------------------//


    public Goblin(String name, int life, int strenght) {
        this.name = name;
        this.life = life;
        this.strenght = strenght;
    }

    public Goblin() {
        this.name = "Goberlin";
        this.life = 6;
        this.strenght = 1;
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

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    //-------------------- METHODS-----------------------------//
    @Override
    public String toString() {
        return "Un " + name + " qui à une force de " + strenght + " et " + life + " PV";

    }

}
