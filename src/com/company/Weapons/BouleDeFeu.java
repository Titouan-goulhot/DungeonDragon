package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Wizard;

public class BouleDeFeu extends Weapon {
    //-------------------------ATTRIBUTS-------------------------------------//


    //-----------------------CONSTRUCTEURS---------------------::

    public BouleDeFeu() {
       setName("Boule De Feu qui brûle");
       setDamage(7);
    }

    public BouleDeFeu(String name, int damage) {
        super(name,damage);
    }


    // -----------------------------GETTER & SETTER--------------------------- //


//---------------------------------METHODS--------------------------------------//


    public String toString() {

        return "Un " + getName() + " qui ajoute " + getDamage() + " à vos point de dégats" + " Condition particulière : il faut être un Mage...";

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