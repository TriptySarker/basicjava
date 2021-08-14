package basic;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("This is Question No.3:");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first number:");
        double number1= input.nextInt();
        System.out.println("Enter your second number:");
        double number2= input.nextInt();
        System.out.println("Enter your third number:");
        double number3= input.nextInt();
        double sum= number1+number2+number3;
        System.out.println("This is the sum:"+sum);
        double avg= sum/2;
        System.out.println("This is the average:"+avg);
    }
}
