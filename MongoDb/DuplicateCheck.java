package MongoDb;

import com.mongodb.client.MongoCollection; import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;


public class DuplicateCheck {
    //! get name from mongodb.java
     MongoCollection<Document> Usercollection;

    public DuplicateCheck(){
        Mongodb mongodb = new Mongodb();
        Usercollection = Mongodb.Usercollection;
    }

    public  boolean isDuplicate(String username,String FieldName){
        //! check if the username is duplicate
        Document user = Usercollection.find(eq(FieldName,username)).first();
        if(user != null){
            return true;
        }
        return false;
    }

}
