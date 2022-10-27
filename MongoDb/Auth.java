package MongoDb;

import com.mongodb.client.MongoCollection;
import org.bson.Document;

import static com.mongodb.client.model.Filters.eq;




public class Auth {


    //! get the collection data
    void getUsersData(MongoCollection<Document> Usercollection){
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
    void Login(String username, String user_password, MongoCollection<Document> collection) {
        // TODO : check the user password

        Document foundUser =  collection.find (eq ("username", username)).first ();
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




}
