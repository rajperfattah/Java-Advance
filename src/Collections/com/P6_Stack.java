package Collections.com;



        /*
        STACK
✅ Stack Definition

Stack Java ki ek class hai jo Vector ko extend karti hai aur LIFO (Last In First Out) principle follow karti hai.

👉 Simple words:

Stack mein jo element last mein add hota hai, woh pehle remove hota hai.

🔷 Stack Real-Life Example

📚 Books ka stack

Last book upar rakhi

Pehle wahi niklegi

🔷 Stack Important Terms
Term	Meaning
Push	element add
Pop	element remove
Peek	top element view
LIFO	Last In First Out
🔷 Stack Important Methods
Method	Work
push()	add element
pop()	remove top
peek()	view top
search()	position
empty()	check empty
         */

import java.util.Iterator;
import java.util.Stack;

        public class P6_Stack {

            public static void main(String[] args) {

                Stack<Integer> s = new Stack<>();

                s.push(10);
                s.push(20);
                s.push(30);

                System.out.println(s);      // [10, 20, 30]
                System.out.println(s.pop()); // 30
                System.out.println(s.peek()); // 20
                System.out.println(s.search(10)); // 2
                System.out.println(s.empty()); // false


                // reading data from stack:
                System.out.print("Traverse using for-each: ");
                for (Object num : s) {
                    System.out.print(num + " ");
                }
                System.out.println();
                // Output: 10 20 30

                // using itrator method
                System.out.print("Traverse using Iterator: ");
                Iterator<Integer> itr = s.iterator();
                while (itr.hasNext()) {
                    System.out.print(itr.next() + " ");
                }
                System.out.println();
                // Output: 10 20 30



            }
        }

