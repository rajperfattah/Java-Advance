package javadepak.com;

import java.util.Scanner;

public class P3_ConditionalStatements
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Conditional STatements: are the statements which control the flow of program according to the execution
       /* // method 1 : use of if , else if and else
        int a=10;

        int b=440;
        int c=30;

        if (a>b && a>c){
            System.out.println(a+"   : is greater");
        }
        else if (b>a && b>c){
            System.out.println(b+ " : is greater");
        }
        else {
            System.out.println(c+" : is greater");
        }

        */

        /*
        // method 2: use of nasted if-else
        int a=5;
        int b=10;
        int c=15;

        if (a>b){
            if (a>c){
                System.out.println(a+" : is greater");
            }
            else {
                System.out.println(c+" : is greater");
            }
        }
        else if (b>c){
            System.out.println(b+" : is greater");
        }
        else {
            System.out.println(c+" : is greater");
        }

         */

        /*
        // find that given number is even or odd
        int n=90;
        if (n%2==0){
            System.out.println(n+" : is even number");
        }
        else {
            System.out.println(n+" : is odd number");
        }

         */

        /*
        // write a program to print add numbers upto n numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to print odd numbers upto that");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){

            if (i%2==0){
                continue;
            }
            System.out.println(i);
        }

         */


        // write a program to print even numbers upto n numbers.

        System.out.println("Enter number to print even numbers upto that");
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){

            if (i%2==0){
            System.out.println(i);            }

            }



        // write a program for leap year
        /* method1:
        System.out.println("Enter year to find it is leap year or not");
        int year=sc.nextInt();
        if (year%4==0){

        if (year%100==0){
          if (year%400==0){
              System.out.println(year+" : is  a leap year");
          }
          else {
              System.out.println(year+" : is not a leap year");
          }
        }
        else {
            System.out.println(year+ " : is a leap year");
        }
        }
        else {
            System.out.println(year+" : is not a leap year");
        }

         */

        /*
        // method 2:
        System.out.println("Enter year to check");
        int year=sc.nextInt();
        if ((year%400==0) || (year%4==0 && year%100 !=0)){
            System.out.println(year+" : is a leap year");
        }
        else {
            System.out.println(year+" : is not a leap year");

        }

         */

        /*
        // program to swip two numbers, with  third variable.
        int a=10;
        int b=20;
        int t;
        System.out.println(" Before sweping");
        System.out.println("a: "+a);
        System.out.println("b : "+b);
        t=a;
        a=b;
        b=t;
        System.out.println("After sweping");
        System.out.println("a: "+a);
        System.out.println("b : "+b);

         */

        /*
        // program to swip two numbers, without  third variable.
        int a=10;
        int b=20;
        System.out.println(" Before sweping");
        System.out.println("a: "+a);
        System.out.println("b : "+b);
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After sweping");
        System.out.println("a: "+a);
        System.out.println("b : "+b);

         */

        /*
        // create a calculator using switch case.

        String op;


        do {
            System.out.println("Enter first number");
            double n1=sc.nextDouble();
            System.out.println("Enter second number");
            double n2=sc.nextDouble();
            System.out.println("for addition Press + ");
            System.out.println("for subtraction Press - ");
            System.out.println("for Multiplication Press * ");
            System.out.println("for Division Press / ");
            char sign = sc.next().charAt(0);
            switch (sign) {
                case '+':
                    System.out.println("Sum is : " + (n1 + n2));
                    break;
                case '-':
                    System.out.println("Subtraction is : " + (n1 - n2));
                    break;
                case '*':
                    System.out.println("Multiplication is : " + (n1 * n2));
                    break;
                case '/':
                    System.out.println("Division is : " + (n1 / n2));
                    break;
                default:
                    System.out.println("You have selected invalid operation");
                    break;
            }
            System.out.println("Do you want to continue ? \n press y for continue\n press any key for exit");
            op=sc.next();

        }while (op.equalsIgnoreCase("y"));

         */




    }
}
