package Collections.com;

import java.util.Iterator;
import java.util.PriorityQueue;

public class P8_PriortyQueue {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        // only homogeneous data allowed
        pq.add("A");
        pq.add("B");
        pq.add("C");
        pq.add("A");
        System.out.println(pq);

       // pq.add(44); this will show error bcq we can store only homogeneous data at one time
//        System.out.println(pq);

        pq.offer("C");
        System.out.println(pq);


        // get head element
        //pq.clear();
        //System.out.println(pq.element());// this will through exception
        //System.out.println(pq.peek());// this will return null

        // return and remove element from queues
        System.out.println("Return and remove element fromm quueue");
        System.out.println(pq.remove());

        // pull
        System.out.println(pq.poll());

        // reading elements
        Iterator it=pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // reading by for each

        for (Object e:pq){
            System.out.println(e);
        }
    }
}

/*
PriorityQueue — Definition

PriorityQueue Java Collection Framework ki ek class hai jo Queue interface ko implement karti hai.

👉 Simple words mein:

PriorityQueue mein elements priority ke base par process hote hain, FIFO zaroori nahi hota.

🔷 PriorityQueue ki Key Characteristics

✔ Duplicate allowed
✔ Order priority-based (natural or custom)
✔ Null ❌ allowed
✔ Non-synchronized
✔ Fast insertion & deletion
✔ Implemented using Heap (Min-Heap by default)

🔷 Internal Working (VERY IMPORTANT)

PriorityQueue internally Binary Heap use karti hai.

Default:

Min-Heap

Smallest element = highest priority

        10
       /  \
     20    30

🔷 PriorityQueue Constructors
PriorityQueue<Integer> pq = new PriorityQueue<>();
PriorityQueue<Integer> pq2 = new PriorityQueue<>(20);
PriorityQueue<Integer> pq3 = new PriorityQueue<>(Comparator.reverseOrder());

🔷 Important Methods (Theory + Practical)
1️⃣ add() / offer()
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq);
    }
}


Output

[10, 20, 30, 40]


⚠ Printing sorted lagta hai, lekin internally heap hota hai.

2️⃣ peek() – Read head (highest priority)
System.out.println("Peek: " + pq.peek());


Output

10

3️⃣ poll() – Remove head
System.out.println("Poll: " + pq.poll());
System.out.println("After poll: " + pq);


Output

10
[20, 40, 30]

4️⃣ remove(Object o)
pq.remove(30);
System.out.println(pq);

5️⃣ size(), isEmpty()
System.out.println(pq.size());
System.out.println(pq.isEmpty());

6️⃣ Iteration (Important Warning ⚠)
for (Integer i : pq) {
    System.out.print(i + " ");
}


⚠ Iteration priority order guarantee nahi karta.

🔷 Max-Heap PriorityQueue (Custom Comparator)
PriorityQueue<Integer> maxPQ =
        new PriorityQueue<>(Comparator.reverseOrder());

maxPQ.add(10);
maxPQ.add(30);
maxPQ.add(20);

System.out.println(maxPQ);


Output

[30, 10, 20]

🔷 PriorityQueue vs Queue vs Deque
Feature	Queue	PriorityQueue	Deque
Order	FIFO	Priority	Both ends
Null	One	❌	One
Access	Head	Head	Head & tail
 */