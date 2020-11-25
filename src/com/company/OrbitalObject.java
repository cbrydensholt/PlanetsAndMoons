package com.company;

abstract class OrbitalObject {

    String name;
    int age;
    int disanceFromSun;

    public OrbitalObject(String name, int age, int disanceFromSun) {
        this.name = name;
        this.age = age;
        this.disanceFromSun = disanceFromSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDisanceFromSun() {
        return disanceFromSun;
    }

    public void setDisanceFromSun(int disanceFromSun) {
        this.disanceFromSun = disanceFromSun;
    }
}
