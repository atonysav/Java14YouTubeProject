
package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Snippet {

    @JsonProperty("channelId")
    private String channelId;

    @JsonProperty("channelTitle")
    private String channelTitle;

    @JsonProperty("description")
    private String description;

    @JsonProperty("liveBroadcastContent")
    private String liveBroadcastContent;

    @JsonProperty("publishedAt")
    private String publishedAt;

    @JsonProperty("thumbnails")
    private Thumbnails thumbnails;

    @JsonProperty("title")
    private String title;

    public Snippet(String channelId, String channelTitle, String description, String liveBroadcastContent, String publishedAt, Thumbnails thumbnails, String title) {
        this.channelId = channelId;
        this.channelTitle = channelTitle;
        this.description = description;
        this.liveBroadcastContent = liveBroadcastContent;
        this.publishedAt = publishedAt;
        this.thumbnails = thumbnails;
        this.title = title;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getChannelTitle() {
        return channelTitle;
    }

    public void setChannelTitle(String channelTitle) {
        this.channelTitle = channelTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Thumbnails getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(Thumbnails thumbnails) {
        this.thumbnails = thumbnails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
