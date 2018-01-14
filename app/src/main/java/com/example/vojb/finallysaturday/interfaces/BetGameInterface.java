package com.example.vojb.finallysaturday.interfaces;

import com.example.vojb.finallysaturday.BetGame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vojb on 2018-01-14.
 */

public interface BetGameInterface {

    public void addGame(BetGame betGame);

    public void error(int errorCode);
}
