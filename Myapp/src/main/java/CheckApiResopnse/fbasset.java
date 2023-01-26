package CheckApiResopnse;

public class fbasset {


    public static void main(String args[]) throws Exception {

        String url = "https://graph.facebook.com/111256078026430_189210660230971?fields=reactions.summary(total_count)&access_token=137849379759527%257C_xwDi80i-9kVUUd82ykVuOvTOPA";
        Myhttpclient obj=new Myhttpclient();
        obj.sendGet(url);
        obj.close();

    }


    }

