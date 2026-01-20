package ex_Lab012_Ternary_Operator;

public class Lab114_TO_IQ {

    public static void main(String[] args) {

        int amol_age = 21;
        String result = amol_age > 18 ? (amol_age > 25 ? "you can drink": "you can't"): "No you can't goto Goa";
        System.out.println(result);
    }
}
