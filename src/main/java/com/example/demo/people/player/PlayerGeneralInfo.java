package com.example.demo.people.player;

import com.example.demo.generic.Category;

import static com.example.demo.generic.CategoryType.TYPE_GENERAL_INFO;
import static com.example.demo.people.player.GeneralInfoConstants.POSITION;

public class PlayerGeneralInfo {

    private Category firstName, lastName, college;
    private Category age;
    private final Category position;

    public PlayerGeneralInfo(Position pos){
        position = new Category(POSITION, TYPE_GENERAL_INFO);
    }

    /* Getters */
    public Category getFirstName(){ return firstName;}
    public Category getLastName(){ return lastName;}
    public Category getCollege(){ return college;}
    public Category getAge(){return age;}
    public Category getPosition(){return position;}

    /* Setters */
    public void setFirstName(Category name){firstName = name;}
    public void setLastName(Category name){lastName = name;}
    public void setCollege(Category name){college = name;}
    public void setAge(Category num){age = num;}

}
