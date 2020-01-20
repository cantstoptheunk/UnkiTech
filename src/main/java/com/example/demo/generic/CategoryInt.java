package com.example.demo.generic;

public class CategoryInt extends Category<Integer>{

    private int value;

    public CategoryInt(String name, CategoryType type, int value){
        super(name, type);
        this.value = value;
    }

    public CategoryInt (String name, CategoryType type, boolean hasMaximumOf100, boolean hasMinimumOf0) {
        super(name, type, hasMaximumOf100, hasMinimumOf0);
        this.value = 0;
    }

    /* Getters */
    @Override
    public Integer getValue() {
        return value;
    }

    /* Setters */
    public void setValue(int value) {
        this.value = value;
    }

    /* Operations */
    public void add(int num){
        value+=num;
        if(this.hasMaximumOf100 && value>100){
            value = 100;
        }
    }

    public void subtract(int num){
        value-=num;
        if (this.hasMinimumOf0 && value < 0) {
            value=0;
        }
    }
}
