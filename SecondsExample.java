package src;

import java.util.Scanner;

public class SecondsExample {
    public static void main(String[] args) {
        // Variables
        Scanner input =  new Scanner(System.in);
        int minutes, seconds, totalSeconds;

        // Obtain total seconds
        System.out.print("Enter an integer for the total seconds: ");
        totalSeconds = input.nextInt();

        // Calculate minutes and seconds
        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;

        // Display results
        System.out.println(totalSeconds + " seconds is " + minutes + " minutes and "
        + seconds + " seconds.");

    }
}