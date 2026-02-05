package javadepak.com;

public class P9_Methods {
    public static void main(String[] args) {
/*A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.

// any method declared in the class must be called in the main method.

 */
        /*--------------------------------------------------------------
        // example:

        // method call will be always in main method---------
        myMethod();// calling for first time
        myMethod();// calling for second time


    }

    // Method declaration:-----------
    public static void myMethod(){
        System.out.println("I am abdul fattah");
    }

        -------------------------------------------------------------------- */

// Parameter:Parameter: Function definition me likha gaya variable jo value receive karta hai
// eg:function add(a, b) { }   // a, b → parameters

 // Argument:function call ke waqt function ma de jany wale actual walue jo pass ke jati hy
 //eg:add(5, 3);               // 5, 3 → arguments

        //Note that when you are working with multiple parameters,
        // the method call must have the same number of arguments as
        // there are parameters, and the arguments must be passed in
        // the same order.
// Example:
        myMethod("Abdul");



// return type example call.
for (int i=1;i<=5;i++){
    System.out.println("Double of "+i+ " is "+doubleGame(i));
}

    }
    public static void myMethod(String fname){
        System.out.println(fname+" : how are you");
    }

    // return example---------

    public static int doubleGame(int n){
        return n*2;
    }
}