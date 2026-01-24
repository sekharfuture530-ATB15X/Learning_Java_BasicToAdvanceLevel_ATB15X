package ex_Lab_Part2_OOPs;

public class Lab135_Multilevel_Inheritance {

    public static void main(String[] args) {

        GranFather gf = new GranFather();
        System.out.println(gf.gold);
        gf.money();

        Father_Multilevel fm = new Father_Multilevel();
        System.out.println(fm.gold);
        fm.money();

        Son_Multilevel sm = new Son_Multilevel();
        System.out.println(sm.gold);
        sm.perporty_3bhk();
        sm.money();

        GranFather gm = new Son_Multilevel();

        gm.money();
        System.out.println(gm.gold);

    }
}
