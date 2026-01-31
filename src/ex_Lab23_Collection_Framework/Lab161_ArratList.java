package ex_Lab23_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab161_ArratList {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(95);
        list.add(89);
        list.add(78);
        list.add(59);

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
