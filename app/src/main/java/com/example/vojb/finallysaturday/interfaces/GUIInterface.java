package com.example.vojb.finallysaturday.interfaces;

import com.example.vojb.finallysaturday.models.BetGame;

/**
 * Created by Vojb on 2018-01-14.
 * Bet interface
 */

public interface GUIInterface {

    void addGame(BetGame betGame);

    void error(int errorCode);
}
