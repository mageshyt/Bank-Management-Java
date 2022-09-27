import java.util.HashMap;

public class IdPass {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    IdPass(){
        logininfo.put("Hemanth","abu");
        logininfo.put("Magesh","dhanu");
        logininfo.put("Ranjith","kolaru");
        logininfo.put("Nithish","Nithi@123");


    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
