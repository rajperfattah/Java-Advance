package Collections.com;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class P8_LinkedHashSet {

    public static void main(String[] args) {

        /* ==========================================
           Creating LinkedHashSet
           Maintains insertion order
           ========================================== */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();


        /* ==========================================
           add() – Adds element to set
           Duplicate elements are ignored
           ========================================== */
        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(10);     // duplicate → ignored
        lhs.add(null);   // only one null allowed

        System.out.println("After add(): " + lhs);
        // Output: [10, 20, 30, null]
        // Explanation: insertion order maintained, duplicate ignored


        /* ==========================================
           size() – Returns number of elements
           ========================================== */
        System.out.println("Size: " + lhs.size());
        // Output: 4


        /* ==========================================
           contains() – Checks element exists or not
           ========================================== */
        System.out.println("Contains 20? " + lhs.contains(20));
        System.out.println("Contains 50? " + lhs.contains(50));
        // Output:
        // true
        // false


        /* ==========================================
           remove() – Removes specified element
           ========================================== */
        lhs.remove(20);

        System.out.println("After remove(20): " + lhs);
        // Output: [10, 30, null]


        /* ==========================================
           isEmpty() – Checks set is empty or not
           ========================================== */
        System.out.println("Is Empty? " + lhs.isEmpty());
        // Output: false


        /* ==========================================
           Iteration using for-each loop
           ========================================== */
        System.out.print("Using for-each: ");
        for (Integer i : lhs) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Output: 10 30 null


        /* ==========================================
           Iteration using Iterator
           ========================================== */
        System.out.print("Using Iterator: ");
        Iterator<Integer> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // Output: 10 30 null


        /* ==========================================
           toArray() – Converts set into array
           ========================================== */
        Object[] arr = lhs.toArray();

        System.out.print("Using toArray(): ");
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
        // Output: 10 30 null


        /* ==========================================
           clear() – Removes all elements
           ========================================== */
        lhs.clear();

        System.out.println("After clear(): " + lhs);
        // Output: []


        /* ==========================================
           isEmpty() after clear
           ========================================== */
        System.out.println("Is Empty after clear? " + lhs.isEmpty());
        // Output: true
    }
}

/*
🔷 LinkedHashSet — Definition

LinkedHashSet Java Collection Framework ki ek class hai jo Set interface ko implement karti hai.

👉 Simple words mein:

LinkedHashSet ek unique elements ka set hai jo insertion order maintain karta hai.

🔷 Key Characteristics

✔ Duplicate ❌
✔ Insertion order maintained ✅
✔ One null allowed
✔ Non-synchronized
✔ Slightly slower than HashSet
✔ Faster than TreeSet

🔷 Internal Working (VERY IMPORTANT)

LinkedHashSet internally:

HashTable + Doubly Linked List use karta hai

👉 Internally ek LinkedHashMap use hota hai.

Element → Hashing (bucket)
       → Linked List (order)


Diagram:

10 → 20 → 30 → 40


Order hamesha insert order hota hai.

🔷 LinkedHashSet Constructors
LinkedHashSet lhs = new LinkedHashSet();
LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>(16);
LinkedHashSet<Integer> lhs3 = new LinkedHashSet<>(lhs2);

🔷 LinkedHashSet Important Methods (Theory + Practical)
1️⃣ add()
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(10);   // duplicate ignored
        lhs.add(null);

        System.out.println(lhs);
    }
}


Output

[10, 20, 30, null]

2️⃣ remove(), contains()
lhs.remove(20);
System.out.println(lhs.contains(10));

3️⃣ size(), isEmpty()
System.out.println(lhs.size());
System.out.println(lhs.isEmpty());

4️⃣ Iteration
for-each loop
for (Integer i : lhs) {
    System.out.print(i + " ");
}

Iterator
Iterator<Integer> itr = lhs.iterator();
while (itr.hasNext()) {
    System.out.print(itr.next() + " ");
}

5️⃣ clear()
lhs.clear();
System.out.println(lhs);

🔷 LinkedHashSet vs HashSet vs TreeSet
Feature	HashSet	LinkedHashSet	TreeSet
Order	❌	✅ (Insertion)	✅ (Sorted)
Duplicate	❌	❌	❌
Null	One	One	❌
Performance	Fastest	Medium	Slow
 */