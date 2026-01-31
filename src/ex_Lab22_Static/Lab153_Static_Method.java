package ex_Lab22_Static;

public class Lab153_Static_Method {

    public static void main(String[] args) {
        Statc_Mthd sm = new Statc_Mthd();
//sm.printMesg();
        System.out.println(Statc_Mthd.printMesg());
    }
}

class Statc_Mthd {

    static boolean printMesg(){
        System.out.println("This is Static Method");
//        return false;
        return false;
    }
}
