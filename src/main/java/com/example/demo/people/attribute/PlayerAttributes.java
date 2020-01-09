package com.example.demo.people.attribute;

import com.example.demo.generic.Category;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.generic.CategoryType.TYPE_ATTRIBUTE;
import static com.example.demo.people.attribute.AttributeConstants.*;

public class PlayerAttributes {

    private Map<String, Category> attributes;

    public PlayerAttributes(Map<String, Category> attributes){
        this.attributes = attributes;
    }

    public PlayerAttributes() {
        attributes = new HashMap<>();

        /* Physical Attributes */
        attributes.put(SPEED, new Category(SPEED, TYPE_ATTRIBUTE, SPEED_DESC));
        attributes.put(AGILITY, new Category(AGILITY, TYPE_ATTRIBUTE, AGILITY_DESC));
        attributes.put(ACCELERATION, new Category(ACCELERATION, TYPE_ATTRIBUTE, ACCELERATION_DESC));

        /* Mental Attributes */
        attributes.put(SMARTS, new Category(SMARTS, TYPE_ATTRIBUTE, SMARTS_DESC));
        attributes.put(DETERMINATION, new Category(DETERMINATION, TYPE_ATTRIBUTE, DETERMINATION_DESC));

        /* Technical Attributes */

    }

    /* Getters */
    public Map<String, Category> getAllAttributes(){
        return attributes;
    }
    public Category getAttribute(String name){
        return attributes.get(name);
    }

    /* Setters */
    public void setAllAttributes(Map<String, Category> attributes){ this.attributes = attributes; }
    public void setAttribute(String name, Category attribute){ attributes.replace(name, attribute); }



}
