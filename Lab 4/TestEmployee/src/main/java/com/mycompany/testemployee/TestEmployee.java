/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testemployee;
public class TestEmployee {
    public static void main(String[] args) {
        // Using the constructor to set values
        Employee emp = new Employee("Bogdan", 50000);

        // Getting values using getters
        String name = emp.getName();
        double salary = emp.getSalary();

        // Output
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + salary);
        System.out.println("Bonus: 10000"); // Assume Bonus is 10000

        // Calculating and displaying Bonus Amount
        double bonus = 10000;
        double bonusAmount = emp.getBonusAmount(bonus);
        System.out.println("Bonus Amount: " + bonusAmount);
    }
}

