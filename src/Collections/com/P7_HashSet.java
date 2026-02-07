package Collections.com;

import java.util.HashSet;
import java.util.Iterator;

public class P7_HashSet {
    public static void main(String[] args) {
        // hetro geneous hashset

        //HashSet hs=new HashSet(); // default capacity is 16 , load facator is 0.75

        //HashSet hs=new HashSet(1000);// inital capacity

       // HashSet hashSet=new HashSet(100,45); // inital capicity and load factor

        //HashSet<Integer> hs=new HashSet<>();// homogeneous data collection


        HashSet hs=new HashSet();

        // adding elements in hashset
        hs.add(100);
        hs.add(8.88);
        hs.add("Hellow");
        hs.add('A');
        hs.add(null);
        hs.add(true);
        hs.add(100);// duplicate value , will not be added
        System.out.println(hs);// inserion order will not be perserved , i e elements will take random position

        // removing element

        hs.remove(8.88);
        System.out.println("After removing 8.88 : "+hs);

        // contains

        System.out.println(hs.contains(null));

        // isEmpty
        System.out.println(hs.isEmpty());

        // reading objects form hashset using forEach loop

        for (Object e:hs){
            System.out.println(e);
        }

        // reading objects using iterator method

        Iterator it=hs.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

        // some extra methods
        System.out.println("Some extra methos");

        HashSet<Integer> e=new HashSet<>();
        e.add(2);
        e.add(4);
        e.add(6);
        e.add(8);

        System.out.println(e);

        HashSet<Integer> e1=new HashSet<>();
        e1.add(1);
        e1.add(3);
        e1.add(5);
        e1.add(7);
        e1.addAll(e);
        System.out.println(e1);

        // removeAll methiods
        e1.removeAll(e);
        System.out.println(e1);


        // set opertaions performing
        //Union
        HashSet<Integer> s1= new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();

        s1.add(2);
        s1.add(4);
        s1.add(3);
        s1.add(6);
        s1.add(11);
        s1.add(9);

        System.out.println("Elements of set s1 : "+s1);

        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(4);
        s2.add(5);

        System.out.println("Elements of set s2 : "+s2);

        // union
        System.out.println("union of s1 and s2 :");
        s1.addAll(s2);
        System.out.println(s1);

        // intersection
        System.out.println("Intersection of s1 and s2 :");
        s1.retainAll(s2);

        System.out.println(s1);

        // difference
        System.out.println("difference of s1 and s2: ");
        s1.retainAll(s2);
        System.out.println(s1);


    }
}

/*
🔷 HashSet — Definition

HashSet Java Collection Framework ki ek class hai jo Set interface ko implement karti hai.

👉 Simple definition:

HashSet unordered collection hai jo duplicate elements allow nahi karti.

🔷 HashSet ki Key Characteristics

✔ Duplicate ❌
✔ Order maintain ❌
✔ Only unique elements
✔ Allows one null element
✔ Non-synchronized
✔ Fast performance

🔷 HashSet ka Internal Working (Theory)

HashSet internally HashMap use karta hai.

HashSet hs = new HashSet();


Internally:

HashMap map = new HashMap();


Element → key

Dummy object → value

HashSet element → HashMap (key, PRESENT)

🔷 Hashing Concept (Very Important)

1️⃣ Object ka hashCode() call hota hai
2️⃣ Index calculate hota hai
3️⃣ equals() check hota hai
4️⃣ Agar same → duplicate ❌

🔷 HashSet Memory Structure
Bucket 0 → [10]
Bucket 1 → [null]
Bucket 2 → [30]
Bucket 3 → [20]


⚠ Order random hota hai.

🔷 Constructors
HashSet hs = new HashSet();
HashSet<Integer> hs2 = new HashSet<>(20);
HashSet<Integer> hs3 = new HashSet<>(hs2);

🔷 HashSet Important Methods (Theory + Practical)
1️⃣ add()
HashSet<Integer> hs = new HashSet<>();

hs.add(10);
hs.add(20);
hs.add(10);  // duplicate ignored
hs.add(null);

System.out.println(hs);


Output

[null, 20, 10]

2️⃣ remove()
hs.remove(20);
System.out.println(hs);


Output

[null, 10]

3️⃣ contains()
System.out.println(hs.contains(10)); // true

4️⃣ size(), isEmpty()
System.out.println(hs.size());
System.out.println(hs.isEmpty());

5️⃣ Iteration methods
Using for-each
for (Integer i : hs) {
    System.out.print(i + " ");
}

Using Iterator
Iterator<Integer> itr = hs.iterator();
while (itr.hasNext()) {
    System.out.print(itr.next() + " ");
}

6️⃣ clear()
hs.clear();
System.out.println(hs);

🔷 HashSet vs LinkedHashSet vs TreeSet
Feature	HashSet	LinkedHashSet	TreeSet
Order	No	Insertion	Sorted
Duplicate	❌	❌	❌
Null	One	One	❌
Performance	Fast	Medium	Slow
🔷 HashSet vs ArrayList
Point	HashSet	ArrayList
Duplicate	❌	✅
Order	❌	✅
Access	❌	Index-based
Search	Fast	Slow
🔷 Important Interview Questions 🔥

Q: How HashSet avoids duplicates?
👉 Using hashCode() & equals() methods.

Q: Why HashSet is fast?
👉 Because of hashing.

Q: Can we add null in HashSet?
👉 Yes, only one null.

Q: HashSet synchronized?
👉 No.

🔷 When to use HashSet?

✔ Unique data chahiye
✔ Fast search chahiye
❌ Order important ho

🔥 One-Line Summary

HashSet ek fast collection hai jo unique elements ko unordered form mein store karti hai.
 */