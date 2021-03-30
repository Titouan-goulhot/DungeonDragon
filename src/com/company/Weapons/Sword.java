package com.company.Weapons;

public class Sword extends Weapon{
    //-------------------------ATTRIBUTS-------------------------------------//
    private String name = "Sword";
    private int damage = 5;
    //-----------------------CONSTRUCTEURS---------------------::

    public Sword() {
        name = "Sword";
        damage = 5;
    }

    public Sword(String name, int damage) {
        this.name = name;
        this.damage = damage;
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
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }


//---------------------------------METHODS--------------------------------------//

    public String toString() {

        return  "Un " + name + " qui ajoute " + damage + " à vos point de dégats" +" Condition particulière : il faut être un Guerrier...";

    }
}
