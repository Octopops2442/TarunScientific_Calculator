package org.example;

import java.io.*;
import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        boolean loop = true;
        Functions func = new Functions();

        while (loop) {
            File file = new File("src/main/java/org/example/Instructions");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            Scanner sc = new Scanner(System.in);

            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
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
//                case 6:
//                    System.out.println("Input: ");
//
//                    int a6 = Integer.valueOf(sc.nextLine());
//
//                    System.out.println(func.Factorial(a6));
//                    break;
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
                    loop=false;
            }
        }
    }
}
