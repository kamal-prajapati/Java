package JDBC;

public class Channel_Detail {
    private String ChannelID;
    private String ChannelName;
    private String Feeder_Day_Range;
    private String Feeder_Page_Range;
    private String Country;

    public String getChannelID() {
        return ChannelID;
    }

    public String getChannelName() {
        return ChannelName;
    }

    public String getFeeder_Day_Range() {
        return Feeder_Day_Range;
    }

    public String getFeeder_Page_Range() {
        return Feeder_Page_Range;
    }

    public String getCountry() {
        return Country;
    }

    public void setChannelID(String channelID) {
        ChannelID = channelID;
    }

    public void setChannelName(String channelName) {
        ChannelName = channelName;
    }

    public void setFeeder_Day_Range(String feeder_Day_Range) {
        Feeder_Day_Range = feeder_Day_Range;
    }

    public void setFeeder_Page_Range(String feeder_Page_Range) {
        Feeder_Page_Range = feeder_Page_Range;
    }

    public void setCountry(String country) {
        Country = country;
    }

}
