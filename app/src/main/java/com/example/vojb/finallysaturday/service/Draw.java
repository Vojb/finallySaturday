
package com.example.vojb.finallysaturday.service;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Draw {

    @SerializedName("drawComment")
    @Expose
    private String drawComment;
    @SerializedName("extraInfo")
    @Expose
    private Object extraInfo;
    @SerializedName("fund")
    @Expose
    private Object fund;
    @SerializedName("events")
    @Expose
    private List<Event> events = null;
    @SerializedName("productName")
    @Expose
    private String productName;
    @SerializedName("productId")
    @Expose
    private Integer productId;
    @SerializedName("drawNumber")
    @Expose
    private Integer drawNumber;
    @SerializedName("openTime")
    @Expose
    private String openTime;
    @SerializedName("closeTime")
    @Expose
    private String closeTime;
    @SerializedName("turnover")
    @Expose
    private String turnover;
    @SerializedName("checksum")
    @Expose
    private String checksum;

    public String getDrawComment() {
        return drawComment;
    }

    public void setDrawComment(String drawComment) {
        this.drawComment = drawComment;
    }

    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Object getFund() {
        return fund;
    }

    public void setFund(Object fund) {
        this.fund = fund;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getDrawNumber() {
        return drawNumber;
    }

    public void setDrawNumber(Integer drawNumber) {
        this.drawNumber = drawNumber;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getTurnover() {
        return turnover;
    }

    public void setTurnover(String turnover) {
        this.turnover = turnover;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

}
