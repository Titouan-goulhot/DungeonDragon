package com.company.Potion;

import com.company.Personnage.Personnage;

public class GrandePotion extends Potion {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name;
    private int cure ;

    //-----------------------CONSTRUCTEURS---------------------------------//
    public GrandePotion() {
        super.setName("Grande Potion de Soin");
        super.setCure(5);
    }

    public GrandePotion(String name, int cure) {
        this.name = name;
        this.cure = cure;
    }

    //---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "une " + getName() + " qui vous rends " + getCure() + " PV";
    }



}
