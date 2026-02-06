package Strings.com;

public class StringBuilder {

        //stringBuilder class:ther is a minor difference
        //StrigBuffer class having all syncheronized methods , for that reason it was thread safe
        // StringBuilder: class having all non syncronized methods .
        // it is mutable as StringBuilder class

    public static void main(String[] args) {

        // =========================
        // 1️⃣ String Methods
        // =========================
        String s = "Java Programming";
        System.out.println("Original String: " + s);

        // length
        System.out.println("Length: " + s.length());

        // charAt
        System.out.println("Char at 5: " + s.charAt(5));

        // toUpperCase / toLowerCase
        System.out.println("UpperCase: " + s.toUpperCase());
        System.out.println("LowerCase: " + s.toLowerCase());

        // equals / equalsIgnoreCase
        System.out.println("Equals 'java programming'? " + s.equals("java programming"));
        System.out.println("EqualsIgnoreCase 'java programming'? " + s.equalsIgnoreCase("java programming"));

        // contains
        System.out.println("Contains 'Prog'? " + s.contains("Prog"));

        // substring
        System.out.println("Substring (5,16): " + s.substring(5,16));

        // replace
        System.out.println("Replace 'Java' with 'Python': " + s.replace("Java", "Python"));

        // trim
        String t = "   Hello Java   ";
        System.out.println("Trim: '" + t.trim() + "'");

        // split
        String[] words = s.split(" ");
        System.out.println("Split words:");
        for(String w : words){
            System.out.println(w);
        }

        System.out.println("\n=========================");
        // =========================
        // 2️⃣ StringBuffer Methods
        // =========================
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Original StringBuffer: " + sb);

        // append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // insert
        sb.insert(5, " is fun");
        System.out.println("After insert: " + sb);

        // replace
        sb.replace(5, 12, "awesome");
        System.out.println("After replace: " + sb);

        // delete / deleteCharAt
        sb.delete(5, 12);
        System.out.println("After delete: " + sb);
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt: " + sb);

        // reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // charAt / setCharAt
        System.out.println("Char at 0: " + sb.charAt(0));
        sb.setCharAt(0,'G');
        System.out.println("After setCharAt: " + sb);

        // length / capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        // substring
        System.out.println("Substring (0,4): " + sb.substring(0,4));

        System.out.println("\n=========================");
        /*
        // =========================
        // 3️⃣ StringBuilder Methods
        // =========================
        StringBuilder sbd = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sbd);

        // append
        sbd.append(" World");
        System.out.println("After append: " + sbd);

        // insert
        sbd.insert(6, "Java ");
        System.out.println("After insert: " + sbd);

        // replace
        sbd.replace(6, 10, "C++");
        System.out.println("After replace: " + sbd);

        // delete / deleteCharAt
        sbd.delete(6, 9);
        System.out.println("After delete: " + sbd);
        sbd.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sbd);

        // reverse
        sbd.reverse();
        System.out.println("After reverse: " + sbd);

        // charAt / setCharAt
        System.out.println("Char at 0: " + sbd.charAt(0));
        sbd.setCharAt(0,'H');
        System.out.println("After setCharAt: " + sbd);

        // length / capacity
        System.out.println("Length: " + sbd.length());
        System.out.println("Capacity: " + sbd.capacity());

        // substring
        System.out.println("Substring (0,5): " + sbd.substring(0,5));

         */
    }
}
