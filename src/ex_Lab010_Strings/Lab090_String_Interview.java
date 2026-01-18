package ex_Lab010_Strings;


//  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
//  == - check for the ref
// equla operator assignment the value

public class Lab090_String_Interview {

    public static void main(String[] args){

        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        // Comparsion - String check the ref in String

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s2==s3);


        System.out.println(s1==s4);
        System.out.println(s3==s5);

        //equals - content --> value

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s5));




    }
}
