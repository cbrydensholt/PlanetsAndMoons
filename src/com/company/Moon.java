package com.company;

public class Moon extends OrbitalObject {

    private Planet attachedPlanet;

    public Moon(String name, int age, int disanceFromSun, Planet attachedPlanet) {
        super(name, age, disanceFromSun);
        this.attachedPlanet = attachedPlanet;
    }

    public Planet getAttachedPlanet() {
        return attachedPlanet;
    }

    public void setAttachedPlanet(Planet attachedPlanet) {
        this.attachedPlanet = attachedPlanet;
    }
}
