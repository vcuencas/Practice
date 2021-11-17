package Practice;

import java.util.Scanner;

public class ComputeArea {
    public static void main(String[] args) {
        // Variables
        double radius, area;
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        // Prompts the user to input a value
        System.out.print("Enter the radius: ");

        //Obtain the radius
        radius = input.nextInt();

        // Compute the area
        area = PI * radius * radius;

        // Print results
        System.out.println("The area of a circle with radius " + radius +
                " is " + area);
    }
}
