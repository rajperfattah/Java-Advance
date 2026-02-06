package Threads.com;


/*
//Case1:performing single task from single thread.
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

 */

/*
// case 2: performing single task from multiple threads
public class ThreadClass extends Thread {
    public void run(){
        System.out.println("Thread 1");
    }

    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();

        ThreadClass t2=new ThreadClass();
        t2.start();
    }
}

 */

//case3: performing multiple task from single threads
// this is not possible in multi threding


/*
//case4: performing multiple task from multiple threads
public class ThreadClass {

    public static void main(String[] args) {

    Mythread1 t1=new Mythread1();
    t1.start();

    Mythread2 t2=new Mythread2();
    t2.start();

    }
}

class Mythread1 extends Thread{
    public void run(){

            System.out.println("Task 1 ----");

    }
}

class Mythread2 extends Thread{
    public void run(){

            System.out.println("Task 2 ----");

    }
}

 */


// thread class constructors
// Thread()
//Thread(Runnable)
//Thread(String name)
//Thread(Runnable target,String name)
//Thread(ThreadGroup tg,String name)
//thread methods
//run()
//start()
//curruntThread()   provides thead reference
//isAlive()    returns boolean
//getName()
//setName()
//isDamen()
//setDamen(booolean b)
//getPriority()
//setPriority(int pr)
//sleep(time)
//yield()
//join()
//suspend()
//destory()
//resume()
//interrupt()
//isInterrupted()
//interrupted()

/*
//wait()
//notify()
//notifiAll
thesse all present in object class
 */


/*
//getName setName curruntThrad isAlive()
class ThreadClass extends Thread{

    public void run(){
        System.out.println("hellow");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread.currentThread().setName("Abdul");
        System.out.println(Thread.currentThread().getName());

        ThreadClass t=new ThreadClass();
        t.start();


        System.out.println(Thread.currentThread().isAlive());
    }
}
 */

/*
//Damen thread:-
//Thread which run in the background of another thread.
// it provides service to threads
// eg: garbage collector , initilizer ,spelling checker etc
// methods:1-setDemon   :- public void setDeman(boolean b)
//mehtod 2:isDeman:- public final boolean isDeman()

// we have to create damen thead befor thread call/
// we can not make main thread as a deman thread
// it inherits the properties from its parent thread


class ThreadClass extends Thread{
    public void run(){
        System.out.println("Child thread");
    }

    public static void main(String[] args) {
        System.out.println("Main thread");
        ThreadClass t=new ThreadClass();
        t.setDaemon(true);
        t.start();
    }
}

 */

/*
// thread priority:-
//Thread priority is a number that tells the CPU which thread should
// get more preference for execution. (1-10)
//min 1
// normal 5
// max 10

// public final setPriority(5)
// public final int getPriority()

class ThreadClass extends Thread{
    public void run(){
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        // main thead priority is by jvm is 5
        System.out.println(Thread.currentThread().getPriority());
        ThreadClass t=new ThreadClass();
        t.setPriority(10);
        t.start();

    }
}
 */

/*
// sleep() method:
//1-: public static native void sleep(long mili) throws InterruptedEXception
//2-: public static void sleep(long mili, int name) throws InterruptedException

class ThreadClass{
    public static void main(String[] args) throws InterruptedException {
        for (int i=1;i<=5;i++){
            System.out.println(i);
            Thread.sleep(500);
        }

        // instead of throws InterruptionException we can use try-catch

    }
}

 */
/*
// sleep exmple 2

class ThreadClass extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println(i+" : "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        t1.start();
        ThreadClass t2=new ThreadClass();
        t2.start();
    }
}

 */

/*
// yield() method:which stops the currunt executing thread and gives chance to other threads for exection

// method:- public static native void yield();

class ThreadClass extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            Thread.yield(); // give chance to other threads
        }
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass();
        ThreadClass t2 = new ThreadClass();

        t1.start();
        t2.start();
    }
}

 */

/*
// join() method:- when a thead wants to wait for another thead to complete its task we should use oin
// methods:
//1- public final void join() throws InterruptionException
//2-: public final Syncheronized void join(long ms)
//3: public final Syncheronized void join(long ms, int ns)
//Example1: main thead waitng for child thread
class ThreadClass extends Thread{
    public void run(){
        try {
            for (int i=1;i<=5;i++){
                System.out.println("Child thread "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClass t=new ThreadClass();
        t.start();
        t.join();// this is the main use of join first child thread will execute whole then main will continue from it

        try {
            for (int i=1;i<=5;i++){
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

 */

/*
//Example2: hild thread   waitng for main(first main thead execute than child thread
class ThreadClass extends Thread{
    static Thread mainThread;
    public void run(){
        try {
            mainThread.join();
            for (int i=1;i<=5;i++){
                System.out.println("Child thread "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        mainThread=Thread.currentThread();
        ThreadClass t=new ThreadClass();
        t.start();

        try {
            for (int i=1;i<=5;i++){
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

 */

/*
// thred Interrupting methods:
// Interrupt() method:
// used to interrupt an executing thread
// interrupt method only works when a thead is in sleeping or waithn state
//if a thraad is not in sleeping or waitng state , it will notmal behavior
// when we call interrupt method it throws an exception InterruptedException

// public void interrupt()
class ThreadClass extends Thread{
    public void run(){
        try {
            for (int i=1;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();
        t.interrupt();
    }
}

 */

// interrupted() : used to check either thread is interrupted or nt
// it clears the interrupted status from true to false  if thread is interrupted
//will change the result if called 2 or more times
// public static boolean interrupted()


// isinterrupted(): used to check either thead is interrupted or not (true or false)
// does not clear the interrupted status
// always same out put
//public boolean isInterrupted()


/*
// example of Interrupted()
class ThreadClass extends Thread{
    public void run(){
        try {
            System.out.println(Thread.interrupted());
            for (int i=1;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();
        t.interrupt();
    }
}

 */


// example of isInterrupted()
class ThreadClass extends Thread{
    public void run(){
        try {
            System.out.println(Thread.currentThread().isInterrupted());
            for (int i=1;i<5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();
        t.interrupt();
    }
}

