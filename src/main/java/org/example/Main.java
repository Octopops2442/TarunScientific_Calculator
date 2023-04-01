package org.example;

import java.io.*;
import java.util.Scanner;
import java.io.File;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main {
    public static void main(String[] args) throws Exception{
        boolean loop = true;
        Functions func = new Functions();
        Logger logger = LogManager.getLogger(Main.class);

        logger.log(Level.INFO, "Started the application!");

        while (loop) {
            System.out.println("**************************************************");
            System.out.println("********************WELCOME***********************");
            System.out.println("**************************************************");
            System.out.println("OPTIONS:");
            System.out.println("OPTIONS 1: ADD");
            System.out.println("OPTIONS 2: SUBTRACT");
            System.out.println("OPTIONS 3: MULTIPLY");
            System.out.println("OPTIONS 4: DIVIDE");
            System.out.println("OPTIONS 5: SQUARE ROOT");
            System.out.println("OPTIONS 6: FACTORIAL");
            System.out.println("OPTIONS 7: NATURAL LOGARITHM");
            System.out.println("OPTIONS 8: POWER FUNCTION");
            System.out.println("OPTIONS 9: EXIT");

            Scanner sc = new Scanner(System.in);
            int option = Integer.valueOf(sc.nextLine());

            switch (option) {
                case 1:
                    System.out.println("First input: ");

                    double a1 = Double.valueOf(sc.nextLine());

                    System.out.println("Second input: ");

                    double b1 = Double.valueOf(sc.nextLine());

                    System.out.println(func.Add(a1, b1));
                    break;
                case 2:
                    System.out.println("First input: ");

                    double a2 = Double.valueOf(sc.nextLine());

                    System.out.println("Second input: ");

                    double b2 = Double.valueOf(sc.nextLine());

                    System.out.println(func.Subtract(a2, b2));
                    break;
                case 3:
                    System.out.println("First input: ");

                    double a3 = Double.valueOf(sc.nextLine());

                    System.out.println("Second input: ");

                    double b3 = Double.valueOf(sc.nextLine());

                    System.out.println(func.Multiply(a3, b3));
                    break;
                case 4:
                    System.out.println("First input: ");

                    double a4 = Double.valueOf(sc.nextLine());

                    System.out.println("Second input: ");

                    double b4 = Double.valueOf(sc.nextLine());

                    System.out.println(func.Divide(a4, b4));
                    break;
                case 5:
                    System.out.println("Input: ");

                    double a5 = Double.valueOf(sc.nextLine());

                    System.out.println(func.SquareRoot(a5));
                    break;
                case 6:
                    System.out.println("Input: ");

                    int a6 = Integer.valueOf(sc.nextLine());

                    System.out.println(func.Factorial(a6));
                    break;
//                case 7:
//                    System.out.println("Input: ");
//
//                    double a7 = Double.valueOf(sc.nextLine());
//
//                    System.out.println(func.Logarithm(a7));
//                    break;
//                case 8:
//                    System.out.println("First input: ");
//
//                    double a8 = Double.valueOf(sc.nextLine());
//
//                    System.out.println("Second input: ");
//
//                    double b8 = Double.valueOf(sc.nextLine());
//
//                    System.out.println(func.Power(a8, b8));
//                    break;
                case 9:
                    logger.log(Level.INFO, "Stopping the application!");
                    loop=false;
            }
        }
    }
}
