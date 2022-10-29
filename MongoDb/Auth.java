package MongoDb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.security.PublicKey;

import static com.mongodb.client.model.Filters.eq;




public class Auth {
    //! get name from mongodb.java
    MongoCollection<Document> Usercollection;
    public Auth(){
        Mongodb mongodb = new Mongodb();

        Usercollection = mongodb.Usercollection;
    }

    void getUsersData(){
        //! get the data from the collection
        System.out.println ("get the data from the collection");
        for (Document document : Usercollection.find()) {
            System.out.println(document);
        }
    }

    void AddNewUser (String username, String user_password, MongoCollection<Document> collection) {
        // TODO : add new user to the collection
        Document newUser = new Document ("username", username).append ("password", user_password);
        //! check user is existed or not
        Document UserExists = collection.find (eq ("username", username)).first ();
        if (UserExists == null) {
            collection.insertOne (newUser);
            System.out.println ("User added");
        } else {
            System.out.println ("User already exists");
        }
    }

    // Login in user
    public String Login(String username, String user_password){
        // TODO : check the user password

        Document foundUser =  Usercollection.find (eq ("username", username)).first ();
        if (foundUser != null) {
            String password = foundUser.getString ("password");
            if (password.equals (user_password)) {
                System.out.println ("Login success");
                return "success";
            } else {
                System.out.println ("Login failed");
                return "failed";
            }
        } else {
            System.out.println ("User not found");
            return "not found";
        }
    }


    // ! Register User with name , user_password , pan, phone , email

    public void RegisterUser(String username, String user_password,String pan, String phone, String email){
        // TODO : add new user to the collection
        Document newUser = new Document ("username", username).append ("password", user_password).append ("pan", pan).append ("phone", phone).append ("email", email);
        //! check user is existed or not
        Document UserExists = Usercollection.find (eq ("username", username)).first ();
        if (UserExists == null) {
            Usercollection.insertOne (newUser);
            System.out.println ("User added");
        } else {
            System.out.println ("User already exists");
        }

    }
}
