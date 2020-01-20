package com.example.demo.generic;

public class CategoryString extends Category{

    private String value;

    public CategoryString(String name, CategoryType type, String value) {
        super(name, type);
        this.value = value;
    }

    /* Getters */
    @Override
    public String getValue() {
        return value;
    }

    /* Setters */
    public void setValue(String value) {
        this.value = value;
    }
}
