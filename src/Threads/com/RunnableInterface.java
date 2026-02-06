package Threads.com;

// better way to implement interface rather than thread class
public class RunnableInterface implements Runnable {
    public void run() {
        System.out.println("Hellow dear");
    }

    public static void main(String[]args){
        RunnableInterface r=new RunnableInterface();
        Thread t=new Thread(r);
        t.start();

    }
}
