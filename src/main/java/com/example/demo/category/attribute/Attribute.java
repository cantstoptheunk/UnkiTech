package com.example.demo.category.attribute;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.demo.category.Category;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

public class Attribute extends Category {

    public Attribute(String name) {
        super(name);
    }

    public Attribute(String name, String description, double value) {
        super(name, description, value);
    }

    public Attribute(String name, double value) {
        super(name);
    }

    public Attribute(String name, String description){
        super(name, description);
    }

}
