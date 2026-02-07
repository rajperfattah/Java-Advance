package Collections.com;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class P9_LinkedList {

    public static void main(String[] args) {

        /* =========================================
           Creating LinkedList
           ========================================= */
        LinkedList<Integer> list = new LinkedList<>();


        /* =========================================
           add() – add elements (List behavior)
           ========================================= */
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add(): " + list);
        // Output: [10, 20, 30]


        /* =========================================
           addFirst() & addLast() – Deque behavior
           ========================================= */
        list.addFirst(5);
        list.addLast(40);

        System.out.println("After addFirst & addLast: " + list);
        // Output: [5, 10, 20, 30, 40]


        /* =========================================
           get(), getFirst(), getLast()
           ========================================= */
        System.out.println("get(2): " + list.get(2));        // 20
        System.out.println("getFirst(): " + list.getFirst()); // 5
        System.out.println("getLast(): " + list.getLast());   // 40


        /* =========================================
           set() – update element
           ========================================= */
        list.set(2, 25);

        System.out.println("After set(2,25): " + list);
        // Output: [5, 10, 25, 30, 40]


        /* =========================================
           remove methods
           ========================================= */
        list.remove();        // removes first
        list.remove(2);       // removes by index
        list.removeLast();    // removes last

        System.out.println("After remove operations: " + list);
        // Output: [10, 25]


        /* =========================================
           contains(), size(), isEmpty()
           ========================================= */
        System.out.println("Contains 25? " + list.contains(25)); // true
        System.out.println("Size: " + list.size());              // 2
        System.out.println("Is Empty? " + list.isEmpty());       // false


        /* =========================================
           Queue methods (FIFO)
           ========================================= */
        list.offer(50);
        list.offer(60);

        System.out.println("After offer(): " + list);
        // Output: [10, 25, 50, 60]

        System.out.println("peek(): " + list.peek()); // 10
        System.out.println("poll(): " + list.poll()); // removes 10

        System.out.println("After poll(): " + list);
        // Output: [25, 50, 60]


        /* =========================================
           Stack behavior (LIFO)
           ========================================= */
        list.push(100); // add at beginning
        System.out.println("After push(100): " + list);
        // Output: [100, 25, 50, 60]

        System.out.println("pop(): " + list.pop()); // removes 100
        System.out.println("After pop(): " + list);
        // Output: [25, 50, 60]


        /* =========================================
           Iteration – for-each loop
           ========================================= */
        System.out.print("For-each loop: ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();


        /* =========================================
           Iteration – Iterator
           ========================================= */
        System.out.print("Iterator: ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();


        /* =========================================
           Iteration – ListIterator (forward & backward)
           ========================================= */
        System.out.print("ListIterator forward: ");
        ListIterator<Integer> litr = list.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();

        System.out.print("ListIterator backward: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();


        /* =========================================
           clear()
           ========================================= */
        list.clear();
        System.out.println("After clear(): " + list);
        // Output: []
    }
}



/*
LinkedList Definition

LinkedList Java Collection Framework ki ek class hai jo List aur Deque interfaces ko implement karti hai.

👉 Simple definition:

LinkedList ek linear data structure hai jisme elements nodes ki form mein store hote hain, aur har node ke paas data + reference (address) hota hai.

2️⃣ Node Structure (Core Concept)

LinkedList ka har element ek Node hota hai:

| Data | Next | Previous |


Java ki LinkedList Doubly Linked List hoti hai.

3️⃣ Types of LinkedList (Conceptual)

Singly Linked List

Data + Next

Doubly Linked List (Java LinkedList)

Data + Previous + Next

Circular Linked List

Last node → First node

4️⃣ How LinkedList Works Internally

Elements continuous memory mein store nahi hote

Har node ka apna memory block hota hai

Nodes ek doosre se references ke through connected hote hain

Example:

10 ⇄ 20 ⇄ 30 ⇄ 40

5️⃣ Memory Management (Very Important)
Feature	ArrayList	LinkedList
Memory	Continuous	Non-continuous
Extra Memory	❌	✅ (references)
Growth	Resize array	New node

LinkedList:

Zyada memory consume karti hai

But insertion/deletion fast hoti hai

6️⃣ Time Complexity (Interview Favorite)
Operation	LinkedList
Add at beginning	O(1)
Add at end	O(1)
Add in middle	O(n)
Get by index	O(n)
Remove at beginning	O(1)
Remove at end	O(1)
7️⃣ Why LinkedList is Slow in Searching?

👉 Kyun ke:

Direct index access nahi hota

Traverse karna parta hai node by node

8️⃣ Key Characteristics

✔ Allows duplicates
✔ Maintains insertion order
✔ Multiple null allowed
✔ Non-synchronized
✔ Slower than ArrayList for access
✔ Faster for insertion/deletion

9️⃣ Interfaces Implemented
LinkedList
   ↓
List
Deque
Queue


Is liye LinkedList:

List ki tarah use hoti hai

Queue / Stack bhi ban sakti hai

🔟 Important LinkedList Methods (Theory)
List Methods

add()

get()

set()

remove()

size()

Deque / Queue Methods

addFirst()

addLast()

removeFirst()

removeLast()

getFirst()

getLast()

offer()

poll()

peek()

1️⃣1️⃣ LinkedList vs ArrayList (Theory)
Feature	ArrayList	LinkedList
Structure	Dynamic array	Doubly linked list
Access	Fast (O1)	Slow (On)
Insert/Delete	Slow	Fast
Memory	Less	More
1️⃣2️⃣ When to Use LinkedList?

✔ Frequent insertions & deletions
✔ Queue / Deque implementation
✔ When random access not needed

1️⃣3️⃣ When NOT to Use LinkedList?

❌ Heavy searching
❌ Index-based operations
❌ Memory-critical applications

 */