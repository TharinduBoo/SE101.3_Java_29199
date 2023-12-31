
package com.mycompany.cylindricalcontainermain;
public abstract class Container {
    private double height;
    private double radius;

    public Container(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract double calculateVolume();
}
