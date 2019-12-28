
package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YouTubeBody {

    @JsonProperty("etag")
    private String etag;

    @JsonProperty("items")
    private ArrayList<Item> items;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("nextPageToken")
    private String nextPageToken;

    @JsonProperty("pageInfo")
    private PageInfo pageInfo;

    @JsonProperty("prevPageToken")
    private String prevPageToken;

    @JsonProperty("regionCode")
    private String regionCode;

    public YouTubeBody(String etag, ArrayList<Item> items, String kind, String nextPageToken, PageInfo pageInfo, String prevPageToken, String regionCode) {
        this.etag = etag;
        this.items = items;
        this.kind = kind;
        this.nextPageToken = nextPageToken;
        this.pageInfo = pageInfo;
        this.prevPageToken = prevPageToken;
        this.regionCode = regionCode;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getNextPageToken() {
        return nextPageToken;
    }

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public String getPrevPageToken() {
        return prevPageToken;
    }

    public void setPrevPageToken(String prevPageToken) {
        this.prevPageToken = prevPageToken;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
