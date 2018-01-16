package com.example.vojb.finallysaturday.service;

import android.util.Log;

import com.example.vojb.finallysaturday.models.BetGame;
import com.example.vojb.finallysaturday.interfaces.ControllerInterface;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by Vojb on 2018-01-14.
 */

public class APISvenskaSpelCaller {

    public ControllerInterface iBetGame;
    public SWEAPI sweapi;

    public APISvenskaSpelCaller() {

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(sweapi.STARTPOINT)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        sweapi = retrofit.create(SWEAPI.class);

    }

    public void startCallForTodaysMatches() {

        Call<SvenskaSpelModel> call = sweapi.getStryktipset();
        Callback<SvenskaSpelModel> firstCall = getTodaysMatches();
        call.enqueue(firstCall);
    }

    private Callback<SvenskaSpelModel> getTodaysMatches() {
        return new Callback<SvenskaSpelModel>() {
            @Override
            public void onResponse(Call<SvenskaSpelModel> call, Response<SvenskaSpelModel> response) {
                SvenskaSpelModel body = response.body();
                Draw draw = body.getDraws().get(0);
               ArrayList<BetGame> betGames = new ArrayList<BetGame>();
                for (Event tmpEvent : draw.getEvents()) {
                    BetGame betGame = new BetGame(
                            tmpEvent.getParticipants().get(0).getName(),
                            tmpEvent.getParticipants().get(1).getName(),
                            tmpEvent.getEventNumber(),tmpEvent.getSportEventId());
                    iBetGame.addGame(betGame);
                }
            }
            @Override
            public void onFailure(Call<SvenskaSpelModel> call, Throwable t) {
                iBetGame.error(1);
                Log.d("hometeam","error "+ t.getMessage());
            }
        };
    }
}
