
package com.mycompany.testshapes;
abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("Shape area: " + calculateArea());
    }
}

