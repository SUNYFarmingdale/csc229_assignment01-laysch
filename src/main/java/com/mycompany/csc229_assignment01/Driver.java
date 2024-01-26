
package com.mycompany.csc229_assignment01;

/**
 *
 * @author MoaathAlrajab
 */
public class Driver {

    public static void main(String[] args) {

        // Create a Course object using the default constructor
        Course course1 = new Course();

        // Set its properties
        course1.setId(12012);
        course1.setName("Mooath");
        course1.setCode("CSC229");

        // Print the course details
        System.out.println("Course 1:");
        System.out.println("ID: " + course1.getId());
        System.out.println("Name: " + course1.getName());
        System.out.println("Code: " + course1.getCode());

        // Create another Course object using the overloaded constructor
        Course course2 = new Course(12012, "Mooath", "CSC229");

        // Print the course details
        System.out.println("\nCourse 2:");
        System.out.println("ID: " + course2.getId());
        System.out.println("Name: " + course2.getName());
        System.out.println("Code: " + course2.getCode());
    }
}
