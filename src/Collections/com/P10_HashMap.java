package Collections.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P10_HashMap {
    public static void main(String[] args) {
//        HashMap m=new HashMap()// hetrogeneus
        HashMap<Integer,String> m=new HashMap<Integer,String>();// homogeneous

        // adding values in hashmap
        m.put(101,"Fattah");
        m.put(102,"Kabeer");
        m.put(103,"Ghaffar");
        m.put(104,"Kareem");
        m.put(105,"Raheem");
        m.put(102,"Shahzaib");// if we duplicate the key, then the old value will be replaced with new value

        System.out.println(m);

        // get value by passign key
        System.out.println(m.get(102));

        // removing perticular pair from hashmap
        m.remove(105);
        System.out.println(m);

        // contains : returns true or false
        System.out.println(m.containsValue(104));

        //containsValue:
        System.out.println(m.containsValue("Raheem"));

        System.out.println(m.isEmpty());

        // keyset
        System.out.println(m.keySet());

        // values
        System.out.println(m.values());

        //entries
        System.out.println(m.entrySet());

        // size
        System.out.println(m.size());

        //getKey:

    for (Object i:m.keySet()){

        System.out.println(i);
    }


    // values
        for (Object e:m.values()){
            System.out.println(e);
        }


        // entryset
        for (Object e:m.keySet()){
            System.out.println(e+" :"+m.get(e));
        }


        // entry specific methods.
        for (Map.Entry e:m.entrySet()){
            System.out.println(e);
        }

        // only keys
        for (Map.Entry e:m.entrySet()){
            System.out.println(e.getKey());
        }

        // only values
        for (Map.Entry e:m.entrySet()){
            System.out.println(e.getValue());
        }

        // using iterator method

        Set s=m.entrySet();
        Iterator it=s.iterator();
        while (it.hasNext()){
            Map.Entry e=(Map.Entry) it.next();
            System.out.println(e.getKey()+" : "+e.getValue());
        }

    }
}
/*
1️⃣ HashMap Definition

HashMap Java Collection Framework ki ek class hai jo Map interface ko implement karti hai.

👉 Simple definition:

HashMap data ko key–value pair ki form mein store karta hai, jahan key unique hoti hai.

Example:

Key → Value
101 → Ali
102 → Sara
103 → Ahmed

2️⃣ HashMap Characteristics

✔ Stores data in key–value pairs
✔ Keys are unique
✔ Values duplicate ho sakti hain
✔ One null key allowed
✔ Multiple null values allowed
✔ Insertion order ❌
✔ Non-synchronized
✔ Fast performance

3️⃣ Internal Working (MOST IMPORTANT 🔥)
Step-by-step:

Key ka hashCode() call hota hai

Hash value ko index (bucket) mein convert kiya jata hai

Us bucket mein entry store hoti hai

Index = hash(key) % capacity

Collision Handling

Agar 2 keys ka index same ho:

Java 7 → Linked List

Java 8+ → Balanced Tree (Red-Black Tree)
(jab ek bucket mein zyada entries ho jayein)

4️⃣ HashMap Internal Structure
Bucket
  ↓
[Hash, Key, Value, Next]


Java 8:

Array → LinkedList → Tree

5️⃣ Why HashMap is FAST?

Direct index access

Average time complexity O(1) for:

put()

get()

remove()

6️⃣ Important HashMap Constructors
HashMap map = new HashMap();
HashMap map = new HashMap(16);
HashMap map = new HashMap(16, 0.75f);
HashMap map = new HashMap(existingMap);

7️⃣ Load Factor & Capacity

Default capacity = 16

Default load factor = 0.75

Resize hota hai jab:

size > capacity × loadFactor

8️⃣ HashMap Methods (Theory)
Put & Get

put(k, v)

get(k)

getOrDefault(k, defaultValue)

Remove

remove(k)

remove(k, v)

Search

containsKey()

containsValue()

Views

keySet()

values()

entrySet()

Utility

size()

isEmpty()

clear()

9️⃣ Iteration Techniques (Theory)

Using keySet()

Using entrySet() (BEST)

Using values()

Iterator

🔟 HashMap vs Hashtable
Feature	HashMap	Hashtable
Thread-safe	❌	✅
Null key	1 allowed	❌
Null value	Allowed	❌
Performance	Fast	Slow
 */
