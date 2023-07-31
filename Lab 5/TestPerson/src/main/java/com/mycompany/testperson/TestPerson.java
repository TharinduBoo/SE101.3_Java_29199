
package com.mycompany.testperson;
public class TestPerson {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Tharindu Saratha", 29199, "Software e");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer("Saratha jayakodi", 29522, "Software Engineering");
        System.out.println("\nLecturer Name: " + lecturer.getName());
        System.out.println("Lecturer ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProgramme());
    }
}
