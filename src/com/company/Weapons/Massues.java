package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Warrior;
import com.company.Personnage.Wizard;

public class Massues extends Weapon {
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

        return "Un " + name + " qui ajoute " + damage + " à vos point de dégats" + " Condition particulière : il faut être un Guerrier...";

    }

    @Override
    public void interaction(Personnage personnage) {

        if (personnage.isWeaponUser()) {
            personnage.setStrength(personnage.getStrength() + this.getDamage());
            System.out.println("Vous avez " + personnage.getStrength() + " de force d'attaque  ");
        } else {
            System.out.println("T'es pas foutu d'utiliser un marteau ! Repose ça s'il te plait... ");

        }
    }
}
