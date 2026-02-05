package OOP.com;

public class P2_Birds {


    public static void main(String[] args) {

        Birds dove=new Birds();
        dove.fly();
        System.out.println();

        // method 1 : initilizing by using reference variable
        dove.color="black";
        dove.age=8;

        System.out.println(dove.color);
        System.out.println(dove.age);
        System.out.println("vehicle detail-------------------");
        Vehivles cars=new Vehivles();
        cars.setValues("Mehran",2020,4000000.0);
        cars.display();
    }
}
class Birds{
    String color;
    int age;
    public void fly(){
        System.out.println("Birds are flying---");
    }
}


// initilizing values using methods
class Vehivles{
    String name;
    int year;
    double price;
public void setValues(String n, int y,double p){
    name=n;
    year=y;
    price=p;
}
// displaying values
    public void display(){
        System.out.println("name : "+name);
        System.out.println("year : "+year);
        System.out.println("Price: "+price);
    }


}
