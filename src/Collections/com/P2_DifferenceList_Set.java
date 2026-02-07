package Collections.com;

import java.util.*;

public class P2_DifferenceList_Set {
    public static void main(String[] args) {

        SetDemo sd = new SetDemo();
        ListDemo ld = new ListDemo();

        sd.showSet();
        ld.showList();
    }
}

class SetDemo{
    void showSet(){
        Set s=new HashSet();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(null);
        s.add(null);// set onlu accepts null once

        System.out.println(s);
    }
}

class ListDemo{
    void showList(){
        List l1=new ArrayList();
        l1.add(10);
        l1.add(20);
        l1.add(0,30);
        l1.add(90);
        l1.add(null);
        l1.add(null);// list can add multiple null values

        System.out.println(l1);

        Iterator it=l1.iterator();
        while (it.hasNext()){

        }
    }
}
