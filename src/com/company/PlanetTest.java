package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    Planet earth;
    Moon milkymoon;
    Planet saturn;



    @BeforeEach
    void init(){
        ArrayList<Moon> attachedMoons = new ArrayList<>();
        earth = new Planet("Earth", 19000, 50000, attachedMoons);
        saturn = new Planet("Saturn", 50050, 10000, attachedMoons);
        milkymoon = new Moon("Milkymoon", 23043, 5000, earth);
        earth.attachedMoons.add(milkymoon);

    }


    @Test
    public void createEarth() {


        assertTrue(earth.getName().equals("Earth"));
        assertTrue(earth.getAge() == 19000);
        assertTrue(earth.getDisanceFromSun() == 50000);
    }


    @Test
    public void amountOfMoons(){

        System.out.println(earth.getAttachedMoons().size());
        assertTrue(earth.getAttachedMoons().size() > 0);



    }

    @Test
    public void distanceBetweenPlanets(){

        int saturnToSun = saturn.getDisanceFromSun();
        int earthToSun = earth.getDisanceFromSun();

        int distancebetween = earthToSun - saturnToSun;

        assertTrue(distancebetween > 0);





    }




}