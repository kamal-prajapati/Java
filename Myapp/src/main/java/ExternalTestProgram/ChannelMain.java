package ExternalTestProgram;

import java.io.FileReader;
import java.util.Properties;

public class ChannelMain {

    public static void main(String args[])throws Exception
    {
        FileReader fr=new FileReader("/home/kamlesh/Documents/Channel.properties");
        Properties p=new Properties();
        p.load(fr);
        channelDetail cd=new channelDetail();
        cd.setChannelName(p.getProperty("ChannelName"));
        cd.setChannelId(p.getProperty("ChannelId"));
        cd.setFeeder_Day_Range(p.getProperty("Feeder_Day_Range"));
        cd.setFeeder_Page_Range(p.getProperty("Feeder_Page_Range"));
        cd.setCountry(p.getProperty("Country"));
        System.out.print(cd.getChannelName()+" "+cd.getChannelId()+" "+cd.getFeeder_Day_Range()+" "+cd.getFeeder_Page_Range()+" "+cd.getCountry());

    }

}
