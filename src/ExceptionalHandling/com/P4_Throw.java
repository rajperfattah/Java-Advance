package ExceptionalHandling.com;

import java.util.Scanner;

public class P4_Throw {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try {


            if (age < 18) {
                throw new CustomExceptionClass("Yoy are not eligible for vote");
            } else {
                System.out.println("You can vote");
            }
        }catch (CustomExceptionClass e){
            e.printStackTrace();
        }

        System.out.println("Program finished");
    }
}

class CustomExceptionClass extends RuntimeException{
    CustomExceptionClass(String msg){
        super(msg);
    }
}

/*
📘 Definition

throw keyword is used to explicitly (manually) throw an exception in a program.

Aur aur simple:

Jab hum khud error generate karna chahen, to throw use karte hain.

🔑 Key Points:

1️⃣ Single exception throw karta hai
2️⃣ Mostly custom exception ke liye use hota hai
3️⃣ throw ke baad normal code execute nahi hota
4️⃣ try-catch ke saath ya throws ke saath use hota hai


example :

public class Test {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote");
        }

        System.out.println("Eligible to vote");
    }
}

 */