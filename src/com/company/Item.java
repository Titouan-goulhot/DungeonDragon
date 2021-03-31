package com.company;

import com.company.Personnage.Personnage;

public abstract class Item {
    private String name;


    public Item() {

    }


    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract void interaction(Personnage personnage);

}
