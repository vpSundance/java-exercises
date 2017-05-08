package org.launchcode.java.studios;

import java.util.Scanner;

/**
 * Created by Splodey on 5/8/2017.
 */
public class Area {
    // Prompts user for a number, and then calculate the area of a circle with that radius
    public static void main(String[] args) {
        // Create object for taking user input
        Scanner scan = new Scanner(System.in);

        // Prompt for radius - expects type double
        System.out.print("Radius: ");
        double radius = scan.nextDouble();

        // If user provides a negative number, display error message and prompt again
        while (radius < 0) {
            System.out.println("Radius must be a positive number. Idiot.");
            System.out.print("Radius: ");
            radius = scan.nextDouble();
        }

        // Print area of circle with specified radius
        System.out.println("Area: " + Area.getArea(radius));
    }

    public static double getArea(double radius) {
        // Returns area of a circle with the given radius
        double result;

        // Calculate area of circle = pi * radius^2
        result = Math.PI * Math.pow(radius, 2);

        // Return area
        return result;
    }
}
