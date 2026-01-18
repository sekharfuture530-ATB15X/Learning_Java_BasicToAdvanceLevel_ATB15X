package ex_Lab010_Strings;

public class Lab088_String_Immutable {

    public static void main(String[] args) {

        String name = "Sekhar";
//        boolean result = name.contains("k");
//        boolean result2 = name.contains("K");
//        boolean result1 = name.contains("V");
//        System.out.println(result);
//        System.out.println(result1);
//        System.out.println(result2);

//        Strings are Immutable are in nature

        name.toUpperCase();
        System.out.println(name);

        name = name.toUpperCase();
        System.out.println(name);

    }
}
