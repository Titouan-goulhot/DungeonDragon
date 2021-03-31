package com.company.Personnage;


public class Wizard extends Personnage {

    private String potion;
    private String spell;


    public String getPotion() {

        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;

    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }



    //Constructeur au nom de la la classe qui utlilise la méthode de la classe parente com.company.Personnage permettant de tirer un chiffre au hasard pour la vie et la force.
    public Wizard() {
        this.setLife(this.getRandomInt(3, 6));
        this.setStrength(this.getRandomInt(8, 15));
        this.setWeaponUser(false);
        this.setSpellUser(true);

    }
    public String toString() {
//On fait appel à la méthode tostring de la classe parent avec super.
        return super.toString()
                +" + quelques philtres... A consommer avec modération ]";
    }

}