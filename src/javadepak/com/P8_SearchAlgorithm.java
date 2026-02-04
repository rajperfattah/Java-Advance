package javadepak.com;

import java.util.Scanner;

public class P8_SearchAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // linear search:Linear Search is a searching technique that checks each element one
        // by one until the required element is found or the list ends.
        // liner search for integer search.

        /*
        int []intArray={3,4,2,77,8,45,0};
        boolean isPresent=false;
        System.out.println("Enter number to search:");
        int n=sc.nextInt();
        for (int i=0;i<intArray.length;i++){
            if (intArray[i]==n){
              isPresent=true;
              break;
            }

        }
        if (isPresent){
            System.out.println(n+" is present in array");
        }
        else {
            System.out.println(n+" : is not present in array");
        }

         */

        /*
        // linear searsh for strings.
        String []strArray={"banana","orange","mango"};
        System.out.println("enter item to search");
        String item=sc.next();
        boolean isPresent=false;
        for (int i=0;i<strArray.length;i++){
            if (strArray[i].equalsIgnoreCase(item)){
                isPresent=true;
                break;
            }
        }
        if (isPresent){
            System.out.println(item+" : is present in list ");
        }
        else {
            System.out.println(item+" : is not present in list");
        }

         */


        /*
        // binary serch:Binary search me data ko
        // aadha aadha divide karke element dhoonda
        // jata hai (sirf sorted array me).

        int[] a={2,5,7,9,12,14,16,17,20,24,28};
        System.out.println("Enter number to search");
        int n=sc.nextInt();
        int li=0;
        int hi=a.length-1;
        int middle=(li+hi)/2;

        while (li<=hi) {
            if (a[middle] == n) {
                System.out.println(n+"Element is present at : " + middle + " index position");
                break;
            } else if (a[middle] < n) {
                li = middle + 1;
            } else {
                hi = middle - 1;
            }
            middle = (li + hi) / 2;
        }
        if (li>hi){
            System.out.println("Element is not present in array");
        }

         */

        /*
        // finding maximim  number in the array list.
        int []arr={2,3,6,3,990,435,6,0,11,23};
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max value is : "+max);

        // finding minimum value form array.

        int min=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min value is : "+min);

         */


        /*
        // finding second larges number in list.
        int []ar={2,35,23,4,6,78,9,0};
        int temp;
        for (int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                if (ar[i]<ar[j]){
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        System.out.println("second largest number is : "+ar[1]);


         */

        // largest element at nth position.

        int[]a={3,5,7,3,6,8,9,0,88,6,33,6,755};
        System.out.println("enter index position ");
        int k=sc.nextInt();
        int temp;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
            if (i==k-1){
                System.out.println(a[i]);
                break;
            }
        }


    }
}
