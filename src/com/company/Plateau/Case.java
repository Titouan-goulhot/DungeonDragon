package com.company.Plateau;

import com.company.Personnage.Personnage;

public abstract class Case {
    private String name;


    public Case(String name, int impact) {
        this.name = name;
    }

    public Case(){

    }

    public Case(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void interaction(Personnage personnage);


}
