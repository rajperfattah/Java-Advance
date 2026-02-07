package Collections.com;

import java.util.HashMap;
import java.util.Map;

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

    }
}
