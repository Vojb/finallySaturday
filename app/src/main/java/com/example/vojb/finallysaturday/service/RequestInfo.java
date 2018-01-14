
package com.example.vojb.finallysaturday.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestInfo {

    @SerializedName("elapsedTime")
    @Expose
    private Integer elapsedTime;
    @SerializedName("apiVersion")
    @Expose
    private Integer apiVersion;

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Integer apiVersion) {
        this.apiVersion = apiVersion;
    }

}
