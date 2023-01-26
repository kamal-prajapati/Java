package CheckAccessToken;

import com.mongodb.*;

public class productionToken {
    public static void main(String args[])
    {
     try {
        String userName="root";
        String password="brandtology";
        Mongo mongo = new Mongo("192.168.51.241", 20000);

        DB database = mongo.getDB("brandtology");
        DBCollection s = database.getCollection("FBAccessToken");
        boolean auth = database.authenticate(userName, password.toCharArray());

        displaydata(s);
    }catch (Exception e)
    {
        System.out.println(e);
    }
}
    public static  void displaydata(DBCollection s) {
        DBCursor dbCursor = s.find();
        while (dbCursor.hasNext()) {
            DBObject data = dbCursor.next();

            // Get the individual fields of the student document.
            // These individual fields could, for example, be put in text fields of a GUI.
            String name = (String) data.get("AccessToken");
            System.out.println(name);
        }
    }
}
