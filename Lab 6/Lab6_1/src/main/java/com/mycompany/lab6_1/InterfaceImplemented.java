
package com.mycompany.lab6_1;
public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display() {
        // Changing the value of x inside the implementation of the display() method
        x = 20; // This will cause a compilation error
        System.out.println("Value of x inside display(): " + x);
    }

    public static void main(String[] args) {
        InterfaceImplemented obj = new InterfaceImplemented();
        obj.display();
    }
}
