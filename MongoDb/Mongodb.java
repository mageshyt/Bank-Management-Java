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

    public static void main(String[] args) {
        MongoClient client=MongoClients.create("mongodb+srv://magesh:0Cp1sIVfeEEpaz6w@cluster0.ntdwlch.mongodb.net/BankData?retryWrites=true&w=majority");

        MongoDatabase db=client.getDatabase("BankData");

        Auth auth = new Auth();

        //! collection
        MongoCollection<Document> Usercollection=db.getCollection("testing");
        // create user
        //auth.AddNewUser ("itachi", "uchiha", Usercollection);


        // add total amount field to the magesh
        Document foundUser =  Usercollection.find (eq ("username", "magesh")).first ();
        if (foundUser != null) {
            foundUser.append("total_amount", 100000);
            Usercollection.updateOne(eq("username", "magesh"), new Document("$set", foundUser));
        }

        // print all the data from the collection
        auth.getUsersData(Usercollection);

        client.close();
    }
}
