package ExternalTestProgram;

public class channelDetail {
    private String ChannelName;
    private String ChannelId;
    private String Feeder_Day_Range;
    private String Feeder_Page_Range;
    private String Country;

    public void setChannelName( String ChannelName)
    {
        this.ChannelName=ChannelName;
    }
    public void setChannelId( String ChannelId)
    {
        this.ChannelId=ChannelId;
    }
    public void setFeeder_Day_Range( String Feeder_Day_Range)
    {
        this.Feeder_Day_Range=Feeder_Day_Range;
    }
    public void setFeeder_Page_Range( String Feeder_Page_Range)
    {
        this.Feeder_Page_Range=Feeder_Page_Range;
    }
    public void setCountry( String Country)
    {
        this.Country=Country;
    }

    public String getChannelName()
    {
        return ChannelName;
    }
    public String getChannelId()
    {
        return ChannelId;
    }
    public String getFeeder_Day_Range()
    {
        return Feeder_Day_Range;
    }
    public String getFeeder_Page_Range()
    {
        return Feeder_Page_Range;
    }

    public String getCountry()
    {
        return Country;
    }


}
