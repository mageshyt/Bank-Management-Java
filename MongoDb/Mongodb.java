package MongoDb;
// TODO : connect to mongo db
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import java.text.ParseException;
import java.util.ArrayList;
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


        ArrayList trans=transaction.getUserTransactions("magesh");
        for (int i=0;i<trans.size();i++){
            Document curr= (Document) trans.get(i);
            if(curr.containsKey("date")){
                System.out.println(curr.get("date"));
            }
        }
        System.out.println(trans);
   // auth.Login ("magesh", "magesh123");
        client.close();
        // ! get date from document


    }

    public  String LoginUser(String username, String password) throws ParseException {

        return auth.Login (username, password);
    }


}
