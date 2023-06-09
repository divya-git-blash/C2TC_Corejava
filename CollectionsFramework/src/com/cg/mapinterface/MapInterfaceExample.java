package com.cg.mapinterface;

 import java.util.Map;
import java.util.Set;



import java.util.HashMap;
import java.util.Iterator;


public class MapInterfaceExample {

	    public static void main(String[] args) {
	    	
	        Map<Integer, Student> sMap = new HashMap<>();

	      
	        Student s1 = new Student("Divya",18);
	        Student s2 = new Student("Akhila",17);
	        Student s3 = new Student( "Siri",15);

	       
	        sMap.put(1,s1);
	        sMap.put(2,s2);
	        sMap.put(3,s3);

	    
	       for (Map.Entry<Integer, Student> entry : sMap.entrySet()) {
	            int rollno = entry.getKey();
	            Student student = entry.getValue();
	            
                
	            System.out.println("Rollno: " + rollno);
	            System.out.println("Name: " + student.getName());
	            System.out.println();
	        }
	    }
}
	
	