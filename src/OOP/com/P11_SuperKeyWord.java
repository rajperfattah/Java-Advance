package OOP.com;

public class P11_SuperKeyWord {
    public static void main(String[] args) {
//super keyword:Parent class ki cheezon ko access karne ke liye super use hota hai.

        B b=new B();
        b.show(30);// will print 30

        // b.show(this.i); will print 20

        // b.show(super.i); will print 10



    }
}

class A{
    int i=10;

}
class B extends A{
    int i=20;
    void show(int i){
        System.out.println(i);
    }
}
/*
Definition

super keyword is used to refer to the immediate parent class object.

Aur aur simple:

Parent class ki cheezon ko access karne ke liye super use hota hai.

🔑 Main uses of super keyword
1️⃣ Parent class ke instance variable access karne ke liye
class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(x);        // child variable
        System.out.println(super.x);  // parent variable
    }
}

2️⃣ Parent class ka method call karne ke liye
class Parent {
    void display() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child method");
        super.display();   // calls parent method
    }
}

3️⃣ Parent class ka constructor call karne ke liye
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();   // calls parent constructor
        System.out.println("Child constructor");
    }
}

 */