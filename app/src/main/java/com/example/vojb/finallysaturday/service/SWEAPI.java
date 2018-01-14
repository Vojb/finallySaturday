package com.example.vojb.finallysaturday.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Vojb on 2018-01-14.
 */

public interface SWEAPI {

    String STARTPOINT = "https://api.www.svenskaspel.se/";

    @GET("external/draw/topptipset/draws?page=1&accesskey=a3fc786d-eef8-425d-8bce-e4656fd9d8e8")
    Call<SvenskaSpelModel> getTopptipset();

    @GET("external/draw/stryktipset/draws?page=1&accesskey=a3fc786d-eef8-425d-8bce-e4656fd9d8e8")
    Call<SvenskaSpelModel> getStryktipset();
}
