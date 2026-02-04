package javadepak.com;

import java.util.Scanner;

public class P7_ArrayPrograms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
    // Program1: wirite a program to retrive values from 1D arra
        int []a={1,2,3,4,5,6,7};
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

         */

        /*
        // Program2: WAP to retrive values from 2D array.
        int[][]a={{1,2,3},{4,5,6,7}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
//            System.out.println();
        }

         */

        // Sorting: sorting is the process of arranging the data in some logical order.
        // in case of numeric values, logical order may be in ascending or descending order
        // sorting types:
        //1-: Bubble sort
        //2-: Selection Sort
        //3-: Insertion Sort
        //4-:Merge Sort
        //5:- Quick Sort
        //6:- Heap Sort

        /*
        1:- Bubble sort:---------------------------------------------------------------------------
        Bubble Sort is a sorting method where we compare two nearby numbers and swap them if they are in the wrong order.
        We repeat this process again and again until the list becomes sorted.

        eg: 36 19 29 12 5
        Round1: 19 36 29 12 5
                19 29 36 12 5
                19 29 12 36 5
                19 29 12 5 36

       Round2:  19 12 29 5 36
                19 12 5 29 36

      Rouund3:  12 19 5 29 36
                12 5 19 29 36

      Round4:   5 12 19 29 36

      Note that : number of rounds will always be
        No Rounds= (total number of elements)-1
        No Rounds= 5-1=>4

        like in this example elements in array were 5 , but rounds to sort are 4.

         */
        /*
        // WAP to sort a interger Array.
        int []a={36,19,29,12,5};
        int temp;
        int flag=0;
        for (int i=0;i<a.length;i++){// for number of rounds
            for (int j=0;j<a.length-1-i;j++){// for elements
                if (a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if (flag==0){
                break;
            }

        }

        for (int e:a){
            System.out.print(e+" ");
        }

         */

        /*
        // WAP to sort a String Array.
        String[] a = {"Fattah","Kabeer","Ghaffar","Rauf","Kareem","Baba jani"};
        String temp;
        int flag;

        for (int i = 0; i < a.length; i++) {   // rounds
            flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {  // elements
                if (a[j].compareTo(a[j + 1]) > 0) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        for (String e : a) {
            System.out.print(e + " ");
        }

         */

        /*
        2:- Selection Sort:----------------------------------------------------------------------------------
                          Selection sort mein hum har baar
                          sab se chhota element choose karke uski
                          jagah fix kar dete hain.

             Selection sort is combination of searching and sorting

             eg: 38 52 9 18 6 62 13

                38 replaced by smallest 6
                6 52 9 18 38 62 13

                52 replaced by smallest 9
                6 9 52 18 38 62 13

                52 replaced by smallest 13
                6 9 13 18 38 62 52

              62 replaced by 52
              6 9 13 18 38 52 62.



             :> the algorithm maintains two subarrays in a given array
             1-> the subarray which is already sorted.
             2-> the remaining subarray which is unsorted.


             */
        /*
        // program for sorting integer array
        int []a={38,52,9,18,6,62,13};
        int temp=0;
        int min;
        for (int i=0;i<a.length;i++){
            min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j]<a[min]){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        for (int e:a){
            System.out.println(e);
        }

         */

        /*
        // program for sorting String array
        String []a={"Nayab","Fattah","Kabeer","Ghaffar"};
        String temp="";
        int min;
        for (int i=0;i<a.length;i++){
            min=i;
            for (int j=i+1;j<a.length;j++){
                if (a[j].compareTo(a[min])<0){
                    min=j;
                }
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        for (String e:a){
            System.out.println(e);
        }

         */



        /*
        3:Insertion Sort: -----------------------------------------------------------------------
          Insertion sort ek sorting method hai jisme hum ek element uthate hain aur usay pehle
          se sorted part mein uski sahi jagah par insert kar dete hain.

          eg: 5 1 6 2 4 3

         1 5 6 2 4 3
         1 5 6 2 4 3
         1 2 5 6 4 3
         1 2 4 5 6 3
         1 2 3 4 5 6

         


         */
    }
}
