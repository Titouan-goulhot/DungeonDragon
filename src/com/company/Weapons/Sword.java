package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Warrior;
import com.company.Personnage.Wizard;

public class Sword extends Weapon {
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

        return "Un " + name + " qui ajoute " + damage + " à vos point de dégats" + " Condition particulière : il faut être un Guerrier...";

    }

    @Override
    public void interaction(Personnage personnage) {

        if (personnage.isWeaponUser()) {
            personnage.setStrength(personnage.getStrength() + this.getDamage());
            System.out.println("Vous avez " + personnage.getStrength() + " de force d'attaque  ");
        } else {
            System.out.println("Pas touche... Si t'es sage je te donne un couteau à beurre à la place.... en plastique ");

        }
    }
}
