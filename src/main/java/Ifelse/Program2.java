package Ifelse;

import java.util.Scanner;
//2.Write a program to calculate CGPA and find grade from 4 subjects (GPA will based upon your university)
public class Program2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please,enter your gpa of Database Management system");
        double gpa1 = input.nextDouble();
        System.out.println("Please,enter your gpa of Assembly language");
        double gpa2= input.nextDouble();
        System.out.println("Please,enter your gpa of theory of computation");
        double gpa3 = input.nextDouble();
        System.out.println("Please,enter your gpa of Chemistry");
        double gpa4 = input.nextDouble();
        double sum=gpa1+gpa2+gpa3+gpa4;
        double cgpa=sum/4;
        System.out.println(cgpa+" is your cgpa");
        if (cgpa==4.00){
            System.out.println("Your Grade is A");
        }
        else if (cgpa<4.00 && cgpa>=3.00){
            System.out.println("your grade is B");
        }
        else if (cgpa<3.00 && cgpa>=2.50){
            System.out.println("your grade is B");
        }
        else if (cgpa<2.50 && cgpa>=2.00){
            System.out.println("your grade is B");
            }
        else {
            System.out.println("You are failed");
        }
        }
    }