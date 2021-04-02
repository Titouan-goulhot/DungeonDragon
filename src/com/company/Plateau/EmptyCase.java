package com.company.Plateau;

import com.company.Interact;
import com.company.Personnage.Personnage;

public class EmptyCase extends Case  {

    public EmptyCase(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "une Case est vide";
    }

    @Override
    public void interaction(Personnage personnage) {
        System.out.println( "la case es vide");
    }

}
