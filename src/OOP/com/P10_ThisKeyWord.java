package OOP.com;

public class P10_ThisKeyWord
{
    public static void main(String[] args) {
        // this keyword:Jo object abhi kaam kar raha hota hai, this usi ko refer karta hai.

        // jb instance variable ka or local variable ka naam same hota
        // hy to ham this use krty hy taky wo currnt instace variable ko
        // pehchan saky.

// this here refering instance variable
        Test1 t=new Test1();
        t.setValue(10);
        t.show();

    // this here invoking constructor to another constructor
     Test2 t2=new Test2();
    }
}
class Test1{
    int i;
    public void setValue(int i){
        this.i=i;// here this refer to the currunt class reference variable
    }
    void show(){
        System.out.println(i);

    }
}

class Test2{
    // this used to invoke constructor
    Test2(){
        this(5);// here it calls the parameterized constructor first

        System.out.println("this is no parameterized constructor");
    }

    Test2(int a){

        System.out.println("This is parameterized constructor");
    }
}
// this keyword can be passed as a argument in the method