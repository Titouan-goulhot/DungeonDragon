package com.company.Enemies;

import com.company.Personnage.Personnage;

public  class Dragon extends Enemy {
    //-------------------------ATTRIBUTS-------------------------------------//



//-----------------------CONSTRUCTEURS---------------------------------//

//Constructeur personnalisable
    public Dragon(String name, int life, int strength) {
        super(name,life,strength);
    }
//Constructeur par Def
    public Dragon(){
        setName("Dragon");
        setLife(15);
        setStrength(4);
    }
    // -----------------------------GETTER & SETTER--------------------------- //



    //-------------------- METHODS-----------------------------//

    @Override
    public String toString() {
        return "Un " + getName() + " qui à une force de " + getStrength() + " et " + getLife()+ " PV";

    }


}
