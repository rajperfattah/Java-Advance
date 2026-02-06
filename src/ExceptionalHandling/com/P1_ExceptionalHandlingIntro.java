package ExceptionalHandling.com;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;

public class P1_ExceptionalHandlingIntro {
    public static void main(String[] args) {
       //Exception:Unexpected event which occurs during the execution of
        // program i-e at run time, that disrups normal flow of progran

        //Exception handling is a mechanism to handle runtime errors so that the normal flow of the program does not crash.
        // just an alternative way to keep runnig program flow
      /*  System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println(100/0);// her it will break and throw exceptio (ArithmeticException)
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");

       */

        // exception hierarchy:
        // parent class is Throwable which contains two sub parts 1 exception and 2 error
        //1-:exception:
        // program ke runtime problem
        // handle ke jasakti hy
        // program recover hosakta hy
        // try-catch se handle hoti hy
        // exception have two types 1-checked(compile time) 2- unchecked(runtime exception)

        /*1-:CheckedException(compile time ):Checked exceptions are exceptions that are
         checked by the compiler at compile time and must be handled.

        Examples of Checked Exceptions:

            IOException
            FileNotFoundException
            SQLException
            ClassNotFoundException

         */

        /*
        2-:UncheckedException:runtime exception:Ye exceptions runtime par aati hain, compiler pehle warn nahi karta.
        Common Unchecked Exceptions:

        ArithmeticException
        NullPointerException
        ArrayIndexOutOfBoundsException
        NumberFormatException

         */



        //2-: Error:
        // system ke serious problem hoti hy
        // normally handle nahi hoti
        // program crash hojata hy
        // try-catch se handle nahi hoti
        // error is only of one type (runtime / uncheked exception)

    }
}


class Test{
    public static void main(String[] args){
        System.out.println("compile time exception");

        try {
            FileInputStream fis=new FileInputStream("d:/abc.txt");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
