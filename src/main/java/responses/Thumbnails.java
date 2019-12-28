
package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnails {

    @JsonProperty("default")
    private Default idefault;

    @JsonProperty("high")
    private High high;

    @JsonProperty("medium")
    private Medium medium;

    public Thumbnails(Default idefault, High high, Medium medium) {
        this.idefault = idefault;
        this.high = high;
        this.medium = medium;
    }

    public Default getIdefault() {
        return idefault;
    }

    public void setIdefault(Default idefault) {
        this.idefault = idefault;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }
}
