package ex_Lab017_Ploymorphism_Compile_Time_Polymorphism;

public class Lab143_MethodOverLoading {

    public static void main(String[] args) {

        WebAutomation web = new WebAutomation();
        web.openbrowser();
        web.openbrowser("Chrome");
    }
}

class WebAutomation {

    void openbrowser(){
        System.out.println("Default browser..");
    }

    void openbrowser(String browser){
        System.out.println("Starting browser.."+browser);
    }
}
