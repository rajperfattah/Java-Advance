package javadepak.com;

public class P12_CountDownMethodRecursion {
    public static void main(String[] args) {

        count(10);

    }
    public static void count(int n){
        if (n>0){
            System.out.print(n+" ");
            count(n-1);

        }
    }
}
