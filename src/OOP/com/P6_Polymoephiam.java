package OOP.com;

/*
public class P6_Polymoephiam {
    public static void main(String[] args) {
        //Ploymorphism:Ek hi method ya object, alag alag tarike se kaam kar sakta hai — ise polymorphism kehte hain.

        // plymorphism have two types
        //1-: method overloading (Static polymorphism) or compile time polymorphism
        //2-: method overriding (Dynamis polymorphism) or run time poly--

        //Method overloading:

       // = in same class
        //= same name of methods
        // = but differnt arguments(types,sequence , number)



        P6_Polymoephiam obj=new P6_Polymoephiam();
        obj.show();// will call method which is parameter less

        obj.show(10);// mehtod contain parameter will be called


    }
    void show(){
        System.out.println("i am with no parameter");
    }
    void show(int a){
        System.out.println("i contain 1 parameter");
    }
}

 */



// method overriding (runtime polymorphism) or dynamic poly--
public class P6_Polymoephiam {
    public static void main(String[] args) {

        Mother m=new Mother();
        m.prase();
        Fatherr f=new Fatherr();
        f.prase();
    }
}

class Fatherr{
    void prase(){
        System.out.println("Father is great");
    }
}
class Mother extends Fatherr{
    void prase(){
        System.out.println("Mother is great");
    }
}