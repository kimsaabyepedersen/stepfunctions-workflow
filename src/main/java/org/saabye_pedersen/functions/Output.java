package org.saabye_pedersen.functions;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
class Output {

    @JsonProperty("Case")
    private String caseId;
    @JsonProperty("Message")
    private String message;
    @JsonProperty("Status")
    private Integer status;

    Output(String caseId, String message) {
        this.caseId = caseId;
        this.message = message;
    }

    Output(String caseId, String message, int status) {
        this.caseId = caseId;
        this.message = message;
        this.status = status;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
