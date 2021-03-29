package com.company.Weapons;

public class Massues extends Weapon{
    //-------------------------ATTRIBUTS-------------------------------------//
    private String name;
    private int damage;
    //-----------------------CONSTRUCTEURS---------------------::

    public Massues() {
       name = "Massue";
       damage = 3;
    }

    public Massues(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    // -----------------------------GETTER & SETTER--------------------------- //
//---------------------------------METHODS--------------------------------------//

    public String toString() {

        return  "Un " + name + " qui ajoute " + damage + " à vos point de dégats" +" Condition particulière : il faut être un Guerrier...";

    }
}
