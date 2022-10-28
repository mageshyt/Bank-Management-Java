package MongoDb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

import java.security.PublicKey;

import static com.mongodb.client.model.Filters.eq;




public class Auth {
    //! get name from mongodb.java
    MongoCollection<Document> Usercollection;

    public static Document CurrentUser=new Document (
            "username", "hemanth"
    ).append (
            "phone", "8438829958"
    ).append (
            "password", "hema"
    ).append (
            "balance", 1000
    );
    private String password;

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

    public String HashPassword(String password){
        //! TODO : hash the password
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        return hashed;
    };

    public  boolean CheckPassword(String password, String hashed){
        //! TODO : check the password
        if (BCrypt.checkpw(password, hashed)) {
            System.out.println("It matches");
            return true;
        } else {
            System.out.println("It does not match");
            return false;
        }
    }
    void AddNewUser (String username, String user_password, MongoCollection<Document> collection) {
        // ! hash the password before adding to the database
        String hashedPassword = HashPassword (user_password);

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
        if(foundUser ==null) return "User not found"; String hashedPassword = foundUser.getString ("password");
        System.out.println (hashedPassword+" user ");
            if (CheckPassword (user_password, hashedPassword)) {
                System.out.println ("Login success");
                CurrentUser = foundUser;
                return "success";
            } else {
                System.out.println ("Login failed");
                return "failed";
            }

    }


    // ! Register User with name , user_password , pan, phone , email

    public void RegisterUser(String username, String user_password,String pan, String phone, String email){
        // TODO : add new user to the collection
        String hashedPassword = HashPassword (user_password);
        Document newUser = new Document ("username", username).append ("password", hashedPassword).append ("pan", pan).append ("phone", phone).append ("email", email).append ("balance", 0);
        //! check user is existed or not
        Document UserExists = Usercollection.find (eq ("username", username)).first ();
        if (UserExists == null) {
            Usercollection.insertOne (newUser);
            System.out.println ("User added");
        } else {
            System.out.println ("User already exists");
        }

    }
    // to update the user password
    public void UpdateUserPassword(String username, String user_password){
        // TODO : update the user password
        String hashedPassword = HashPassword (user_password);
        Document foundUser =  Usercollection.find (eq ("username", username)).first ();
        if (foundUser != null) {
            foundUser.put ("password", hashedPassword);
            Usercollection.updateOne (eq ("username", username), new Document ("$set", foundUser));
            System.out.println ("Password updated");
        } else {
            System.out.println ("User not found");
        }
    }
}
