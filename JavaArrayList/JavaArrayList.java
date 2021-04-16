package LinkedList;

import java.util.ArrayList;

/**
* Java ArrayList Test
* @author binqibang
* @created 2021/03/25
*/

public class JavaArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        //list.add(): add a element at the end of list
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        System.out.println(list);

        //list can't be accessed by [index], instead of get()
        System.out.println(list.get(0));

        //list.remove(): remove the list[index]
        list.remove(1);
        System.out.println(list);

        //return the index of given object
        System.out.println(list.indexOf(1000));
        System.out.println(list.contains(1000));
    }
}
