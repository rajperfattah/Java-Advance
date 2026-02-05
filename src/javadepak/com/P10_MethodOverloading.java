package javadepak.com;

public class P10_MethodOverloading {
    public static void main(String[] args) {
        //Method overloading:Method Overloading is a concept in Java where
        // multiple methods have the same name but different
        // parameters (number, type, or order).


        // calling all overloaded methods.
        var result1=addNums(10);
        var result2=addNums(10,20);
        var result3=addNums(10,20.4,30.7);

        System.out.println("single parameterized function result : "+result1);
        System.out.println("double parameterized function result : "+result2);
        System.out.println("Triple parameterized function result : "+result3);


    }
    // here is a example with multiple methods of same name  just with the difference of parameters
    static int addNums(int a){
        return a+2;
    }
    static int addNums(int a,int b){
        return a+b;
    }
    static double addNums(double a, double b, double c){
        return a+b+c;
    }
}
