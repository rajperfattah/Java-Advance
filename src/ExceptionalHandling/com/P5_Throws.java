package ExceptionalHandling.com;

import java.io.FileReader;
import java.io.IOException;

class P5_Throws {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt"); // risk
    }

    public static void main(String[] args) {
        try {
            readFile();   // caller handles exception
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

/*
📘 Definition

throws keyword is used to declare exceptions that a method may pass to the calling method.

Aur aur simple:

Method kehta hai: “Agar error aaya, main handle nahi karunga — caller kare.”

🔑 Key Points:

1️⃣ Method exception handle nahi karta, sirf declare karta hai
2️⃣ Mostly checked exceptions ke sath use hota hai
3️⃣ Multiple exceptions bhi declare ho sakti hain
4️⃣ Calling method ko handle karna lazmi hota hai

📌 Simple Example
import java.io.FileReader;
import java.io.IOException;

class Test {
    static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt"); // risk
    }

    public static void main(String[] args) {
        try {
            readFile();   // caller handles exception
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}

🌍 Real-world example:

Delivery boy
Bolta hai: “Issue hua to manager handle karega” 😄


difference b/w throw and throws
🔁 throw vs throws (quick)
throw	throws
Exception create karta hai	Exception declare karta hai
Method ke andar use hota hai	Method signature me
Single exception	Multiple exceptions
throw new	throws Exception
 */

