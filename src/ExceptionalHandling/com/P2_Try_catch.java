package ExceptionalHandling.com;

public class P2_Try_catch {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c;
        System.out.println("hello");
        try {
            c=a/0;
            System.out.println(c);
        }
        catch (ArithmeticException e){// we can add general Exception class
            e.printStackTrace();// this will print all description, exception name and stack trace

            //System.out.println(e);// will only print exception name and description
            //System.out.println(e.getMessage());// this will print only descrionton of exception
            System.out.println("you can not divide with 0");
        }
    }
}

/*
📘 Definition

try-catch is used to handle runtime exceptions so that the program does not crash.

Aur aur simple:

Error aane wala code try me, aur error handle catch me hota hai.

🔑 How it works (simple flow)

1️⃣ try → risky code
2️⃣ Exception aayi → catch execute
3️⃣ Program crash nahi hota ✔

📌 Simple Example
public class Test {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;   // error
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

🧠 Output:
Cannot divide by zero

🔁 Multiple catch example
try {
    int[] a = {1, 2, 3};
    System.out.println(a[5]);
}
catch (ArithmeticException e) {
    System.out.println("Math error");
}
catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index error");
}
 */