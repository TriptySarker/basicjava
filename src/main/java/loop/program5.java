package loop;

import java.util.Scanner;
//5. Take a number as input from the user. Now write a program to show table of the given numbers.
public class program5 {
    public static void main(String[] args) {
        System.out.println("Please,enter a number");
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(number+"*" +i+ "=" +number*i);
        }
    }
}
