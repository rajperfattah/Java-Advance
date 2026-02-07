package Collections.com;

/*
Vector ek dynamic array hai jo thread-safe (synchronized) hota hai.

🔷 Vector ki Key Characteristics

✔ Duplicate allowed
✔ Order maintained
✔ Index-based access
✔ Synchronized (thread-safe)
❌ Performance slow (due to synchronization)

🔷 Vector Memory Concept

Vector internally array use karta hai

Jab size full hota hai → capacity double ho jati hai

[10][20][30] → full → resize → [10][20][30][ ][ ][ ]

🔷 Vector Important Methods (Theory)
Method	Use
add()	element add
addElement()	legacy add
get()	element access
remove()	delete
size()	total elements
capacity()	total storage
isEmpty()	check empty
firstElement()	first
lastElement()	last
🔷 Vector Practical Program
 */

import java.util.Enumeration;
import java.util.Vector;

public class P5_Vector {

    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(10);
        v.add(20);
        v.addElement(30);   // legacy method

        System.out.println(v);        // [10, 20, 30]
        System.out.println(v.size()); // 3
        System.out.println(v.capacity()); // 10 (default)

        System.out.println(v.firstElement()); // 10
        System.out.println(v.lastElement());  // 30


        // reading data from vector
        System.out.print("Using for loop: ");
        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }
        System.out.println();


        //Vector specific legacy method : Enumeration
        System.out.print("Using Enumeration: ");
        Enumeration<Integer> en = v.elements();
        while (en.hasMoreElements()) {
            System.out.print(en.nextElement() + " ");
        }
        System.out.println();

    }
}

