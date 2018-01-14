
package com.example.vojb.finallysaturday.service;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SvenskaSpelModel{

    @SerializedName("error")
    @Expose
    private Object error;
    @SerializedName("requestInfo")
    @Expose
    private RequestInfo requestInfo;
    @SerializedName("requestId")
    @Expose
    private String requestId;
    @SerializedName("deviceId")
    @Expose
    private String deviceId;
    @SerializedName("session")
    @Expose
    private Object session;
    @SerializedName("sessionUser")
    @Expose
    private Object sessionUser;
    @SerializedName("clientInfo")
    @Expose
    private Object clientInfo;
    @SerializedName("draws")
    @Expose
    private List<Draw> draws = null;

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public void setRequestInfo(RequestInfo requestInfo) {
        this.requestInfo = requestInfo;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Object getSession() {
        return session;
    }

    public void setSession(Object session) {
        this.session = session;
    }

    public Object getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(Object sessionUser) {
        this.sessionUser = sessionUser;
    }

    public Object getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(Object clientInfo) {
        this.clientInfo = clientInfo;
    }

    public List<Draw> getDraws() {
        return draws;
    }

    public void setDraws(List<Draw> draws) {
        this.draws = draws;
    }

}
