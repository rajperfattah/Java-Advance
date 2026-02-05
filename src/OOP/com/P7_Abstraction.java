package OOP.com;

public class P7_Abstraction {
    public static void main(String[] args) {
        //Abstraction:Abstraction is a detail hiding or implementation hiding and showing just main services or interfaces
        // internal functionality  hiding,

        // Abstraction acquired in java by 2 methods.
        //1->Abstract class(0-100%)
        //2->Interfaces (100%)

        //Abstract class:An abstract class is a class that cannot be
        // instantiated (object nahi ban sakta) and is used
        // to provide a base for other classes.

        // abstract method: ye wo method hota hy jis ke body nahen hote
        // abstract class: if a class which contain atleast one abstract method. it
        // it is not important to have abstract method in abstract class ,
        // but if any abstract method is included then it is must to made the class abstract
        // by putting keyword abstract front of class.
        // abstract class se koi b object nahen bn sakta
        // jb koi b class abstract class ko inherit krta hy to ,
        // os class k ander super class k sary abstract methods ke body banana compulsory hy.


        Car c=new Car();
        c.show();





    }
}

abstract class Vehicle{
    int no_of_Tyres;
  abstract void show();

}
class Car extends Vehicle{
    void show(){
        System.out.println("i am abstract class method, here i am just implemented");
    }

}
