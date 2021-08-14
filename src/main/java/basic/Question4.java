package basic;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("This is question no 4");
        Scanner input= new Scanner(System.in);
        System.out.println("Please,Enter your maximum range here:");
        double max= input.nextDouble();
        System.out.println("Please,Enter your minimum range here:");
        double min= input.nextDouble();
        System.out.println("Here is your Random Number:");
        System.out.println((int)(Math.random()*(max-min)+min));
    }
}
