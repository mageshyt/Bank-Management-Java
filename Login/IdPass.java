package Login;

import java.util.HashMap;

public class IdPass {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    public IdPass(){
        logininfo.put("Hemanth","bell");
        logininfo.put("Magesh","sathu");
        logininfo.put("Ranjith","kolaru");
        logininfo.put("Nithish","Nithi@123");

    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
