package Threads.com;



// folllowing example usig threads without sycheronization , always data inconsisitancy occurs
// Syncheronization is a process by which we control the accessa bility of multiple threads to a particular shared resource

/// advantages of syncheronization:
/// 1- no data inconsistency problem
//2- no thread interference

    // Disadvantages:
    //1- increase the waiting period of threads
    //2- create performance problems

// syncheronization types:
//1-:Process syncheronization:
//2: Thread Syncheronization:

    // java.util.concrrunt : ye java k new version m update aaya hy ham is k through syncheronization achieve krty hy jis se performance pr b koi effecct nahen perta


    /*
public class SyncheronizationIntro extends Thread {
    static BookTheaterSeat b;
    int seats;
    public void run(){
    b.bookSeat(seats);
    }

    public static void main(String[] args) {
    b=new BookTheaterSeat();

    SyncheronizationIntro obj=new SyncheronizationIntro();
    obj.seats=7;
    obj.start();

    SyncheronizationIntro obj2=new SyncheronizationIntro();
    obj2.seats=6;
    obj2.start();


    }
}

class BookTheaterSeat{
    int total_Seats=10;
    public  void bookSeat(int seats){
    if (total_Seats>seats){
        System.out.println(seats+" : seats booked successfully");
        total_Seats=total_Seats=seats;
        System.out.println("Seats left "+ total_Seats);
    }
    else {
        System.out.println("Sorry seats can not be booked");
        System.out.println("Seats left "+total_Seats);
    }
    }

}
     */



    /*

// achiving syncheronization by syncheronized method
    // just using syncheronized keyword.

public class SyncheronizationIntro extends Thread {
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();

        SyncheronizationIntro obj=new SyncheronizationIntro();
        obj.seats=7;
        obj.start();

        SyncheronizationIntro obj2=new SyncheronizationIntro();
        obj2.seats=6;
        obj2.start();


    }
}

class BookTheaterSeat{
    int total_Seats=10;
    synchronized public  void bookSeat(int seats){
        if (total_Seats>seats){
            System.out.println(seats+" : seats booked successfully");
            total_Seats=total_Seats-seats;
            System.out.println("Seats left "+ total_Seats);
        }
        else {
            System.out.println("Sorry seats can not be booked");
            System.out.println("Seats left "+total_Seats);
        }
    }

}

     */

// achiving syncheronization by syncheronized Block
// syncheronized block program ka waiting tiem km kr deta hy , ye just os block m use hota hy jahan pr zarorat hote hy


public class SyncheronizationIntro extends Thread {
    static BookTheaterSeat b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();

        SyncheronizationIntro obj=new SyncheronizationIntro();
        obj.seats=7;
        obj.start();

        SyncheronizationIntro obj2=new SyncheronizationIntro();
        obj2.seats=6;
        obj2.start();


    }
}

class BookTheaterSeat{
    int total_Seats=10;
     public  void bookSeat(int seats){
        synchronized (this) {
             if (total_Seats > seats) {
                System.out.println(seats + " : seats booked successfully");
                total_Seats = total_Seats - seats;
                System.out.println("Seats left " + total_Seats);
            } else {
                System.out.println("Sorry seats can not be booked");
                System.out.println("Seats left " + total_Seats);
            }
        }
    }

}


// static syncheronization: this is used at the class level log