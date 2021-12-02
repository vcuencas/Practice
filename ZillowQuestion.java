package Practice;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZillowQuestion {
    /*
Given a string contains only digits, return the new string by reversing the order
of even numbers in the input string and keeping the odd numbers at the original place.

Example 1:
Input:  “1234”
Return: “1432”

strRedo = "13"
queue.pop

Example 2:
Input:  “12346”
Return: “16342”


Example 2:
Input:  “123456”
Return: “163452”
*/
    static String ReverseEvenNums(String original) {
            // first do a for loop that recognizes and saves all the even numbers
            //long intVersion = Integer.valueOf(original);
            int[] integerArray = new int[original.length()];

            for (int i = 0; i < original.length(); i++) {
                integerArray[i] = Integer.valueOf(original.charAt(i)) - 48;
            }

//            for (int i = 0; i < integerArray.length; i++) {
//                System.out.println(integerArray[i]);
//            }

            Stack<Integer> evenNumbers = new Stack<Integer>();
            String stringRedo = "";

            for (int i = 0; i < original.length(); i++) {
                if (integerArray[i] % 2 == 0) {
                    evenNumbers.push(integerArray[i]);
                }
            }
            for (int i = 0; i < original.length(); i++) {
                if (integerArray[i] % 2 == 1) {
                    // odd
                    stringRedo += Integer.toString(integerArray[i]);
                }
                else {
                    // even
                    stringRedo += Integer.toString(evenNumbers.pop());
                }
            }

            return stringRedo;
        }

        public static void main(String[] args) {
            String number = "123456";

            String result = ReverseEvenNums(number);
            System.out.println(number);
            System.out.println(result);
        }
    }

