package com.example.demo.category.attribute;

import java.util.HashMap;
import java.util.Map;

import static com.example.demo.category.attribute.AttributeConstants.*;

public class PlayerAttributes {

    private Map<String, Attribute> attributes;

    public PlayerAttributes(Map<String, Attribute> attributes){
        this.attributes = attributes;
    }

    public PlayerAttributes() {
        attributes = new HashMap<>();

        /* Physical Attributes */
        attributes.put(SPEED, new Attribute(SPEED, SPEED_DESC));
        attributes.put(AGILITY, new Attribute(AGILITY, AGILITY_DESC));
        attributes.put(ACCELERATION, new Attribute(ACCELERATION, ACCELERATION_DESC));

        /* Mental Attributes */
        attributes.put(SMARTS, new Attribute(SMARTS, SMARTS_DESC));
        attributes.put(DETERMINATION, new Attribute(DETERMINATION, DETERMINATION_DESC));

        /* Technical Attributes */

    }

    /* Getters */
    public Map<String, Attribute> getAllAttributes(){
        return attributes;
    }
    public Attribute getAttribute(String name){
        return attributes.get(name);
    }

    /* Setters */
    public void setAllAttributes(Map<String, Attribute> attributes){ this.attributes = attributes; }
    public void setAttribute(String name, Attribute attribute){ attributes.replace(name, attribute); }



}
