package javadepak.com;

import java.util.Scanner;

public class P5_StarPatterns
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*
        // pattern1:
        // *
        // **
        // ***
        // ****
        // *****

        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("@");
            }
            System.out.println();
        }

         */

        /*
        // pattern2:
        // *****
        // ***
        // **
        // *

        System.out.println("Enter number: ");
        int n1=sc.nextInt();
        for (int i=1;i<=n1;i++){
            for (int j=n1;j>=i;j--){
                System.out.print("@");
            }
            System.out.println();
        }

         */

        /*
        // star pattern 3:
        //*
        //**
        //***
        //****
        //***
        //**
        //*

        System.out.println("Enter number:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("$");
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            for (int j=n-1;j>=i;j--){
                System.out.print("$");
            }
            System.out.println();
        }

         */

        /*
        // pattern 4:-
        //    *
        //   **
        //  ***
        // ****

        System.out.println("Enter number : ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("$");
            }
            System.out.println();
        }

         */

/*
        // pattern 5 :-
        //****
        // ***
        //  **
        //   *

        System.out.println("Enter number :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print("&");
            }
            System.out.println();
        }

 */


        // pattern 6:
        /*
                *
               **
              ***
             ****
            *****
             ****
              ***
               **
                *
         */

        /*
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

         */


        // star pattern 7 paramid:
        /*
              *
             * *
            * * *
           * * * *
          * * * * *
         */
/*
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("Enter number:");
        int n1=sc.nextInt();
        for (int i=1;i<=n1;i++){
            for (int j=n1;j>=1;j--){
                if (j>i){
                    System.out.print(" ");
                }
                else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

 */



        //pattern 8:
        /*
        ******
         ****
          **
           *
         */
        /*
        System.out.println("Enter number :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
         */

        // pattern9 : diagonal star pattern:
       /*
           *
             *
               *
                 *
                *
               *
             *
           *
        */
        /*
        System.out.println("Enter number:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if (i>=2 && j<=i-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(" ");

            }
            for (int k=1;k<=i;k++){
//                System.out.print("*");
                if (i>=2 && k>1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

         */

        // star pattern 10;
        /*
              *
             * *
            *   *
           *      *
          *         *

         */
        /*

        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<i*2;k++){
                if (k>1&& k<(i*2)-1){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

         */
// star pattern 11:
        /*
           * * * * * *
             *     *
                *
         */
        /*

        System.out.println("Enter number: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=n;k>=i;k--){
                if (i == 1 || k == n || k == i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

         */

        /*
        // STAR Pattern 12 cross star pattern:
        System.out.println("Enter number: ");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
//                System.out.print(" *");
                if (i==j || i+j ==n-1){
                    System.out.print(" *");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

         */

        /*
        // star pattern 13: box.
        System.out.println("Enter number :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i>=2 && j>=2 && i<=4 && j<=4){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

         */

        /*
        // Number pattern 1 : --------------------------------------
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4

        System.out.println("Enter number :");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }

         */

        /*
        // Number pattern 2 : --------------------------------------
        // 1
        // 2 2
        // 3 3 3
        // 1 4 4 4

        System.out.println("Enter number :");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }

         */

        /*
        // number pattern 3 :
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5
        // 1 2 3 4 5

        System.out.println("Enter number here :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(j+" ");
                }
            }

            System.out.println();
        }

         */

        /*
        // number pattern 4:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        System.out.println("Enter numbr :");
        int n=sc.nextInt();
        int count=0;

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++){
                count=count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }

         */

        /*
        // number pattern 5:
        // 1
        // 2 1
        // 3 2 1
        // 4 3 2 1

        System.out.println("Enter number here :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

         */

        /*
        // number pattern 6:

        // 1
        // 1 2 1
        // 1 2 3 2 1
        // 1 2 3 4 3 2 1

        System.out.println("Enter number here :");
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for (int k=i-1;k>=1;k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }

         */

        /*
        // numbdr pattern 7:
        // 5 4 3 2 1
        // 5 4 3 2
        // 5 4 3
        // 5 4
        // 5

        System.out.println("Enter number : ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=n;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
         */

        /*
        // number pattern 8:
        // 1
        // 2 6
        // 3 7 10
        // 4 8 11 13
        // 5 9 12 14 15
        System.out.println("Enter number :");
        int n=sc.nextInt();


        for (int i=1;i<=n;i++){
            int no=i;
           for (int j=1;j<=i;j++){
               System.out.print(no);
               no=no+n-j;
           }
            System.out.println();
        }

         */

        /*
// number pattern 9:

        // 1 2 3
        // 4 5 6
        // 7 8 9
        // 10 11 12
        // 13 14 15

        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-2;j++){
                count=count+1;
                System.out.print(count);
            }
            System.out.println();
        }

         */
/*
        // number pattern 10:
        // 1 2 3
        // 6 5 4
        // 7 8 9
        // 12 11 10
        // 13 14 15

        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if (i%2 !=0){
                for (int j=1;j<=n-2;j++){
                    count=count+1;
                    System.out.print(count+" ");
                }

            }
            else {
                int temp=count+1;
                for (int j=count+(n-2);j>=temp;j--){
                    count=count+1;
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }

 */


    }
}
