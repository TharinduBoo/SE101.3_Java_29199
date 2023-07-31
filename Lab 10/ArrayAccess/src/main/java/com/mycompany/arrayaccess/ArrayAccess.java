
package com.mycompany.arrayaccess;
public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        try {
            // Trying to access an index that is out of bounds
            int index = 10;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. The array size is " + numbers.length + ".");
        }
    }
}
