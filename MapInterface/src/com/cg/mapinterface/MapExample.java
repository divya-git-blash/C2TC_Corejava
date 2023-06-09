package com.cg.mapinterface;

import java.util.Map;
import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<Integer, Student> studentMap = new HashMap<>();

        // Creating student objects
        Student student1 = new Student("John", 18, "A");
        Student student2 = new Student("Alice", 17, "B");
        Student student3 = new Student("Bob", 16, "C");

        // Adding students to the HashMap
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);

        // Displaying student information
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            int studentId = entry.getKey();
            Student student = entry.getValue();

            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + student.getName());
            System.out.println("Age: " + student.getAge());
            System.out.println("Grade: " + student.getGrade());
            System.out.println();
        }
    }
}