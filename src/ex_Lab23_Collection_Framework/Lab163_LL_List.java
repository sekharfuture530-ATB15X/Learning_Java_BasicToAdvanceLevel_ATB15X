package ex_Lab23_Collection_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab163_LL_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        List list1 = new ArrayList(10);
        List list3 = List.of("l1","L2");

        List ll = new LinkedList();
        ll.add("Sekhar");
        ll.add("Veena");
        ll.add("Bishwajit");
        System.out.println(ll);


    }
}
