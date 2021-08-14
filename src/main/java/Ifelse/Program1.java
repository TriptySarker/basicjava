package Ifelse;

import java.util.Scanner;
//1. Write a program that takes a year from user and print whether that year is a leap
        //year or not
public class Program1 {
    public static void main(String[] args) {
        System.out.println("Please,enter a year to check the leap year:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if ((year % 4 == 0) || ((year % 100 == 0) && (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        }
        else
    {
        System.out.println(year + " is not a leap year");
    }
}
}
