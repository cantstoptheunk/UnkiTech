package com.example.demo.generic;

import com.example.demo.people.player.Position;

public class CategoryPos extends Category{

    private Position value;

    public CategoryPos(String name, CategoryType type, Position value) {
        super(name, type);
        this.value = value;
    }

    /* Getters */
    public Position getValue() {
        return value;
    }

    /* Setters */
    public void setValue(Position value) {
        this.value = value;
    }
}
