package Main;

import Login.LoginPage;

import BalanceScreen.BalanceScreen;
import Login.IdPass;
import Login.LoginPage;
import MongoDb.Auth;
import NewRegister.NewRegister;
import OthersScreen.OthersScreen;
import TransferScreen.TransferScreen;

class Main{
    public static void main(String[] args) {
        LoginPage loginPage= new LoginPage();
//        IdPass idPass = new IdPass();
//        LoginPage loginPage = new LoginPage();
//        NewRegister newRegister = new NewRegister();
//        TransferScreen transferScreen = new TransferScreen();
        Auth auth = new Auth();
        //auth.UpdateUserPassword ("hemanth","hema");

        BalanceScreen balanceScreen = new BalanceScreen();

    }
}
