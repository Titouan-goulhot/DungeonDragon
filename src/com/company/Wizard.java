package com.company;


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



    //Constructeur au nom de la la classe qui utlilise la méthode de la classe parente Personnage permettant de tirer un chiffre au hasard pour la vie et la force.
    public Wizard() {
        this.setLife(this.getRandomInt(3, 6));
        this.setStrenght(this.getRandomInt(8, 15));

    }
    public String toString() {
        return "Vous aurez donc  [nom = " + getName() + " , niveau de vie = " + getLife()
                + " , force =" + getStrenght()
                +" + quelques philtres... A consommer avec modération ]";
    }

}