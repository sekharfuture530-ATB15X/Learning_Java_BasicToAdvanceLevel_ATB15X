package ex_Lab010_Strings;

public class Lab091_StringExamples {

    public static void main(String[] args) {

        CharSequence ch = "Sekhar";
        System.out.println(ch);
        System.out.println(ch.subSequence(1,5));
//        System.out.println(ch.subSequence(1,10));
        System.out.println(ch.subSequence(-1,6));
    }
}
