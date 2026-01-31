package ex_Lab23_Collection_Framework;

import java.util.*;

public class Lab157_ArrayList {

    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add(4);
        list.add(true);

        System.out.println("======================");
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.lastIndexOf(5));
        System.out.println(list.stream().findFirst());

        System.out.println("=====================");

        System.out.println(list);

        System.out.println("======================");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("===========================");
        for(Object o:list){
            System.out.println(o);
        }

        System.out.println("=====Iterator============");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
