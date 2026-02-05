package javadepak.com;

public class P11_Recursion {
    public static void main(String[] args) {
        //Recursion:Recursion is a technique where a function calls itself to
        // solve a problem step by step.

        // method call:
        int res=sum(10);
        System.out.println(res);
    }

    // sum up numbers auto n terms using recursion
    public static int sum(int n){
        if (n>0){
            return n+sum(n-1);
        }
        else {
            return 0;
        }
    }
}

/*
Halting Condition
Just as loops can run into the problem of infinite looping, recursive methods
 can run into the problem of infinite recursion. Infinite recursion is when
 the method never stops calling itself. Every recursive method should have a
 halting condition, which is the condition where the method stops calling
 itself. In the previous example, the halting condition is when the parameter
 k becomes 0.
It is helpful to see a variety of different examples to better understand
the concept. In this example, the method adds a range of numbers between a
start and an end. The halting condition for this recursive method is when
end is not greater than start:

public class Main {
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }

  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
}


 */