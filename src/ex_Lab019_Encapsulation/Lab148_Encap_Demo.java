package ex_Lab019_Encapsulation;

public class Lab148_Encap_Demo {
    public static void main(String[] args) {

        GoodVWOLogin g = new GoodVWOLogin("Sekhar","123");
//        g.GoodVWOLogin("Sekhar","Sekhar@123");
        System.out.println(g.getUserName());
        g.getPassword();
    }
}

//class VWOLogin{
//    public String userName;
//    public String password;
//    public void VWOLogin(String user, String pwd){
//        this.userName = user;
//        this.password = pwd;
//    }
//}

class GoodVWOLogin{
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    private String userName;
    private String password;

    GoodVWOLogin(String userName, String password){
        this.userName = userName;
        this. password = password;
    }
}