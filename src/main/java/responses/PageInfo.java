
package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PageInfo {

    @JsonProperty("resultsPerPage")
    private String resultsPerPage;

    @JsonProperty("totalResults")
    private String totalResults;

    public PageInfo(String resultsPerPage, String totalResults) {
        this.resultsPerPage = resultsPerPage;
        this.totalResults = totalResults;
    }

    public String getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(String resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }
}
