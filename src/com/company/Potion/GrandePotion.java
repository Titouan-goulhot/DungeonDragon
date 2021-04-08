package com.company.Potion;

import com.company.Personnage.Personnage;

public class GrandePotion extends Potion {
    //-------------------------ATTRIBUTS-------------------------------------//



    //-----------------------CONSTRUCTEURS---------------------------------//
    public GrandePotion() {
       setName("Grande Potion de Soin");
       setCure(5);
    }

    public GrandePotion(String name, int cure) {
       super(name, cure);
    }



    //---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "une " + getName() + " qui vous rends " + getCure() + " PV";
    }



}
