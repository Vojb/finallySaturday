package com.example.vojb.finallysaturday;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vojb on 2018-01-13.
 */
public class BetGameAdapter extends RecyclerView.Adapter<BetGameAdapter.ViewHolder>{
    private ArrayList<BetGame> betGames = new ArrayList<BetGame>();
    private Context mContext;
    int positionList=0;

    /**
     * Adds a betGame to list
     *
     * @param betGame
     */
    public void add(BetGame betGame) {
        betGames.add(betGame);
        notifyDataSetChanged();
    }



    /**
     * Viewholder class who holds the textviews and linearlayout
     */
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mTextViewAway, mTextViewHome,textViewMatchNumber;
        private CheckBox mCheckBoxAway, mCheckBoxDraw, mCheckBoxHome;
        private LinearLayout mBackgroundLinearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            mBackgroundLinearLayout = itemView.findViewById(R.id.backgroundLinearLayout);
            mTextViewAway = itemView.findViewById(R.id.textViewRowAwayTeam);
            mTextViewHome = itemView.findViewById(R.id.textViewRowHomeTeam);
            mCheckBoxAway = itemView.findViewById(R.id.checkBoxAway);
            mCheckBoxDraw = itemView.findViewById(R.id.checkBoxDraw);
            mCheckBoxHome = itemView.findViewById(R.id.checkBoxHome);
            textViewMatchNumber =itemView.findViewById(R.id.textViewMatchNumber);

            mCheckBoxAway.setOnClickListener(this);
            mCheckBoxDraw.setOnClickListener(this);
            mCheckBoxHome.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.checkBoxAway:
                    mCheckBoxHome.setChecked(false);
                    mCheckBoxDraw.setChecked(false);
                    break;
                case R.id.checkBoxHome:
                    mCheckBoxAway.setChecked(false);
                    mCheckBoxDraw.setChecked(false);
                    break;
                case R.id.checkBoxDraw:
                    mCheckBoxHome.setChecked(false);
                    mCheckBoxAway.setChecked(false);
                    break;
            }
        }
    }

    /**
     * Constructor for the userAdapter
     *
     * @param context
     * @param betGames
     */
    public BetGameAdapter(Context context, ArrayList<BetGame> betGames) {
        this.betGames = betGames;
        mContext = context;
    }

    /**
     * View holder set the view to user item
     *
     * @param parent
     * @param viewType
     * @return
     */
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.bet_game, parent
                , false);



        return new ViewHolder(itemView);
    }

    /**
     * Sets the view to hold textfield
     * and the position
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        BetGame gameLog = betGames.get(position);

        holder.mTextViewAway.setText(gameLog.getAwayTeam());
        holder.mTextViewHome.setText(gameLog.getHomeTeam());
        positionList =  gameLog.getMatchnumber();
        holder.textViewMatchNumber.setText(String.valueOf(positionList));

             boolean isEven = (position % 2 == 0);

             if(!isEven){
                holder.mBackgroundLinearLayout.setBackgroundColor(Color.LTGRAY);
             }

    }

    /**
     * Get challenge size
     *
     * @return
     */
    @Override
    public int getItemCount() {
        return betGames.size();
    }


}

