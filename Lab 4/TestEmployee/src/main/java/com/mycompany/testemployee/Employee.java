package com.mycompany.testemployee;
public class Employee 
{
    private String name;
    private int age;
    private double salary;

    // Constructor to set name, age, and salary
    public Employee(String name, double salary) 
    {
        this.name = name;
        this.salary = salary;
    }
    
    // Getters and Setters for name, age, and salary
    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }

    public double getSalary() 
    {
        return salary;
    }

    public void setSalary(double salary) 
    {
        this.salary = salary;
    }
    
    // Method to calculate Bonus Amount
    public double getBonusAmount(double bonus) 
    {
        return salary + bonus;
    }
    
    
}

