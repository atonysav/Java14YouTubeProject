
package responses;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Item {

    @JsonProperty("etag")
    private String etag;

    @JsonProperty("id")
    private Id id;

    @JsonProperty("kind")
    private String kind;

    @JsonProperty("snippet")
    private Snippet snippet;

    public Item(String etag, Id id, String kind, Snippet snippet) {
        this.etag = etag;
        this.id = id;
        this.kind = kind;
        this.snippet = snippet;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Snippet getSnippet() {
        return snippet;
    }

    public void setSnippet(Snippet snippet) {
        this.snippet = snippet;
    }
}
