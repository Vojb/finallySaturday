package com.example.vojb.finallysaturday.activites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.vojb.finallysaturday.adapters.BetGameAdapter;
import com.example.vojb.finallysaturday.R;
import com.example.vojb.finallysaturday.interfaces.GUIInterface;
import com.example.vojb.finallysaturday.models.BetGame;
import com.example.vojb.finallysaturday.service.Controller;

import java.util.ArrayList;

public class PlaceBetActivity extends AppCompatActivity implements GUIInterface {

    private RecyclerView mRecyclerView;
    private BetGameAdapter mBetGameAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_bet);
        Controller controller = new Controller();
        controller.iGUI =this;

      //  mBetGameAdapter = new BetGameAdapter(this, new ArrayList<BetGame>() );
      //  mRecyclerView.setAdapter(mBetGameAdapter);
        mRecyclerView = findViewById(R.id.RecyclerViewBetGames);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(PlaceBetActivity.this);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        Log.d("hometeam","hej");
        mBetGameAdapter = new BetGameAdapter(this, new ArrayList<BetGame>() );
        mRecyclerView.setAdapter(mBetGameAdapter);
    }

    @Override
    public void addGame(BetGame betGame) {

      Log.d("hometeam","added");
     //   Collections.sort(betGames, new Comparator<BetGame>() {
     //       @Override
     //       public int compare(BetGame lhs, BetGame rhs) {
     //           // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
     //           return lhs.getMatchnumber() > rhs.getMatchnumber() ? -1 : (lhs.getMatchnumber() < rhs.getMatchnumber()) ? 1 : 0;
     //       }
     //   });
     //   Collections.reverse(betGames);

        mBetGameAdapter.add(betGame);


        // Set CustomAdapter as the adapter for RecyclerView.
    }

    @Override
    public void error(int errorCode) {

    }
}
