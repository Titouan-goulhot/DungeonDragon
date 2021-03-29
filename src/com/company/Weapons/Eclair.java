package com.company.Weapons;

public class Eclair extends Weapon {
    //-------------------------ATTRIBUTS-------------------------------------//
    private String name;
    private int damage;
    //-----------------------CONSTRUCTEURS---------------------::

    public Eclair() {
       name = "Eclair";
       damage = 2;
    }

    public Eclair(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    // -----------------------------GETTER & SETTER--------------------------- //

    //---------------------------------METHODS--------------------------------------//

    public String toString() {

        return  "Un " + name + " qui ajoute " + damage + " à vos point de dégats" +" Condition particulière : il faut être un Mage...";

    }
}
