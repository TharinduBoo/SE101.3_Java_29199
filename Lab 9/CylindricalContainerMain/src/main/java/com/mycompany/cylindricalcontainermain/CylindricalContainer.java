
package com.mycompany.cylindricalcontainermain;
public class CylindricalContainer extends Container {
    public CylindricalContainer(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * getRadius() * getRadius() * getHeight();
    }
}
