package Main;

import Login.LoginPage;
import MongoDb.Transaction;
import OthersScreen.*;
import BalanceScreen.BalanceScreen;
import HistoryScreen.HistoryScreen;
import HistoryScreen2.HistoryScreen2;
import Login.IdPass;
import Login.LoginPage;
import Login.forgetpass;
import MongoDb.Auth;
import NewRegister.NewRegister;
import OthersScreen.OthersScreen;
import TestScreen.TestScreen;
import ThankYou.ThankYouScreen;
import TransferScreen.TransferScreen;
import validations.EmailValidation;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
//        IdPass idPass = new IdPass();
//        LoginPage loginPage = new LoginPage();
        Auth auth = new Auth();
       // new Otherpayment("phone bill","phone no");
//        new forgetpass();
//        NewRegister newRegister = new NewRegister();
       // TransferScreen transferScreen = new TransferScreen();
//        Auth auth = new Auth();
       auth.Login ("magesh", "Magesh@123");

        //System.out.println("out = " + out);
        // NewRegister newRegister = new NewRegister();
        // TransferScreen transferScreen = new TransferScreen();
       // Auth auth = new Auth();
        //auth.UpdateUserPassword ("Nabela", "nabi@123");
       // BalanceScreen balanceScreen = new BalanceScreen();
        //ThankYouScreen thankYouScreen = new ThankYouScreen();
//         HistoryScreen historyScreen = new HistoryScreen();
        //HistoryScreen2 historyScreen2=new HistoryScreen2 ();
       // forgetpass fo=new forgetpass ();
     OthersScreen othersScreen=new OthersScreen ();
//    Transaction tran= new Transaction ();
//    tran.payOthers (299,"phone","9080950109");
    }
}
