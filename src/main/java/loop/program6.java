package loop;

import java.util.Scanner;
//Write a program to print prime numbers from 2 to n [n is a number that will be taken from user input]
public class program6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num= input.nextInt();
        for (int i=2;i<=num;i++){
            int count=0;
            for (int j=1;j<=i;j++)
            {
                if (i%j==0)
                {
                    count++;
                }
            }
            if (count==2){
                System.out.println(+i);
            }
        }
    }
}
