package com.company.Weapons;

import com.company.Personnage.Personnage;
import com.company.Personnage.Wizard;

public class Eclair extends Weapon {
    //-------------------------ATTRIBUTS-------------------------------------//

    //-----------------------CONSTRUCTEURS---------------------::

    public Eclair() {
        setName("Eclair 10 000 Volt");
        setDamage(2);
    }

    public Eclair(String name, int damage) {
        super(name, damage);
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
            System.out.println("Et tu ne vas pas prendre ça ... Rappelle toi ce que ça donne quand tu changes une ampoule ... ");

        }
    }
}
