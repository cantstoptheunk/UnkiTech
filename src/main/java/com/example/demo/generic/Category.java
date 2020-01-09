package com.example.demo.generic;

public class Category {


    private String name;
    private String description;
    private CategoryType type;
    private double value;
    private boolean hasMaximumOf100 = true;
    private boolean hasMinimumOf0 = true;

    public Category (String name, CategoryType type) {
        this.name = name;
        this.type = type;
    }

    public Category (String name, CategoryType type, boolean hasMaximumOf100, boolean hasMinimumOf0) {
        this.name = name;
        this.type = type;
        this.hasMaximumOf100 = hasMaximumOf100;
        this.hasMinimumOf0 = hasMinimumOf0;
    }

    public Category (String name, CategoryType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public Category (String name, CategoryType type, String description, double value) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.value = value;
    }

    public Category (String name, CategoryType type, double value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    /** Setters **/
    public void setName(String name){ this.name = name;}
    public void setValue(double value){this.value = value;}
    public void setDescription(String description){this.description=description;}
    public void setHasMaximumOf100(boolean bool) {hasMaximumOf100=bool;}
    public void setHasMinimumOf0(boolean bool) {hasMinimumOf0=bool;}
    public void setType(CategoryType type) {this.type = type;}

    /** Getters **/
    public String getName() {return name;}
    public double getValue() {return value;}
    public String getDescription(){return description;}
    public boolean hasMaximumOf100(){ return hasMaximumOf100;}
    public boolean hasMinimumOf0(){return hasMinimumOf0;}
    public CategoryType getType() {return type;}

    public void add(int num){
        value+=num;
        if(hasMaximumOf100 && value>100){
            value = 100;
        }
    }

    public void subtract(int num){
        value-=num;
        if (hasMinimumOf0 && value < 0) {
            value=0;
        }
    }
}
