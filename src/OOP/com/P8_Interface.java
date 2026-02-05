package OOP.com;

public class P8_Interface {
    public static void main(String[] args) {
        // interface:Interface sirf rules batata hai — implementation class karti hai.
        // it is used to achive abstraction
        // it supports multiple inheritance.
        // it can be used to loose coupling

        // interface keyword is used
        // all abstract methods incuding with public accessmodifier
        // it can contain fields
        // fields will be automatically public static final fieldName

        // in version 8 - we can create defauld concrete methods
        // we can create static method
        Test t=new Test();
        t.show();
    }
}
interface myinterface{
    void show();

//    default void run(){
//        System.out.println("Asslam o alaikum");
//    }

//    static void eat(){
//        System.out.println("Eating------");
//    }
}
interface myinterface2 {
    void sleep();
}
class Test implements myinterface,myinterface2{
    public void show(){
        System.out.println("Hi dear");
    }
    public void sleep(){
        System.out.println("I am sleeping -----");
    }
}