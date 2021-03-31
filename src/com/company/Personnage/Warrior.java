
package com.company.Personnage;



public class Warrior extends Personnage {

    private String sword;
    private String shield;

    //CONSTRUCTEURS



    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    //Constructeur au nom de la la classe qui utlilise la méthode de la classe parente com.company.Personnage permettant de tirer un chiffre au hasard pour la vie et la force.
    public Warrior(){
        this.setLife(this.getRandomInt(5,10));
        this.setStrength(this.getRandomInt(5,10));
        this.setWeaponUser(true);
        this.setSpellUser(false);
    }

    //-------------------- METHODS-----------------------------//

    public String toString() {

        return super.toString()
                + " et la maison vous offre une super épée ainsi qu'un bouclier]";
    }


}
