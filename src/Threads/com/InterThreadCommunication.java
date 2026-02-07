package Threads.com;

// Corporative thread or interthread communication mechanism is the process
// in which thread releases the lock and enter into paused state and another
// thread acquires the lock and continue to execute
// it is implemented by the following method of object class

//1- wait(): if any thread calls teh wait() method it causes the current thread to release the
//locak and waith until another thead invokes to notify () or notifyAll() method of this object ,
// or specified amount of timehas elapsed

//2- notify(): this method used to wake up a single thread and releases the
// object lock
//3- notifyAll(): this method used to wake up all threads that are in waiting state

// note ti call all these methods , thread must be inside syncheronized area
public class InterThreadCommunication {
    public static void main(String[] args) throws InterruptedException {

        TotalEarnings te=new TotalEarnings();
        te.start();
        //System.out.println("Total earning : "+te.total);
        synchronized (te){
            te.wait();
            System.out.println("Total earning : "+ te.total+" Rs");
        }
    }
}

class TotalEarnings extends Thread{
    int total=0;
     public void run(){
         synchronized (this) {
             for (int i = 1; i <= 10; i++) {
                 total = total + 100;
             }
             this.notify();
         }
    }

}
