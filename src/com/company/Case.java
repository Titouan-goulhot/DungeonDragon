package com.company;

public class Case {
    private String name;
    private int impact;

    public Case(String name, int impact) {
        this.name = name;
        this.impact = impact;

    }
    public Case(){

    }

    @Override
    public String toString() {
        return name;
    }
}
