package Main;

import Login.LoginPage;

import BalanceScreen.BalanceScreen;
import HistoryScreen.HistoryScreen;
import HistoryScreen2.HistoryScreen2;
import Login.IdPass;
import Login.LoginPage;
import MongoDb.Auth;
import NewRegister.NewRegister;
import OthersScreen.OthersScreen;
import TestScreen.TestScreen;
import ThankYou.ThankYouScreen;
import TransferScreen.TransferScreen;

public class Main {

    public static void main(String[] args) {
//        IdPass idPass = new IdPass();
//        LoginPage loginPage = new LoginPage();
//        NewRegister newRegister = new NewRegister();
//        TransferScreen transferScreen = new TransferScreen();
        Auth auth = new Auth();
        auth.Login("magesh", "magesh123");
        if(auth.isLocked()){
            System.out.println("User is locked");
        }
        else{
            System.out.println("User is not locked");
        }
        auth.LockTime();
        //auth.UpdateUserPassword ("hemanth","hema");

        // NewRegister newRegister = new NewRegister();
        // TransferScreen transferScreen = new TransferScreen();
       // Auth auth = new Auth();
        //auth.UpdateUserPassword ("Nabela", "nabi@123");
       // BalanceScreen balanceScreen = new BalanceScreen();
        //ThankYouScreen thankYouScreen = new ThankYouScreen();
//         HistoryScreen historyScreen = new HistoryScreen();
        //HistoryScreen2 historyScreen2=new HistoryScreen2 ();

       // TestScreen testScreen= new TestScreen ();

    }
}
