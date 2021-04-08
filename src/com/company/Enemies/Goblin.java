package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Goblin extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//

//-----------------------CONSTRUCTEURS---------------------------------//


    public Goblin(String name, int life, int strength) {
       super(name, life, strength);
    }

    public Goblin() {
      setName("Gobelin");
      setLife(6);
      setStrength(1);
    }

    // -----------------------------GETTER & SETTER--------------------------- //




    //-------------------- METHODS-----------------------------//
    @Override
    public String toString() {
        return "Un " + getName() + " qui à une force de " + getStrength() + " et " + getLife() + " PV";

    }



}
