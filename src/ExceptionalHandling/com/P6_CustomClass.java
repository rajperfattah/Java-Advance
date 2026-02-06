package ExceptionalHandling.com;

public class P6_CustomClass {
    public static void main(String[] args) throws UnderAgeException{


        int age=17;
        if (age<18){
            throw new UnderAgeException();
        }
    }
}

class UnderAgeException extends Exception{
    UnderAgeException(){
        super("You are under age");
    }
    UnderAgeException(String msg){
        super(msg);
    }
}