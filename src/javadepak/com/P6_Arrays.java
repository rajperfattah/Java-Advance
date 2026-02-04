package javadepak.com;

public class P6_Arrays {
    public static void main(String[] args) {
        //Arrays:Are the collection of similar data types which can store multiple records at once using index numbers
        /*
        // Array decleration.
        int []a;
        int [] b;
        int c[];
        int d [];

        // Array creation.
        a=new int[4];
        b=new int[8];
        c=new int[90];
        d= new int[10];

        //Array declearation and creation together.

        String[] names= new String[10];


        // Can we have Array with 0 size .
        //Yes we car declare and create array with size 0, it will be compiled and will be able to run

        int [] array=new int[0];

        // can we have Array with negative size.
        // No array with nagitive size will through exceptional error after execution/run
        // NegativeArraySizeException.
        int[]ar=new int[-10];


        // Declaration, creation and initilization of array at once.
        int [] a1={10,20,30};

         */
/*
        // Retriving values of 1D array
        //Method :1: using for loop

        int []a={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" : ");
        }
        //Method 2 : using for each loop

        String[]names={"Abdul Fattah","Abdul Rauf","Abdul Kabeer","Abdul Kareeem","Abdul Ghaffar"};
        for (String e:names){
            System.out.println(e);
        }

 */

        /*
        // retriving elements of 2D array
        int [][]a={{10,20,30,40},{50,60},{70,80,90}};
        System.out.println(a[0][0]);
        System.out.println(a[0][1]);
        System.out.println(a[0][2]);
        System.out.println(a[0][3]);

        System.out.println("_______________");

        System.out.println(a[1][0]);
        System.out.println(a[1][1]);

        System.out.println("_______________________");

        System.out.println(a[2][0]);
        System.out.println(a[2][1]);
        System.out.println(a[2][2]);
        System.out.println("__________");


        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(a[1].length);
        System.out.println(a[2].length);
//        System.out.println(a[0][0].length); error

        int [][]b={{10,20,30,40},{50,60},{70,80,90}};

        for (int i=0;i<b.length;i++){
            for (int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

         */

        // ------ Anonymous Array--------------------
        // Array which does not have any name.
        // jb hamy array achanak instantly aik bar use krna per jai kahen pr , to tab e create keya jata h anonymous array

        //eg: int[] a=new int[]{1,2,3,4}  this is common array we use

        // new int []{1,2,3,4}; this is anonymous array


        //eg1:
        sum( new int []{10,20,30,40});// anonmyous array of 1D array

        //eg2:
        sum2(new int[][]{{10,20},{30,40}} );// 2D anonymous array





    }



    //Anonymous 2D array creation
    public static void sum2(int [][] n1){
        int total1=0;
        for (int[] i :n1){
            for (int j:i){
                total1=total1+j;
            }
        }
        System.out.println(total1);
    }


    // anonymous 1D array creation
    public static void sum(int [] n){
        int toltal=0;
        for (int e:n){
            toltal=toltal+e;
        }
        System.out.println(toltal);

    }

}

