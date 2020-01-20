package com.example.demo.generic;

public class CategoryDbl extends Category<Double> {

    private double value;

    public CategoryDbl(String name, CategoryType type, String description, double value){
        super(name, type, description);
        this.value = value;
    }

    public CategoryDbl (String name, CategoryType type, boolean hasMaximumOf100, boolean hasMinimumOf0) {
        super(name, type, hasMaximumOf100, hasMinimumOf0);
        this.value = 0;
    }

    /* Getters */
    @Override
    public Double getValue() {
        return value;
    }

    /* Setters */
    public void setValue(double value) {
        this.value = value;
    }

    /* Operations */
    public void add(double num){
        value+=num;
        if(this.hasMaximumOf100 && value>100){
            value = 100;
        }
    }

    public void subtract(double num){
        value-=num;
        if (this.hasMinimumOf0 && value < 0) {
            value=0;
        }
    }
}
