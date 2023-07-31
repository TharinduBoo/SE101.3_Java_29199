
package com.mycompany.cylindricalcontainermain;
public class CylindricalContainerMain {
    public static void main(String[] args) {
        double height = 5.0;
        double radius = 2.0;

        CylindricalContainer container = new CylindricalContainer(height, radius);
        double volume = container.calculateVolume();

        System.out.println("Volume of the Cylindrical Container: " + volume);
    }
}
