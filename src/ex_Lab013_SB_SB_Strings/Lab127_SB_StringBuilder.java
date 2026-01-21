package ex_Lab013_SB_SB_Strings;

import javax.print.DocFlavor;

public class Lab127_SB_StringBuilder {

    public static void main(String[] args) {

        /*
         * append
         * insert
         * replace
         * charAt
         * setcharAt
         * delete
         * substring
         * tostring
         * deletecharAll
         * reverse
         * capacity
         * length
         * ensureCapacity
         * trimToSize
         *
         */

//        StringBuilder sb = new StringBuilder("Java Programming");
//        sb.append("Language");
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("Java");
////        sb.insert(2,"Hello");
//        sb.insert(4, "Program");
//        System.out.println(sb);

//        StringBuilder sb = new StringBuilder("SekharVeena");
//        sb.length();
//        System.out.println(sb.length());

//        StringBuilder sb = new StringBuilder("Sekhar123");
//        System.out.println(sb.charAt(2));
//        System.out.println(sb.length());
//        System.out.println(sb.charAt(0));

//        StringBuilder sb = new StringBuilder("Sekhar");
//        sb.replace(1,3,"Hello");
//        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Selenium");
        System.out.println(sb1.substring(1,5));

        System.out.println("===============================");

        StringBuilder sb2 = new StringBuilder("Automation Testing");

        System.out.println(sb2.reverse());

        System.out.println("==============================");

        StringBuilder sb3 = new StringBuilder("java");
        String s = sb3.toString();
        System.out.println(s);

        System.out.println("=======================");

        StringBuilder sb4 = new StringBuilder(10);
        sb4.append("Java Programming");
        sb4.trimToSize();
        System.out.println(sb4.capacity());

        System.out.println("====================");

        StringBuilder sb5 = new StringBuilder("Jova");
        sb5.setCharAt(1, 'a');
        System.out.println(sb5);

        System.out.println("==================");

        StringBuilder sb6 = new StringBuilder("Jova");
        sb6.setCharAt(0, 'S');
        System.out.println(sb6);

        System.out.println("==========================");

        StringBuilder sb7 = new StringBuilder("Javaa");
        sb7.delete(1,4);
        System.out.println(sb7);

        System.out.println("=================================");

        StringBuilder sb8 = new StringBuilder("Javaa");
        sb8.deleteCharAt(4);
        System.out.println(sb8);


























    }
}
