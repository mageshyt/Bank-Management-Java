package MongoDb;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.codecs.jsr310.LocalDateTimeCodec;
import org.mindrot.jbcrypt.BCrypt;

import javax.print.Doc;
import java.security.PublicKey;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.geoWithinCenterSphere;


public class Auth {
    //! get name from mongodb.java
    MongoCollection<Document> Usercollection;

    public static Document CurrentUser=new Document (
            "username", "hemanth"
    ).append (
            "phone", "8248512156"
    ).append (
            "password", "hema"
    ).append (
            "balance", 1000
    ).append("isLocked",false);
    private String password;

    public Auth(){
        Mongodb mongodb = new Mongodb();

        Usercollection = mongodb.Usercollection;
    }

   public void getUserDetail(){
        // get lockTime
          Date data=CurrentUser.getDate("lockTime");
            // format to local date time
            LocalDateTime lockTime = data.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();


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
    //! check user is locked or not
    public boolean isLocked(){
        //! check user is locked or not
        return CurrentUser.getBoolean("islocked");
    }

    public void LockTime(){
        //! get lockTime
        Date data=CurrentUser.getDate("lockTime");
        // format to local date time
        LocalDateTime lockTime = data.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();


         // get in time HH:DD:YYY






        //      //! get time and date  from lockTime
        // int lockTimeMonth=lockTime.getMonthValue();
        // int lockTimeDay=lockTime.getDayOfMonth();
        // int lockTimeHour=lockTime.getHour();
        // // get current time and find the difference
        // LocalDateTime currentTime=LocalDateTime.now();
        // int currentTimeMonth=currentTime.getMonthValue();
        // int currentTimeDay=currentTime.getDayOfMonth();

        // System.out.println("day "+lockTimeDay+ " "+ currentTimeDay);
        // // check the difference form locktime and current time
        // if(lockTimeDay > currentTimeDay && lockTimeMonth > currentTimeMonth){
        //     System.out.println("difference hrs"+ lockTimeHour + " "+ currentTimeHour );

        // }


    }
    // Login in user
    public String Login(String username, String user_password){
        // TODO : check the user password

        Document foundUser =  Usercollection.find (eq ("username", username)).first ();
        // get isLocked boole from the user
       // boolean isLocked = foundUser.getBoolean ("isLocked");
        //if(isLocked){
          //  System.out.println ("User is locked");
           // return "User is locked";
        //}

        String hashedPassword = foundUser.getString ("password");
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
