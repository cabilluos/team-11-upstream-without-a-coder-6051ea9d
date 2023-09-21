package com.levelup.forestsandmonsters;

public class Character {

    public static final String DEFAULT_NAME = "Bob";
    String name;

    public Character() {
        this.setName(DEFAULT_NAME);
    }

    public Character(String lName) {
        this.setName(lName);
    }

    public void setName(String lName){
        name = lName;
    }

    public String getName(){
        return name;
    }
}