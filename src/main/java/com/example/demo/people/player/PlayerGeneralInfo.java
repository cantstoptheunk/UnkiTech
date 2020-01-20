package com.example.demo.people.player;

import com.example.demo.generic.Category;

import static com.example.demo.generic.CategoryType.TYPE_GENERAL_INFO;
import static com.example.demo.people.player.GeneralInfoConstants.POSITION;

public class PlayerGeneralInfo {

    private String firstName, lastName, college;
    private int age;
    private final Position position;

    public PlayerGeneralInfo(Position pos){
        position = pos;
    }

    /* Getters */
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public String getCollege(){ return college;}
    public int getAge(){return age;}
    public Position getPosition(){return position;}

    /* Setters */
    public void setFirstName(String name){firstName = name;}
    public void setLastName(String name){lastName = name;}
    public void setCollege(String name){college = name;}
    public void setAge(int num){age = num;}

}
