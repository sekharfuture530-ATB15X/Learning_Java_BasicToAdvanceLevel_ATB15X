package ex_Lab23_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab156_List {

    public static void main(String[] args) {

        List fuits = List.of("orange","Apple","Bannana","mango","watermelon","kiwi");

        System.out.println(fuits);

        List arrayList  = new ArrayList();

        arrayList.add("Sekhar");
        arrayList.add("Veena");
        arrayList.add("12");
        arrayList.add(true);
        arrayList.add(123);
        arrayList.add(10.25);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
