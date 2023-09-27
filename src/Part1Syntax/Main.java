package Part1Syntax;
import java.util.Scanner;   // Import Scanner Class

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        //1.1 Declaring Variables
        int num1 = 13;
        int num2 = 7;
        double num3 = 3.14;
        double num4 = 2.7;
        char letter1 = 'e';
        char letter2 = 't';
        boolean IsAvailable = true;
        String Greeting = "Hello !";
        //1.2 Numbers operations
        int sum = num1 + num2;
        System.out.println("Addition of two numbers equals: " + sum);
        int sub = num1 - num2;
        System.out.println("Subtraction of two numbers equals: " + sub);
        double mul = num3 * num4;
        System.out.println("Multiplication of two numbers equals: " + mul);
        double div = num3 / num4;
        System.out.println("Division of two numbers equals: " + div);
        //1.3 String operations
        System.out.println("Contains letter e: " + Greeting.contains("e"));
        System.out.println("Contains letter f: " + Greeting.contains("f"));
        System.out.println("Letter at first position: " +Greeting.charAt(0));
        System.out.println("Letter at second position: " + Greeting.charAt(1));
        System.out.println("Length of greeting: " +Greeting.length());
        System.out.println("Transform all letters to lower case: " + Greeting.toLowerCase());
        System.out.println("Transform all letters to upper case: " + Greeting.toUpperCase());
        //1.4 Input/Output
        Scanner in = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = in.nextLine();
        System.out.println("Your name is: " + name);
        //1.5 Comment types
        //Simple comment line
        /* Comment with begin and end */
        /** Adding some color for your comment */
        //1.6 Debugger
        int deb = num1 + num2;
        deb = 14;
        deb = 16;
        //1.7 Errors messages
        //int a = 15
        //String Eror = "Error";
        // System.out.println("Error: ";









    }
}

