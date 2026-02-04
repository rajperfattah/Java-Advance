package javadepak.com;

import java.util.Scanner;
import java.util.SortedMap;

public class P4_Loops
{
    public static void main(String[] args) {
        // Loopin/Iterative Statements: control flow structures in programming that
        // execute a block of code repeatedly as long as a specified condition remains true.

        Scanner sc = new Scanner(System.in);
        /*
        // printing multiplication table of a nmber
        System.out.println("Enter number to print multiplication table");
        int n=sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(n+"  x  "+i+"  = "+ (n*i));
        }

         */

        /*
        // factorial of a number.
        System.out.println("Enter a number to find factor");
        int n=sc.nextInt();
        int fact=1;;
        for (int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
         */

        // factorial using recursion.

        /*
        System.out.println("Enter number to find factoral");
        int n=sc.nextInt();

        System.out.println(factorial(n));

    }
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            return n* factorial(n-1);
        }

         */

        /*
        // write a program to reverse numbers.
        System.out.println("Enter number to reverse");
        int n=sc.nextInt();
        int reverse=0;
        while (n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        System.out.println("Reversed Number is : "+reverse);


         */

        /*
        // write a program to reverse a string.
        System.out.println("Enter string ");
        String name=sc.nextLine();
        int len=name.length();
        for (int i=len-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }

         */
        /*
        // checking prime number.
        System.out.println("Enter number to check it is prime or not");
        int n=sc.nextInt();
        boolean isPrime=true;
        if (n<=1){
            isPrime=false;
        }
        else {
            for (int i=2;i<=n/2;i++){
                if (n%i==0){
                    isPrime=false;
                    break;
                }
            }
        }

        if (isPrime){
            System.out.println(n+" : is prime ");
        }
        else {
            System.out.println(n+" : is not prime");
        }

         */


        /*
        // program to print all prime numbers between 1 and 100.
        for (int i = 2; i <= 100; i++) {

            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

         */



        /*
        // fibonacci series with for loop........
        System.out.println("Enter number to print fibonacci series");
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int k;
        System.out.print(a+" "+b+" ");
        for (int i=1;i<=n;i++){
           k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
        }


         */

        /*// part1.......
        // fibonacci series using recursion
        System.out.println("Enter number of terms to print fibonacci series");
        int n=sc.nextInt();
        System.out.println("Fibonacci series is : ");
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
        /* // part2...... remember this wil have to write out of main method while execution
           public static int fibonacci(int n){
        if (n==0||n==1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }

   */





        /*
        // progra to print a palindrom number: method1:-
        // ye wo number hota hy jis ko reverse krnhy k bad b nuber same ho.
        // eg: 121 , 1221, 535.
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int tem=n;
        int rev=0;
        int remi;
        while (tem!=0){
            remi=tem%10;
            rev=rev*10+remi;
            tem=tem/10;
        }
        if (n==rev){
            System.out.println(n+" : is a palindrom number ");
        }
        else {
            System.out.println(n+ " : is not a palindrom number");
        }

         */

        /*

        // program to check palandrom number: method 2 :-
        // number ko string ma convert krna.
        System.out.print("Enter number: ");
        String num = sc.next();

        String rev = "";

        for (int i = num.length() - 1; i >= 0; i--) {
            rev += num.charAt(i);
        }

        if (num.equals(rev)) {
            System.out.println(num + " : is a palindrome number");
        } else {
            System.out.println(num + " : is not a palindrome number");
        }

         */



        /*
        // write a program to check Armstorm number: method1:-
        //An Armstrong number (also known as a narcissistic number or pluperfect digital invariant) is a number that is equal to the sum of its own digits, each raised to the power of the total number of digits in the number.


    int n=sc.nextInt();
    int t1=n;
    int len=0;
    while (t1 !=0){
        t1=t1/10;
        len=len+1;

    }
  int t2=n;
//    int result1=1;
    int val1=0;
    int rem;
    while (t2!=0){
        int result1=1;
        rem=t2%10;
        for (int i=1;i<=len;i++){
            result1=result1*rem;
        }
        val1=val1+result1;
        t2=t2/10;

    }
    if (val1==n){
        System.out.println(n+" is Armstorm number");
    }
    else {
        System.out.println(n+" is not Armstorm number");
    }

         */



        /*
        // Armstorm number method 2:-
        System.out.println("Enter number : ");
        String num=sc.next();
        int sum=0;
        int len=num.length();
        for (int i=0;i<len;i++){
            int digit=num.charAt(i)-'0'; // char to int
            sum= (int) (sum+Math.pow(digit, len));
        }


        int original=Integer.parseInt(num);
        if (original==sum){
            System.out.println("Number is Armstorm");
        }
        else {
            System.out.println("Number is not Armstorm");
        }

         */


//        System.out.println("Enter number");
//        String n=sc.nextLine();
//        String rev="";
//        for (int i=n.length()-1;i>=0;i--){
//            rev=rev+n.charAt(i);
//        }
//
//        if (n.equals(rev)){
//            System.out.println("number is palandrom");
//        }
//        else {
//            System.out.println("number is not a palindrom");
//        }
       // write a program to find factotorial manuall way:








    }

    }

