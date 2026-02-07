package Collections.com;

import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class P11_HashTable {
    public static void main(String[] args) {

//        Hashtable ht=new Hashtable();// hetrogeneous data
        Hashtable<Integer,String> ht=new Hashtable();// homogeneous data data

        ht.put(101,"Fattah");
        ht.put(102,"Rauf");
        ht.put(103,"Ghaffar");
        ht.put(104,"Kareem");

        //ht.put(null,"X"); this is not allowed
        //ht.put(106,null); this is also not allowed

        // get
        System.out.println(ht.get(101));

        //remove
        ht.remove(102);
        System.out.println(ht);

        //contains
        System.out.println(ht.contains(102));

        //containsvalue
        System.out.println(ht.containsValue("Fattah"));

        System.out.println(ht.isEmpty());


        // keyset
        System.out.println(ht.keySet());

        //values
        System.out.println(ht.values());

        //entrySet
        System.out.println(ht.entrySet());


        // individual keys
        for (Object e:ht.keySet()){
            System.out.println(e+" : "+ ht.get(e));
        }

        // entery specific methods--------------

        //entries
        for (Map.Entry entry:ht.entrySet()){
            System.out.println(entry);
        }

        //keys
        for (Map.Entry entry:ht.entrySet()){
            System.out.println(entry.getKey());
        }

        //values
        for (Map.Entry entry:ht.entrySet()){
            System.out.println(entry.getValue());
        }


    }
}
/*
1️⃣ Hashtable Definition

Hashtable Java Collection Framework ki ek class hai jo Map interface ko implement karti hai.

👉 Simple definition:

Hashtable data ko key–value pairs ki form mein store karta hai aur thread-safe hota hai.

2️⃣ Hashtable Characteristics

✔ Stores data in key–value pairs
✔ Thread-safe (synchronized)
✔ Keys unique hoti hain
✔ Values duplicate ho sakti hain
✔ Null key ❌
✔ Null value ❌
✔ Insertion order ❌
✔ Slower than HashMap

3️⃣ Internal Working (Conceptual)

Hashtable ka internal structure HashMap jaisa hota hai, lekin:

Har public method synchronized hota hai

Multiple threads ek time par access nahi kar sakte

Key → hashCode() → index → bucket


Collision handling:

Linked List use hoti hai (no tree bins)

4️⃣ Why Hashtable is Thread-Safe?

👉 Kyun ke:

Har method par synchronized keyword laga hota hai

Ek time par sirf ek thread access karta hai

5️⃣ Important Hashtable Constructors
Hashtable ht = new Hashtable();
Hashtable ht = new Hashtable(20);
Hashtable ht = new Hashtable(20, 0.75f);
Hashtable ht = new Hashtable(existingMap);

6️⃣ Load Factor & Capacity

Default capacity = 11

Default load factor = 0.75

Resize condition:

size > capacity × loadFactor

7️⃣ Hashtable Methods (Theory)
Basic

put(k, v)

get(k)

remove(k)

size()

isEmpty()

Search

containsKey(k)

containsValue(v)

Views

keys() → Enumeration

elements() → Enumeration

keySet()

values()

entrySet()

8️⃣ Enumeration vs Iterator (Important)

Hashtable supports Enumeration (old style):

Enumeration e = ht.keys();


✔ Enumeration → Read-only
❌ Iterator → Fail-fast

9️⃣ Hashtable vs HashMap
Feature	Hashtable	HashMap
Thread-safe	✅	❌
Synchronization	Method-level	None
Null key	❌	1 allowed
Null value	❌	Allowed
Performance	Slow	Fast
Legacy	Yes	No
 */