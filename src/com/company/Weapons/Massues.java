package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Warrior;
import com.company.Personnage.Wizard;

public class Massues extends Weapon {
    //-------------------------ATTRIBUTS-------------------------------------//

    //-----------------------CONSTRUCTEURS---------------------::

    public Massues() {
       setName("Marteau qui tape");
       setDamage(3);
    }

    public Massues(String name, int damage) {
       super(name, damage);
    }
    // -----------------------------GETTER & SETTER--------------------------- //


//---------------------------------METHODS--------------------------------------//

    public String toString() {

        return "Un " + getName() + " qui ajoute " + getDamage() + " à vos point de dégats" + " Condition particulière : il faut être un Guerrier...";

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
