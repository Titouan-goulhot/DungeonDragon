package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Plateau.Case;

public class Weapon extends Case {

    //-------------------------ATTRIBUTS-------------------------------------//
    private String name;
    private int damage;

    //-----------------------CONSTRUCTEURS---------------------::
    public Weapon(String name, int damage){
        this.name = name;
        this.damage = damage;

    }

    public Weapon(){

    }
    // -----------------------------GETTER & SETTER--------------------------- //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
//---------------------------------METHODS--------------------------------------//


    @Override
    public String toString() {
        return "Un " + name + " qui ajoute " + damage + " à vos point de dégats";
    }

    @Override
    public void interaction() {
    Personnage player = new Personnage() {

    };
    }
}
