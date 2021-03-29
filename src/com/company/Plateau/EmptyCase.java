package com.company.Plateau;

public class EmptyCase extends Case {

    public EmptyCase(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "une Case est vide";
    }

    @Override
    public void interaction() {
        System.out.println( "la case es vide");
    }

}
