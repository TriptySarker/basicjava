package loop;

import java.util.Scanner;
//Write a program to check balance and withdraw money from ATM booth using switch case and if else
public class Program4 {
    public static void main(String[] args) {
        int balance=50000;
        int pin=1456;
        System.out.println("please, enter any key :\n 1.Check balance\n 2.Withdraw balance");
        Scanner input=new Scanner(System.in);
        int option=input.nextInt();
        switch (option){
            case 1:
                System.out.println("Please,enter your Pin");
                int pin1=input.nextInt();
                if (pin1==pin){
                    System.out.println("This is balance "+balance);
                }
                else {
                    for (int i=1;i<=2;i++){
                        System.out.println("Enter wrong pin");
                        System.out.println("Please,enter correct Pin");
                        int pin2=input.nextInt();
                        if (pin2==pin){
                            System.out.println("This is balance "+balance);
                        }
                    }
                    System.out.println("\"You have entered wrong PIN more than 3 times. Card has blocked.\"");
                }
                break;
            case 2:
                System.out.println("Please,enter your pin");
                int pin2=input.nextInt();
                if (pin2==pin){
                    System.out.println("Input amount that multiply by 500");
                    int amount=input.nextInt();
                    int restamount= balance-amount;
                    if (amount%500==0){
                        if (amount<=balance){
                            System.out.println("Withdarw sucessfull.your current balance is "+restamount);
                        }
                        else {
                            System.out.println("\"Not enough balance. Please input valid amount\"");
                        }
                    }
                    else {
                        System.out.println("\"Balance is not divisible by 500. Please try with another amount\"");
                    }
                }
                else {
                    for (int i=1;i<=2;i++){
                        System.out.println("Enter wrong pin");
                        System.out.println("Please,enter correct Pin");
                        int pin3=input.nextInt();
                        if (pin3==pin){
                            System.out.println("This is balance "+balance);
                        }
                    }
                    System.out.println("you have enter wrong pin for three times. Card Has Blocked");
                }
                break;
            default:
                System.out.println("Please,Choose the given option");
                break;

        }
    }
}
