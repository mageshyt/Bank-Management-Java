package MongoDb;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Indexes;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;

import static com.mongodb.client.model.Filters.eq;

public class Transaction {
    MongoCollection<Document> Usercollection;
    MongoCollection<Document> Transactioncollection;

    static Auth auth = new Auth();
    public Transaction(){
        Mongodb mongodb = new Mongodb();
        //! current user

        Transactioncollection= Mongodb.Transactioncollection;
        Usercollection = Mongodb.Usercollection;
    }

    void AddNewTransaction (String username, String user_password,int amount) {

    }

    void AddMoney( String phone, int amount){
        // TODO : add money to the user

        Document foundUser =  Usercollection.find (eq ("phone",phone)).first ();
        if (foundUser != null) {
            int balance = foundUser.getInteger ("balance");
            balance += amount;
            foundUser.put ("balance", balance);
            Usercollection.updateOne (eq ("phone", phone), new Document ("$set", foundUser));
            System.out.println ("Money added");
        } else {
            System.out.println ("User not found");
        }

    }


   public String SendMoney(String phoneno,  int amount){
        // TODO : send money to the user
        Document CurrentUser = auth.CurrentUser;
        String name= CurrentUser.getString ("username");
        String userNo = CurrentUser.getString ("phone");
        Document foundUser =  Usercollection.find (eq ("phone",phoneno)).first ();
        if(foundUser==null){
            System.out.println ("User not found");
            return "User not found";
        }
        String username = foundUser.getString ("username");
        //! TODO : Transaction Doc
        Document TransactionDoc = new Document ("from", name).append ("to", username).append ("amount", amount);



        if(phoneno.equals (userNo)){
            System.out.println ("You can't send money to yourself");
            return "self Transaction";
        }
        // ! get balance from the user
        int balance = CurrentUser.getInteger ("balance");
        if(balance >= amount) {
            balance -= amount;
            CurrentUser.put ("balance", balance);
            // decrease the balance from the current user
            Usercollection.updateOne (eq ("username", name), new Document ("$set", CurrentUser));
// increase the balance to the user
           AddMoney (phoneno, amount);
            // add transaction to the collection
            Transactioncollection.insertOne (TransactionDoc);

            System.out.println ("Money sent");
            return "success";
        }
        else{
            System.out.println ("Not enough money");
            return "insufficient balance";
        }
    }

    public ArrayList getUserTransactions(String username){
        //! create a transaction array and store all the tranaction in that
        ArrayList<Document> transactions = new ArrayList<Document> ();
        // TODO : get user transactions with the user name from and to
        for (Document document : Transactioncollection.find (eq ("from", username))) {
            transactions.add (document);
            System.out.println (document);
        }

        for (Document document : Transactioncollection.find (eq ("to", username))) {
            transactions.add (document);
            System.out.println (document);
        }

        return transactions;
    }

    public  int noOfTransactions(String username){
        // TODO : get the number of transactions
        ArrayList transactions = getUserTransactions (username);

        int count = transactions.size ();

        return count;
    }
}
