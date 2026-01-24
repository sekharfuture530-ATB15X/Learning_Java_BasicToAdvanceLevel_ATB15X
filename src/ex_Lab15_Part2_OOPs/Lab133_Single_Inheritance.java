package ex_Lab15_Part2_OOPs;


// One parent -> One Child

public class Lab133_Single_Inheritance {
    public static void main(String[] args) {

        System.out.println("This is Son perperty..........");
        Son s = new Son();
        s.son_Has_2BHK();
        s.perperty_one_Cr();

        System.out.println("============================");
        System.out.println("This is father perperty......");
        Father f = new Father();
        f.perperty_one_Cr();
    }
}
