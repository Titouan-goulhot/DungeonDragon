package com.company.Personnage;

import com.company.Enemies.Enemy;
import com.company.Fight;
import com.company.Interact;
import com.company.Plateau.Board;
import com.company.Plateau.Case;
import com.company.Plateau.Dice;

import java.util.Scanner;

public  class Personnage implements Fight {
    //-------------------------ATTRIBUTS-------------------------------------//
    private int life;
    private int minPv;
    private int maxPv;
    private int strength;
    private int minStrength;
    private int maxStrength;
    private String name;
    private boolean weaponUser;
    private boolean spellUser;
    private String specialties;

    //-----------------------CONSTRUCTEURS---------------------::

    public Personnage(String name, int life, int strength) {
        this.name = name;
        this.life = life;
        this.strength = strength;
    }

    public Personnage() {

    }

    public Personnage(String name) {
        this.name = name;
    }


    // -----------------------------GETTER & SETTER--------------------------- //
    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String specialties) {
        this.specialties = specialties;
    }

    public int getLife() {
        return life;
    }

    public boolean isSpellUser() {
        return spellUser;
    }

    public void setSpellUser(boolean spellUser) {
        this.spellUser = spellUser;
    }

    public boolean isWeaponUser() {
        return weaponUser;
    }

    public void setWeaponUser(boolean weaponUser) {
        this.weaponUser = weaponUser;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    public int getMinPv() {
        return minPv;
    }

    public void setMinPv(int minPv) {
        this.minPv = minPv;
    }

    public int getMaxPv() {
        return maxPv;
    }

    public void setMaxPv(int maxPv) {
        this.maxPv = maxPv;
    }

    public int getMinStrength() {
        return minStrength;
    }

    public void setMinStrength(int minStrength) {
        this.minStrength = minStrength;
    }

    public int getMaxStrength() {
        return maxStrength;
    }

    public void setMaxStrength(int maxStrength) {
        this.maxStrength = maxStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //---------------------------------METHODS--------------------------------------//


    //Création d'une méthode pour avoir un niveau de vie et de force au hasard en fonction des valeurs d'attributs communiqués
    public int getRandomInt(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min) + min);
    }


    public String toString() {
        return "Vous aurez donc  [nom = " + getName() + " , niveau de vie = " + getLife()
                + " , force =" + getStrength();
    }


    @Override
    public void interaction(Case cell) {
        if (cell instanceof Enemy) {
            //On Cast la classe Enemy dans la variable cell

            Enemy monster = (Enemy)cell;

                if (monster.getLife() > 0 && life > 0) {
                    monster.setLife(monster.getLife() - strength);
                    System.out.println("Vous attaquez. Vous lui infligez " + strength + "\n Il lui reste " + monster.getLife());
                    if(monster.getLife() > 0){
                        System.out.println("il est résistant le bougre ! Mais tu lui as fait peur... Il s'enfuit, peut être pour mieux te retrouver plus tard");
                    }
                }if(monster.getLife() <= 0){
                System.out.println("Vous l'avez térassé... Vous pouvez continuer ");

            }

            }

        }
    }



