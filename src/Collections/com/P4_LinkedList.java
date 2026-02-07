package Collections.com;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class P4_LinkedList {
    public static void main(String[] args) {
        /*
        Defination:
        LinkedList elements ko nodes ke form mein store karti hai, jahan har
         node apne previous aur next node se linked hota hai.
          [ previous ] [ data ] [ next ]
          data → actual value
          previous → pichle node ka reference
          next → agle node ka reference


        🔷 LinkedList ki Key Characteristics

✔ Duplicate allowed
✔ Order maintained
✔ Non-synchronized
✔ Slower random access
✔ Faster insertion & deletion

🔷 LinkedList Constructors
LinkedList list = new LinkedList();          // empty list
LinkedList<Integer> list2 = new LinkedList<>();
LinkedList<Integer> list3 = new LinkedList<>(list2);

🔷 LinkedList Methods (Theory + Practical)
1️⃣ add() methods
LinkedList<Integer> list = new LinkedList<>();

list.add(10);          // add at end
list.add(20);
list.addFirst(5);      // add at beginning
list.addLast(30);      // add at end
list.add(2, 15);       // add at specific index

System.out.println(list);


Output

[5, 10, 15, 20, 30]

2️⃣ get() methods
System.out.println(list.get(2));        // get by index
System.out.println(list.getFirst());    // first element
System.out.println(list.getLast());     // last element


Output

15
5
30

3️⃣ remove() methods
list.remove();          // removes first element
list.remove(2);         // removes element at index
list.removeFirst();     // removes first
list.removeLast();      // removes last
list.remove((Integer)20); // removes object

System.out.println(list);


Output

[10, 30]

4️⃣ Size & Check methods
System.out.println(list.size());       // number of elements
System.out.println(list.isEmpty());    // true / false
System.out.println(list.contains(10)); // true / false

5️⃣ Iteration methods (Practical)
Using for-each loop
for (Integer i : list) {
    System.out.print(i + " ");
}

Using Iterator
Iterator<Integer> itr = list.iterator();
while (itr.hasNext()) {
    System.out.print(itr.next() + " ");
}

Using ListIterator (forward & backward)
ListIterator<Integer> litr = list.listIterator();

while (litr.hasNext()) {
    System.out.print(litr.next() + " ");
}

while (litr.hasPrevious()) {
    System.out.print(litr.previous() + " ");
}

6️⃣ Queue / Deque related methods (Very Important)
list.offer(40);       // add element
list.offerFirst(1);   // add at beginning
list.offerLast(50);   // add at end

System.out.println(list.poll());      // remove & return first
System.out.println(list.peek());      // return first (no remove)

7️⃣ Clear method
list.clear();
System.out.println(list);


Output

[]
     */
       // LinkedList l1=new LinkedList()// stores all type of data
        LinkedList <Integer> l1=new  LinkedList<Integer>();
        // adding elements
        l1.add(100);
        l1.add(90);
        l1.add(70);
        l1.add(80);
        l1.add(50);

        // linked list elements
        System.out.println("Elements of linked list are : "+l1);

        //size of linked list
        System.out.println("size of linked list is : "+l1.size());

        // removing element
        l1.remove(2);
        System.out.println("After removing 2 index element : "+l1);

        l1.remove();// this method will automatic remove first element
        System.out.println(l1);

        // insertig a new element in the middle of linkelist
        l1.add(2,303);
        System.out.println("After inserting new elemnt : "+l1);

        // retriving value using get method
        System.out.println(l1.get(2));

        // changing element
        l1.set(3,6666666);
        System.out.println(l1);

        // contains method
        System.out.println(l1.contains(2));// retuurns true or false

        System.out.println(l1.isEmpty());// returns true or false

        // reading data from linked list using for loop

        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }


        // reading data using for each loop

        for (Object e:l1){
            System.out.println(e);
        }

        // using iterator method
        System.out.println("reading data using iterator method");
        Iterator i=l1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }


        // reversign elements
        Collections.reverse(l1);
        System.out.println(l1);

        // sorting data
        Collections.sort(l1);

        //sorting in reverse order



        // addAll method
        LinkedList<String> ls1=new LinkedList<>();
        LinkedList<String> ls2=new LinkedList<>();

    ls1.add("X");
    ls1.add("Y");
    ls1.add("Z");
    ls1.add("A");
    ls1.add("B");
    ls1.add("C");
    ls1.add("D");

    ls2.addAll(ls1);
        System.out.println(ls2);

//        ls1.removeAll(ls2);
//        System.out.println(ls1);

        // sorting in reverse:
        Collections.sort(ls2,Collections.reverseOrder());
        System.out.println(ls2);

        // shuffle : arranges in random form

        Collections.shuffle(ls2);
        System.out.println(ls2);



        //specific methods for linkedlist
        System.out.println("Linked list specific methods");

        LinkedList link=new LinkedList();

        link.add("One");
        link.add("two");
        link.add("three");
        link.add("four");
        link.add("five");

        // addFirst:
        System.out.println("addFirst method: adds element in the first ");
        link.addFirst("Zero");
        System.out.println(link);

        // addLast:
        System.out.println("addLast: element last m add hota hy");

        link.addLast("Sixteen hundrads");
        System.out.println(link);

        // geting first elemetn

        System.out.println("geting first element");
        System.out.println(link.getFirst());


        System.out.println("Getting last element");
        System.out.println(link.getLast());

        // removing first element

        System.out.println("Removing first elemtn"+link.removeFirst());

        // reomoving last element
        System.out.println("Removing last"+link.removeLast());

    }
}

