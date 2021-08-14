package loop;

import java.util.Scanner;
//3. Create a math quiz program. Scenario: 2 numbers will generate randomly and prompt user to input the summation of 2 numbers. If user inputs the correct summation, print "Answer is correct" and user will get 1 point. if user inputs wrong summation,  then user will get 0 point. Finally after 5 iteration, total score will be shown
public class program3 {
    public static void main(String[] args) {
        int max=10;
        int min=2;
        int point=0;
        for (int i=1;i<=5;i++){
            double input1= Math.random()*(max-min)+min;
            double input2=Math.random()*(max-min)+min;
            int num1= (int) input1;
            int num2=(int) input2;
            System.out.println("Question "+i+ ": What is the sum of "+num1+" & "+num2+" ?");
            Scanner input=new Scanner(System.in);
            int sum= input.nextInt();
            if (sum==num1+num2){
                System.out.println("correct answer");
                point++;
            }
            else{
                System.out.println("wrong answer");
            }
        }
        System.out.println("You have done an excellent job,your score is "+point+ " out of 5\nThank you." );
    }
}
