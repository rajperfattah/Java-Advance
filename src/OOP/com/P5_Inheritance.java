package OOP.com;
/*

// disadvantage: minor change in one class effects all classes who have inherited it
public class P5_Inheritance {
    public static void main(String[] args) {
       // inheritance:Ek class apni properties aur methods dusre class se le sakti hai — isi ko inheritance kehte hain.
        // Extend keyword is must.
        // code reusability is an advance of inheritance
        // we can achieve polymorphism overriding using inhertance

        Dog d1=new Dog();
        d1.eat();
    }
}

class Animal{// parent / super class
    void  eat(){
        System.out.println("animal eats");
    }
}
class Dog extends Animal{ // child /sub class

}

 */


// inheritance types: five types
//1 - single inheritance:Aik class ke properties dosre class m inherit hote hy (single level)
//2 - multilevel inheritance: Aik class ke properties dosre class m or dosre ke tesre me or so on... (multiple levels)
//3 -hirercal inheritance: aik class se multiple classes properties inherit krty hy.

// not following 2 types are not supported in java:
//4:multiple inheritance: aik class multiple classes se properties inherit krta hy
//5 : hybrid inheritance: combination of any two inheritances.



/*
// single inheritance
public class P5_Inheritance {
    public static void main(String[] args) {

        B b1=new B();
        b1.messageB();
        b1.messageB();
    }
}
class A{
    void messageA(){
        System.out.println("i am from class A");
    }
}
class B extends A{
    void messageB(){
        System.out.println(" i am prom class A");
    }
}

 */

/*
// multilevel inheritance:
public class P5_Inheritance {
    public static void main(String[] args) {
        System.out.println("Grand father detail");
        GrandFather g=new GrandFather();
        g.gDetail();

        System.out.println("Father detail");
        Father f=new Father();
        f.fDetail();

        System.out.println("Ali Detail");
        Ali a=new Ali();
        a.gDetail();
        a.fDetail();
        a.myDetail();

    }
}
class GrandFather{
    void gDetail(){
        System.out.println(" i am Ali's grandfather ");
    }
}
class Father extends GrandFather{
    void fDetail(){
        System.out.println(" i am ali's father");
    }
}

class Ali extends Father {
    void myDetail(){
        System.out.println("I am Ali");
    }
}

 */
// hierarchical inheritance:
public class P5_Inheritance {
    public static void main(String[] args) {
Father f=new Father();
f.gDetail();
f.fDetail();

Son s=new Son();
s.sDetail();
s.gDetail();

    }
}

class GrandFather{
    void gDetail(){
        System.out.println("I am Grand father");
    }
}
class Father extends GrandFather{
    void fDetail(){
        System.out.println("I love my father");
    }
}

class Son extends GrandFather{
    void sDetail(){
        System.out.println("i love grand father ");
    }
}
