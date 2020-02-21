package lesson05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArraysSrtings {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("2second");
        list1.add("1first");
        list1.add("4forth");
        list1.add("todelete");
        list1.add("3third");

        for (String str:list1
             ) {
            System.out.println(str);

                }
        list1.remove("todelete");

        System.out.println("after deletion");
        for (String str:list1
        ) {
            System.out.println(str);
        }

        Collections.sort(list1);

        System.out.println("after sorting");
        for (String str:list1
        ) {
            System.out.println(str);
        }

        System.out.println("output with Iterator");
        for (Iterator<String> item = list1.iterator();item.hasNext();) {
            String i = item.next();
            System.out.println(i);

        }


    }

}
