
package com.example.vojb.finallysaturday.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Distribution {

    @SerializedName("home")
    @Expose
    private String home;
    @SerializedName("draw")
    @Expose
    private String draw;
    @SerializedName("away")
    @Expose
    private String away;

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getDraw() {
        return draw;
    }

    public void setDraw(String draw) {
        this.draw = draw;
    }

    public String getAway() {
        return away;
    }

    public void setAway(String away) {
        this.away = away;
    }

}
