package org.saabye_pedersen.functions;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Handler for requests to Lambda function.
 */
public class AssignCaseInput {

    @JsonProperty("Case")
    private String caseId;
    @JsonProperty("Message")
    private String message;

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
}
