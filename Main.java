import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//         new NewRegister();
//         new LoginPage();

        IdPass idPass = new IdPass();
        LoginPage login = new LoginPage(idPass.getLoginInfo());

    }
}
