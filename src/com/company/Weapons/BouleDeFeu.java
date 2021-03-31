package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Wizard;

public class BouleDeFeu extends Weapon {
    //-------------------------ATTRIBUTS-------------------------------------//
    private String name;
    private int damage;

    //-----------------------CONSTRUCTEURS---------------------::

    public BouleDeFeu() {
        name = "Boule De Feu";
        damage = 7;
    }

    public BouleDeFeu(String name, int damage) {
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

        return "Un " + name + " qui ajoute " + damage + " à vos point de dégats" + " Condition particulière : il faut être un Mage...";

    }

    @Override
    public void interaction(Personnage personnage) {

        if (personnage.isSpellUser()) {
            personnage.setStrength(personnage.getStrength() + this.getDamage());
            System.out.println("Vous avez " + personnage.getStrength() + " de force d'attaque  ");
        } else {
            System.out.println("Et tu ne vas pas prendre ça puisqu'après tu vas te brûler les doigts et tu vas encore venir te plaindre... ");

        }
    }
}