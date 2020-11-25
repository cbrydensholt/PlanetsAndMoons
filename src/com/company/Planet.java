package com.company;

import java.util.ArrayList;

public class Planet extends OrbitalObject {

    ArrayList<Moon> attachedMoons = new ArrayList<Moon>();

    public Planet(String name, int age, int disanceFromSun, ArrayList<Moon> attachedMoons) {
        super(name, age, disanceFromSun);
        this.attachedMoons = attachedMoons;
    }

    public ArrayList<Moon> getAttachedMoons() {
        return attachedMoons;
    }

    public void setAttachedMoons(ArrayList<Moon> attachedMoons) {
        this.attachedMoons = attachedMoons;
    }
}
