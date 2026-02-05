package OOP.com;

public class P9_Encapsulation {
    public static void main(String[] args) {
// encapsulation:Encapsulation is the process of wrapping
// data (variables) and methods together into a single unit and
// restricting direct access to data
        /*
        🔑 Key Points:

1️⃣ Variables ko private banate hain
2️⃣ Access ke liye getter & setter methods use hote hain
3️⃣ Data security improve hoti hai
4️⃣ Code flexible aur maintainable hota hai
         */


        Employee1 e1=new Employee1();
        e1.setName("Abdul");
        e1.setId(30);

        System.out.println(e1.getName());
        System.out.println(e1.getId());

    }
}
class Employee1{
    private String name;
    private int id;

    public void setName(String name){
        this.name=name;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }


}
