package com.example.superherov3.models;

public class Superhero {

    private int id;
    private java.lang.String superheroName;
    private double superheroHeight;
    private java.lang.String superheroPower;
    private java.lang.String superheroWeakness;
    private boolean superheroHumanOrNot;


    //Konstruktør
    public Superhero(java.lang.String superheroName, double superheroHeight, java.lang.String superheroPower, java.lang.String superheroWeakness, boolean superheroHumanOrNot) {
        this.superheroName = superheroName;
        this.superheroHeight = superheroHeight;
        this.superheroPower = superheroPower;
        this.superheroWeakness = superheroWeakness;
        this.superheroHumanOrNot = superheroHumanOrNot;
    }


    //get methods
    public java.lang.String getSuperheroName() {
        return superheroName;
    }

    public double getSuperheroHeight() {
        return superheroHeight;
    }

    public java.lang.String getSuperheroPower() {
        return superheroPower;
    }


    public java.lang.String getSuperheroWeakness() {
        return superheroWeakness;
    }

    public boolean getSuperheroHumanOrNot() {
        return superheroHumanOrNot;
    }

    //set methods
    public void setSuperheroName(java.lang.String superheroName) {
        this.superheroName = superheroName;
    }

    public void setSuperheroHeight(double superheroHeight) {
        this.superheroHeight = superheroHeight;
    }

    public void setSuperheroPower(java.lang.String superheroPower) {
        this.superheroPower = superheroPower;
    }

    public void setSuperheroWeakness(java.lang.String superheroWeakness) {
        this.superheroWeakness = superheroWeakness;
    }

    Boolean setSuperheroHumanOrNot(Boolean superheroHumanOrNot) {
        this.superheroHumanOrNot = superheroHumanOrNot;
        return superheroHumanOrNot;
    }


    public java.lang.String toString() {
        return "Superhero name: " + superheroName +
               " Superhero height: " + superheroHeight +
               " Superhero power(s): " + superheroPower +
               " Superhero weakness(s): " + superheroWeakness +
               " Superhero origin from planet earth: " + superheroHumanOrNot + "\n";

    }

    public java.lang.String csvToString() {
        return superheroName + "," + superheroHeight + "," + superheroPower + "," + superheroWeakness + "," + superheroHumanOrNot;
    }

}
