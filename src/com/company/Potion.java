package com.company;

public class Potion extends Case{
    //-------------------------ATTRIBUTS-------------------------------------//

    private String name;
    private int cure;

    //-----------------------CONSTRUCTEURS---------------------------------//
    public Potion (String name, int cure){
        this.name = name;
        this.cure = cure;
    }

    public Potion(){

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

    @Override
    public void interaction() {
        Personnage player = new Personnage() {
            @Override
            public int getLife() {
                return getLife();
            }
        };
    }
}
