package com.example.vojb.finallysaturday.interfaces;

import com.example.vojb.finallysaturday.models.BetGame;

/**
 * Created by Vojb on 2018-01-16.
 */

public interface ControllerInterface {

        public void addGame(BetGame betGame);

        public void error(int errorCode);


}
