package javadepak.com;

public class P2_Variables
{

    int a=10;
    static  int b=20;

    public static void main(String[] args) {
        // Variables: Variables are containers which store the date , same like daily life stroing the stuff we need contanere like suger, ghee stroing contaiers
        // this value can be chaged dring execution time
        // variables are of three type 1-local variable, 2-static variable , instance variable

        /*1-local variable: theese  are variable wihch are declared inside a function, constructor , or any block of code
        Scope: its scope is always inside the method ,constructor or block.
        allocation: when block , fnction, constructor is executed then this variable will be allocated with memory, and when execution finished , his allocation will exit
        memory sotre: this variable stores memory in Stack.
        Default value: it does not have any default value, value should be provide before use of loval variable.
        Access specifier: we can not use access specifier with local variable.

        eg:
        int add (){
        int a=10;// local variable
        int b=20;// local variable
        system.out.print(a+b)
        }

         */


        /* Instance variable: this is the variable used in a class , which can be used throughout whole class including methods, constructors and blocks.
        scope:Used on whole class, blocks, methods , constructors etc.
        Memory allocation:When object is created variable is allocated.
        Stored memory: Heap memory.
        Default value: it contain default value , like boolean false, integeral 0, and object null.
        Access Specifier: we use access specifier with instant variable like public , private .
        Call: if it is going to be used in static method then we will call it in static method by creating object of that class then by object reference this varable is accessable.

        eg:

        int a=10;

        int add(){
        int b=30;
        sout(a+b);// can be used easily
        }

        int subtract(){
        int c=5;
        sout(a-c);// also it can be used here
        }

        // using with static method.

        public static int multiply(){
        int d=4;
        int res= d*a; // we can not access directly instant variable in static method, so we will create object reference.

        P2_variables obj=new P2_variables();
        int res= d* obj.a;
        sout(res);
        }
         */

        /* static variale:A static variable is a variable that belongs to the class, not to individual objects.
  Belong to class, not object
✔ Single memory allocation
✔ Can be accessed using class name
✔ Created when class is loaded
✔ Used for common values (e.g. company name, college name)
Store data in non heap memor

         */

         P2_Variables obj1=new P2_Variables();
        System.out.println("instance variale "+obj1.a);
        System.out.println("static variable "+obj1.b);

        obj1.a=1000;
        obj1.b=2000;
        //System.out.println(P2_Variables.b); just with class name
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        P2_Variables obj2=new P2_Variables();
        System.out.println(obj2.a);
        System.out.println(obj2.b);


    }
}
