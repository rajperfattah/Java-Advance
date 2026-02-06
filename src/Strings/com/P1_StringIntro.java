package Strings.com;

public class P1_StringIntro {
    public static void main(String[] args) {
        // string is non premtive data type , bcz its size is not fixed.
        // string is a sequence of charachters
        // String is immutable

        String s="Abdul"; // this is string object
        String s1=new String();

        // there are main three classes to create string
        //1-String:
        //StringBuffer:
        //StringBuilder:


        //STring is constant pool/ string literal pool:it is an area in
        // heap memory where string literal values are stored

        // (==) used for addressd compairsion
        // .equals() method is used for content comparision


        // string constructors:-
        /*
        public String() non parameterized constructor

        public String(String s) Single argument constructor

        public String (StringBuffer sb)

        public String(StringBuilder sb)

        public String(byte[] b)

        public String(char[] ch)
         */
String s3=new String("Abc");
// string creates immutable objects.



        // string clas methods:-
        /*
        🔑 Main String Methods in Java
1️⃣ length()

👉 String ki length batata hai

String s = "Java";
System.out.println(s.length()); // 4

2️⃣ charAt()

👉 Given index par character deta hai

System.out.println(s.charAt(1)); // a

3️⃣ toUpperCase() / toLowerCase()

👉 Case change karta hai

System.out.println(s.toUpperCase()); // JAVA

4️⃣ equals() / equalsIgnoreCase()

👉 String compare karta hai

"Java".equals("java"); // false
"Java".equalsIgnoreCase("java"); // true

5️⃣ compareTo()

👉 Lexicographical comparison

"abc".compareTo("abd"); // -1

6️⃣ contains()

👉 Check karta hai substring

"Java Programming".contains("Java"); // true

7️⃣ substring()

👉 String ka part nikalta hai

System.out.println(s.substring(1,3)); // av

8️⃣ replace()

👉 Character / word replace karta hai

System.out.println(s.replace("a","o")); // Jovo

9️⃣ trim()

👉 Extra spaces remove karta hai

String t = "  Java  ";
System.out.println(t.trim()); // "Java"

🔟 split()

👉 String ko parts me todta hai

String str = "Java is easy";
String[] arr = str.split(" ");
         */

/*
        // program to reverse a given string
        String name="Abdul";
        String res="";
        for (int i=name.length()-1;i>=0;i--){
            res=res+name.charAt(i);
        }
        System.out.println(res);

 */


/*
        // program to check string is palimdrom or not .
        String str="aba";
        String r="";
        for (int i=str.length();i>=0;i--){
            r=r+str.charAt(i);
        }
        if (r.equals(str)){
            System.out.println("String is palimdrom");
        }
        else {
            System.out.println("String is not palindrom");
        }

 */

        // WAP to print maximum and minimum occuring character
        String st="abbccc";
        int[]arr=new int[127];
        for (int i=0;i<st.length();i++){
            arr[st.charAt(i)]=arr[st.charAt(i)]+1;
        }

        int max=-1;
        char c=' ';
        for (int i=0;i<st.length();i++){
            if(max<arr[st.charAt(i)]){
                max=arr[st.charAt(i)];
                c=st.charAt(i);
            }
        }

        System.out.println("Maximum occuring character is : "+c);



    }
}
