package OOP.com;

public class P13_StaticKeyword {

    public static void main(String[] args) {
      // statisc keyword: it is non access modifier
        // used with class level variable
        // used with method
        // static with block
        // used with inner class(nested class)

       // System.out.println(a); here also not accissable
        System.out.println(Demo.a);// here it is accessable by Class name
    }
}

class Demo{
    static  int a=20;

    void show(){
        //static int b=30;// this will show error, local variable can not be static
    }
}
// static : best for memory management
/*
static keyword is used to create class-level members that belong to the class, not to objects.

Aur aur simple:

Static cheez class ki hoti hai, object ki nahi.

🔑 Uses of static keyword
1️⃣ Static variable (common for all objects)
class Student {
    static String college = "ABC College";
    String name;

    Student(String name) {
        this.name = name;
    }

    void show() {
        System.out.println(name + " - " + college);
    }
}


Output idea:
Har student ka college same hoga.

2️⃣ Static method (object ke baghair call hota hai)
class Test {
    static void display() {
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        Test.display();   // no object needed
    }
}

3️⃣ Static block (class load hote hi execute hota hai)
class Demo {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}


Output:

Static block executed
Main method

4️⃣ Static nested class
class Outer {
    static class Inner {
        void show() {
            System.out.println("Static inner class");
        }
    }
}
 */