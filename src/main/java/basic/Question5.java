package basic;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("This is question no 5 :");
        Scanner input= new Scanner(System.in);
        System.out.println("Please,Enter the value of 'a' here :");
        double a = input.nextDouble();
        System.out.println("Please,Enter the value of 'b' here:");
        double b = input.nextDouble();
        System.out.println(Math.pow(a+b,2));
    }
    }

