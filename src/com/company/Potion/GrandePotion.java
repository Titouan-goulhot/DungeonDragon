package com.company.Potion;

public class GrandePotion extends Potion {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name;
    private int cure ;

    //-----------------------CONSTRUCTEURS---------------------------------//
    public GrandePotion() {
        name = "Grande Potion de Soin";
        cure = 5;
    }

    public GrandePotion(String name, int cure) {
        this.name = name;
        this.cure = cure;
    }

    //---------------------------------METHODS--------------------------------------//

    @Override
    public String toString() {
        return "une " + name + " qui vous rends " + cure + " PV";
    }


}
