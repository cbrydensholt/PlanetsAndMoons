package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    Planet earth;
    Moon milkymoon;

    @BeforeEach
    void init(){
        ArrayList<Moon> attachedMoons = new ArrayList<>();
        earth = new Planet("Earth", 19000, 50000, attachedMoons);
        milkymoon = new Moon("Milkymoon", 23043, 5000, earth);
        earth.attachedMoons.add(milkymoon);

    }







}