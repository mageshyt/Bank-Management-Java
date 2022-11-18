package Main;

import Login.LoginPage;
import MongoDb.DuplicateCheck;
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
//        Auth auth = new Auth();
       auth.Login ("hemanth", "hema");

        //TransferScreen transferScreen = new TransferScreen();
        ThankYouScreen thankYouScreen = new ThankYouScreen();

        DuplicateCheck duplicateCheck = new DuplicateCheck();
      if (duplicateCheck.isDuplicate("magesh", "username")) {
            System.out.println("Duplicate");
        } else {
            System.out.println("Not Duplicate");
        }
    }
}
