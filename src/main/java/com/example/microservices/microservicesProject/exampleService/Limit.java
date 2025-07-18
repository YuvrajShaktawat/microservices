package com.example.microservices.microservicesProject.exampleService;

public class Limit {
    private int maximum;
    private int minimum;
    public Limit() {
        // Default constructor
    }

    public Limit(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

}
