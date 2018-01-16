package com.example.vojb.finallysaturday.service;

import com.example.vojb.finallysaturday.models.BetGame;
import com.example.vojb.finallysaturday.interfaces.GUIInterface;
import com.example.vojb.finallysaturday.interfaces.ControllerInterface;

/**
 * Created by Vojb on 2018-01-16.
 */

public class Controller implements ControllerInterface {

    public GUIInterface iGUI;
    public Controller(){

        APISvenskaSpelCaller apiSvenskaSpelCaller = new APISvenskaSpelCaller();
        apiSvenskaSpelCaller.startCallForTodaysMatches();
        apiSvenskaSpelCaller.iBetGame = this;
    }

    @Override
    public void addGame(BetGame betGame) {
        iGUI.addGame(betGame);

    }

    @Override
    public void error(int errorCode) {
        iGUI.error(errorCode);
    }
}
