package org.saabye_pedersen.functions;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Handler for requests to Lambda function.
 */
public class EscalateCaseInput {

    @JsonProperty("Case")
    private String caseId;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Status")
    private int status;

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
