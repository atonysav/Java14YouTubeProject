package UserInterface;

public class SearchResult {
    private String videoName;
    private String channelName;
    private String dataPublication;

    public SearchResult(String videoName, String channelName, String dataPublication) {
        this.videoName = videoName;
        this.channelName = channelName;
        this.dataPublication = dataPublication;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDataPublication() {
        return dataPublication;
    }

    public void setDataPublication(String dataPublication) {
        this.dataPublication = dataPublication;
    }
    public String toString(){
        return "Название видео "+ videoName +" Имя канала " + channelName + " Дата публикации " + dataPublication;
    }

}
