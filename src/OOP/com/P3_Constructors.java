package OOP.com;

public class P3_Constructors {
    public static void main(String[] args) {
        // constructor is a block similar to method , having same name as that of class name .
        // it is automatically called when an object is created to initilize its data.
        //Constructor ka kaam object ko initialize karna aur usay ready state me lana hota hai.


        Employee e1=new Employee("Fattah",20);
        Employee e2=new Employee("Rauf",10);

        e1.shoDetail();
    }
}

class Employee{
    String name;
    int id;

    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void shoDetail(){
        System.out.println(name);
        System.out.println(id);
    }
}
