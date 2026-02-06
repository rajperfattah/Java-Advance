package Threads.com;

public class ThreadClass extends Thread {// first step extending Thread class
    public void run(){// second step overriding run method
        System.out.println("Hellow");
    }

    public static void main(String[] args) {
        //Method1: extending Thread class

        ThreadClass t=new ThreadClass();// third step createing thread

        t.start();// step 4 : starting thread

       // t.start(); this is not allowed to invoke thread again ,
    }
}

