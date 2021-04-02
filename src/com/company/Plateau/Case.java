package com.company.Plateau;

import com.company.Interact;
import com.company.Personnage.Personnage;

public abstract class Case implements Interact {
    private String name;


    public Case() {

    }

    public Case(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }



}


