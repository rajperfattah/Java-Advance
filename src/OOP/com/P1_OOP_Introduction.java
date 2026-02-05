package OOP.com;

public class P1_OOP_Introduction {
    public static void main(String[] args) {
        //OOP: object oriented programming: it is a method or style to solve a problem,
        // it contains 6 main pillers: //small talk is pure first oop language
        /*
        1-:Classes
        2-: Objects and methods
        3-: inheritance
        4-: Abstraction
        5-: Polymorphism
        6-: Encapsulation
         */

        /*
        //Classes:Class ek naqsha hota hai jisse objects bante hain. collection of objects | it is not a ral world entity, it does not occupy memory
        eg: Animal , Birds , Vehicals

        // Object:Class se banne wali cheez ko object kehte hain, jisme data aur kaam dono hotay hain.


        // Methods:Method object ka kaam (behavior) batata hai.

         */

        P1_OOP_Introduction dog=new P1_OOP_Introduction();
        dog.eat();
        dog.ru();
        dog.showName();


    }
    public void eat(){
        System.out.println("Dog is eating --------");
    }
    public void ru(){
        System.out.println("Dog is running-----");
    }
    public String name(String n){
        return n;
    }

    public void showName(){
        String dname="Tommy";
        System.out.println("Dog name is : "+name(dname));
    }
}
