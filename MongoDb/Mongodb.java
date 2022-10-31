package MongoDb;
// TODO : connect to mongo db
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.util.Scanner;


public class Mongodb {
   static MongoClient client;
    static MongoDatabase db;
    static  MongoCollection<Document> Usercollection;
    // ! transaction collection
    static MongoCollection<Document> Transactioncollection;

    static Auth auth = new Auth();
  public static  void connect() {
         client=MongoClients.create("mongodb+srv://magesh:0Cp1sIVfeEEpaz6w@cluster0.ntdwlch.mongodb.net/BankData?retryWrites=true&w=majority");

        db=client.getDatabase("BankData");

        //! collection
        Usercollection=db.getCollection("users");
        Transactioncollection=db.getCollection("Transaction");


    }
    public Mongodb(){
        connect();
    }
    public static void main (String[] args) {
        Transaction transaction = new Transaction ();


    auth.Login ("magesh", "magesh123");
    //transaction.SendMoney ("8438829958",100);
        transaction.getUserTransactions("magesh");
        transaction.noOfTransactions ("magesh");
//        auth.getUsersData ();
        client.close();

    }

    public  String LoginUser(String username, String password) {

        return auth.Login (username, password);
    }


}
