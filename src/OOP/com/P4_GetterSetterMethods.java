package OOP.com;

class Student {
    // Private data members
    private String name;
    private int age;

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int a) {
        if(a > 0) {      // validation
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class P4_GetterSetterMethods {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Set data using setters
        s1.setName("Ali");
        s1.setAge(20);

        // Get data using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

