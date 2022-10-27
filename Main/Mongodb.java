package Main;

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

        //! collection
        MongoCollection<Document> collection=db.getCollection("testing");
             // print all the data from the collection
        System.out.println("User data from the collection");
                for(Document doc:collection.find()) System.out.println(doc.toJson());


                // get use name form user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username");
        String username=sc.nextLine();
        client.close();
        
    }

    static void checkUserPassword (String username, String user_password, MongoCollection<Document> collection) {
        // TODO : check the user password
        Document foundUser = collection.find (eq ("username", username)).first ();
        if (foundUser != null) {
            String password = foundUser.getString ("password");
            if (password.equals (user_password)) {
                System.out.println ("Login success");
            } else {
                System.out.println ("Login failed");
            }
        } else {
            System.out.println ("User not found");
        }
    }

    static  void AddNewUser (String username, String user_password, MongoCollection<Document> collection) {
        // TODO : add new user to the collection
        Document newUser = new Document ("username", username).append ("password", user_password);
        //! check user is exist or not
        Document UserExists = collection.find (eq ("username", username)).first ();
        if (UserExists == null) {
            collection.insertOne (newUser);
            System.out.println ("User added");
        } else {
            System.out.println ("User already exists");
        }
    }



}
