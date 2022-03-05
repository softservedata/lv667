package com.softserve.edu_08;

public abstract class Bird {
    private String attributes;
    private String feathers;
    private String layEggs;
    private String Class;

    public Bird(String attributes, String feathers, String layEggs) {
        this.attributes = attributes;
        this.feathers = feathers;
        this.layEggs = layEggs;
    }
    public abstract boolean fly();

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public String getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(String layEggs) {
        this.layEggs = layEggs;
    }
    @Override
    public String toString(){
        return ("\nAttributes: " + attributes + "    Feathers: " + feathers + "    Lay Eggs: " + layEggs + "    Fly: " + fly());

    }
}

//@Override
//        public void String toString() {
//            for (int i = 0; i < bird.length; i++)
//                System.out.println("Attributes: " + bird[i].getAttributes() + "    Feathers: " + bird[i].getFeathers() + "    Lay Eggs: " + bird[i].getLayEggs() + "    Fly: " + bird[i].fly());
//        }