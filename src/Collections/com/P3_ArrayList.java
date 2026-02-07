package Collections.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class P3_ArrayList {

    public static void main(String[] args) {

        /* ================================
           HOMOGENEOUS ARRAYLIST
           (Same type of elements)
           ================================ */

        // Creating a homogeneous ArrayList of Integer type
        ArrayList<Integer> list = new ArrayList<>();

        // add(E e)
        // Used to add element at the end of the list
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After add(): " + list);
        // Output: [10, 20, 30]


        // add(int index, E element)
        // Adds element at specific index
        list.add(1, 15);

        System.out.println("After add(index, element): " + list);
        // Output: [10, 15, 20, 30]


        // get(int index)
        // Returns element at given index
        System.out.println("Element at index 2: " + list.get(2));
        // Output: 20


        // set(int index, E element)
        // Replaces element at given index
        list.set(2, 25);

        System.out.println("After set(): " + list);
        // Output: [10, 15, 25, 30]


        // remove(int index)
        // Removes element from given index
        list.remove(1);

        System.out.println("After remove(index): " + list);
        // Output: [10, 25, 30]


        // contains(Object o)
        // Checks whether element exists or not
        System.out.println("Contains 25? " + list.contains(25));
        // Output: true


        // size()
        // Returns number of elements
        System.out.println("Size of list: " + list.size());
        // Output: 3


        // isEmpty()
        // Checks list is empty or not
        System.out.println("Is list empty? " + list.isEmpty());
        // Output: false

        // sort -- collections methods
        Collections.sort(list);
        System.out.println("Arraylist afet sorting : "+list);

        // sroting in revearse order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Array list in sorted in reverse order");

        // shuffling
        Collections.shuffle(list);
        System.out.println("Shuffled arraylist");



        // indexOf(Object o)
        // Returns index of element (first occurrence)
        System.out.println("Index of 25: " + list.indexOf(25));
        // Output: 1


        // iterator()
        // Used to traverse the list
        System.out.print("Using Iterator: ");
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        // Output: 10 25 30


        // clear()
        // Removes all elements from list
        list.clear();

        System.out.println("After clear(): " + list);
        // Output: []


        /* ================================
           HETEROGENEOUS ARRAYLIST
           (Different types of elements)
           ================================ */

        // Creating heterogeneous ArrayList (no generics)
        ArrayList al = new ArrayList();

        // add() with different data types
        al.add(10);          // Integer
        al.add(10.5);        // Double
        al.add("Java");      // String
        al.add(true);        // Boolean
        al.add('A');         // Character

        System.out.println("Heterogeneous ArrayList: " + al);
        // Output: [10, 10.5, Java, true, A]


        // remove(Object o)
        // Removes specific object
        al.remove("Java");

        System.out.println("After removing 'Java': " + al);
        // Output: [10, 10.5, true, A]


        // get()
        System.out.println("Element at index 1: " + al.get(1));
        // Output: 10.5


        // size()
        System.out.println("Size of heterogeneous list: " + al.size());
        // Output: 4


        // iterating the arraylist with different ways
        // Homogeneous ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        System.out.println("Original List: " + list1);
        // Output: [10, 20, 30, 40]


        /* =========================================
           1. Using for loop (index based)
           ========================================= */
        // Best when index is required

        System.out.print("Using for loop: ");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        // Output: 10 20 30 40


        /* =========================================
           2. Using enhanced for loop (for-each)
           ========================================= */
        // Simple and clean, most commonly used

        System.out.print("Using enhanced for loop: ");
        for (Integer num : list1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // Output: 10 20 30 40


        /* =========================================
           3. Using Iterator (forward direction)
           ========================================= */
        // Supports remove operation safely

        System.out.print("Using Iterator: ");
        Iterator<Integer> itr1 = list1.iterator();
        while (itr1.hasNext()) {
            System.out.print(itr1.next() + " ");
        }
        System.out.println();
        // Output: 10 20 30 40


        /* =========================================
           4. Using ListIterator (forward)
           ========================================= */
        // Can traverse in both directions

        System.out.print("Using ListIterator (forward): ");
        ListIterator<Integer> litr = list1.listIterator();
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }
        System.out.println();
        // Output: 10 20 30 40


        /* =========================================
           5. Using ListIterator (backward)
           ========================================= */
        // Only ListIterator supports backward traversal

        System.out.print("Using ListIterator (backward): ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
        System.out.println();
        // Output: 40 30 20 10


        /* =========================================
           6. Using forEach() method (Java 8)
           ========================================= */
        // Functional style, very popular in modern Java

        System.out.print("Using forEach(): ");
        list1.forEach(n -> System.out.print(n + " "));
        System.out.println();
        // Output: 10 20 30 40


        /* =========================================
           7. Using method reference (Java 8)
           ========================================= */
        // Shorter version of forEach

        System.out.print("Using method reference: ");
        list1.forEach(System.out::print);
        System.out.println();
        // Output: 10203040
    }
}

/*
// Arrray to arraylist program
import java.util.ArrayList;

public class ArrayToArrayList2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        // Creating empty ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // Adding array elements into ArrayList
        for (int num : arr) {
            list.add(num);
        }

        System.out.println("ArrayList: " + list);
    }
}

 */

// arrayList to array
/*
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArraySimple {

    public static void main(String[] args) {

        // Step 1: Create ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Step 2: Convert ArrayList to Array
        Integer[] arr = list.toArray(new Integer[list.size()]);

        // Step 3: Print Array
        System.out.println("Array: " + Arrays.toString(arr));
    }
}


 */


