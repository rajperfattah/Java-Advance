package ExceptionalHandling.com;

public class P3_FinallyBlock {
    public static void main(String[] args) {
        //finally block is used to execute important code whether an exception occurs or not.
        // try=risky code
        // catch = handling code
        // finally =clean up code
        try {
            int a = 10 / 2;
            System.out.println(a);
        }
        catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e);
            System.out.println("Error occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
