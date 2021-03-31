package com.company.Potion;

import com.company.Item;
import com.company.Personnage.Personnage;
import com.company.Plateau.Case;

public class Potion extends Case {
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name;
    private int cure;

    //-----------------------CONSTRUCTEURS---------------------------------//
    public Potion(String name, int cure) {
        this.name = name;
        this.cure = cure;
    }

    public Potion() {

    }

    // -----------------------------GETTER & SETTER--------------------------- //
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCure() {
        return cure;
    }

    public void setCure(int cure) {
        this.cure = cure;
    }

    //---------------------------------METHODS--------------------------------------//


    @Override
    public String toString() {
        return "une " + name + "qui vous rends " + cure + " PV";
    }

    //Méthode Abstract hérité de la classe parent Case (qui est en Abstract)
    @Override
    public  void interaction(Personnage personnage) {

        personnage.setLife(personnage.getLife() + this.getCure());
        System.out.println("Vous avez gagné " + getCure() + " point de vie \nce que vous fait " + personnage.getLife());

    }
}
