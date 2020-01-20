package com.example.demo.generic;

abstract public class Category<T> {

    protected String name;
    protected String description;
    protected CategoryType type;
    protected boolean hasMaximumOf100 = true;
    protected boolean hasMinimumOf0 = true;

    protected Category (String name, CategoryType type) {
        this.name = name;
        this.type = type;
    }

    protected Category (String name, CategoryType type, boolean hasMaximumOf100, boolean hasMinimumOf0) {
        this.name = name;
        this.type = type;
        this.hasMaximumOf100 = hasMaximumOf100;
        this.hasMinimumOf0 = hasMinimumOf0;
    }

    protected Category (String name, CategoryType type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    /** Setters **/
    public void setName(String name){ this.name = name;}
    public void setDescription(String description){this.description=description;}
    public void setHasMaximumOf100(boolean bool) {hasMaximumOf100=bool;}
    public void setHasMinimumOf0(boolean bool) {hasMinimumOf0=bool;}
    public void setType(CategoryType type) {this.type = type;}

    /** Getters **/
    public String getName() {return name;}
    public String getDescription(){return description;}
    public boolean hasMaximumOf100(){ return hasMaximumOf100;}
    public boolean hasMinimumOf0(){return hasMinimumOf0;}
    public CategoryType getType() {return type;}

    /* Operations */
    public abstract T getValue();
}
