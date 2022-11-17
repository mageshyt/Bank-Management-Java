package MongoDb;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.mindrot.jbcrypt.BCrypt;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.Date;

import static com.mongodb.client.model.Filters.eq;


public class Auth {
    //! get name from mongodb.java
    MongoCollection<Document> Usercollection;
  public static   long waitingTime;

    public static Document CurrentUser;
    private String password;

    public Auth(){
        Mongodb mongodb = new Mongodb();

        Usercollection = Mongodb.Usercollection;
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

    public void LockUser(String username){
        //! lock the user
        Document foundUser =  Usercollection.find (eq ("username",username)).first ();
        foundUser.put("islocked",true);
        LocalDateTime lockTime = LocalDateTime.now().plusDays(1);
        foundUser.put("lockTime",lockTime);
        Usercollection.replaceOne (eq ("username",username),foundUser);


    }

    public long LockTime(Date date) throws ParseException {
        // format to local date time
        LocalDateTime lockTime = date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime();
        // get current time
        LocalDateTime currentTime = LocalDateTime.now();
        // get difference hrs
        long diff=java.time.Duration.between(currentTime, lockTime ).toHours();

        return diff;


    }
    // Login in user
    public String Login(String username, String user_password) throws ParseException {
        // TODO : check the user password

        Document foundUser =  Usercollection.find (eq ("username",username)).first ();
        // get isLocked boole from the user
        assert foundUser != null;
        boolean isLocked = foundUser.getBoolean ("islocked");
        if(isLocked){
            waitingTime=LockTime(foundUser.getDate("lockTime"));
            if(waitingTime>0){
                return "locked";
            }
            else{
                foundUser.put("islocked",false);
                Usercollection.replaceOne (eq ("username",username),foundUser);
            }
        }

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
        Document newUser = new Document ("username", username).append ("password", hashedPassword).append ("pan", pan).append ("phone", phone).append ("email", email).append ("balance", 0).append ("islocked",false).append ("lockTime",null);

        //! check user is existed or not
        Document UserExists = Usercollection.find (eq ("username", username)).first();
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
