package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StatusResponse {

	@JsonProperty("status")
	private String status;
}