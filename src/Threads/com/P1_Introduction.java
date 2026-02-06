package Threads.com;

public class P1_Introduction {
    public static void main(String[] args) {
        //Difference  between multitasking , multiprocessing and multithreading

        // multitasking: performing multiple task at single time
        //it increases the performance of cpu
        // multitasking can be achived by Multiprocessing by multithreading
        //Multitasking is the ability of an operating system to run multiple tasks (processes) simultaneously.



        // multiprocessing:when one system is connected to multiple processors(cpu)
        //in order to complete task.
        // it is best suitable at system level


        //multithreading:executing multiple threds(small tasks) at a single time
        // used in many softwares and games.
        //animations


        //Difference between process and thread.

        //process:-
        // a program which is in executing state
        //process is heavy weitht
        // context switching takes more time
        // communication time more
        // dont share same address
        // not dependent on each other
        // no need of syncheronization
        // more resourse consumption
        // more time for creation
        // require more time for termination


        //thread:
        // it is a subpart of process
        //light weight
        // context switching takes less time
        // communication time more
        // theads share same address
        // dependent on each other
        // threads may require syncheronization
        // less resourse consumption
        // require less time for creation
        // require less time for termination




        // how to create thread
        // there are two ways to create thread        // java.lang pakage
        //1-: using (Thread) class
        //-:  using (Runnable)interface






    }
}

