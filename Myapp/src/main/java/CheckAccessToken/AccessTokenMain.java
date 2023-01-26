package CheckAccessToken;

import com.mongodb.*;

public class AccessTokenMain {
    // Creating a Mongo client
    public static void main(String args[]) {
        try {
            String userName="kamal";
            String password="password";
            Mongo mongo = new Mongo("127.0.0.1", 27017);

            DB database = mongo.getDB("ExtensionWebApp");
            DBCollection s = database.getCollection("datas");
            boolean auth = database.authenticate(userName, password.toCharArray());
             DBCursor dbCursor= s.find();
             while(dbCursor.hasNext())
             {
                       DBObject dbObject= dbCursor.next();
                       String name=(String) dbObject.get("content");
                       System.out.println(name);
             }

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }

    }
