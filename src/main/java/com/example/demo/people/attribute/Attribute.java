package com.example.demo.people.attribute;

import com.example.demo.people.Category;

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
