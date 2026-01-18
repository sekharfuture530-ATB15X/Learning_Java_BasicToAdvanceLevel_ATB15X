package ex_Lab010_Strings;

public class Lab087_Strings {

    public static void main(String[] args) {

        String s1 = "Java"; // String Constant Pool
        String s2 = "Java"; // Same reference as s1
        String s3 = new String("Java"); // Heap memory (new object)

        System.out.println(s1==s2);
        System.out.println(s1==s3);
    }
}
