package com.company.Personnage;

public abstract class Personnage {
    //-------------------------ATTRIBUTS-------------------------------------//
    private int life;
    private int minPv;
    private int maxPv;
    private int strenght;
    private int minStrength;
    private int maxStrength;
    private String name;

    //-----------------------CONSTRUCTEURS---------------------::

    public Personnage(String name, int life, int strenght){
        this.name= name;
        this.life = life;
        this.strenght = strenght;
    }

    public Personnage(){

    }

    public Personnage (String name){
        this.name = name;
    }


    // -----------------------------GETTER & SETTER--------------------------- //
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }


    public int getMinPv() {
        return minPv;
    }

    public void setMinPv(int minPv) {
        this.minPv = minPv;
    }

    public int getMaxPv() {
        return maxPv;
    }

    public void setMaxPv(int maxPv) {
        this.maxPv = maxPv;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public void setMinStrength(int minStrength) {
        this.minStrength = minStrength;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //---------------------------------METHODS--------------------------------------//


    //Création d'une méthode pour avoir un niveau de vie et de force au hasard en fonction des valeurs d'attributs communiqués
    public int getRandomInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }

    public String toString() {
        return "Vous aurez donc  [nom = " + getName() + " , niveau de vie = " + getLife()
                + " , force =" + getStrenght();
    }

}
