package com.spring.parking.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UnparkCarRequest {
    private String finishTimestamp;

    @JsonCreator
    public UnparkCarRequest(@JsonProperty("finishTimestamp") String finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }

    public String getFinishTimestamp() {
        return finishTimestamp;
    }

    public void setFinishTimestamp(String finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }
}
