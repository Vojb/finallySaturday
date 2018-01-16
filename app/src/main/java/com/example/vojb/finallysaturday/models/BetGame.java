package com.example.vojb.finallysaturday.models;


public class BetGame {
    private String homeTeam;
    private String awayTeam;
    private  GameBet gameBet;
    private  int matchnumber;


    private int betGameid;

    public int getMatchnumber() {
        return matchnumber;
    }

    public void setMatchnumber(int matchnumber) {
        this.matchnumber = matchnumber;
    }

    public enum GameBet{DRAW,HOMEWIN,AWAYWIN}

    public BetGame(String hometeam, String awayteam,int matchnr ,int id){
        homeTeam = hometeam;
        awayTeam = awayteam;
        matchnumber=matchnr;
        betGameid= id;
    }
    public BetGame(String hometeam, String awayteam){
        homeTeam = hometeam;
        awayTeam = awayteam;
    }

    public void setGameBet(GameBet gameBet) {
        this.gameBet = gameBet;
    }

    public GameBet getGameBet() {
        return gameBet;
    }
    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getBetGameid() {
        return betGameid;
    }

    public void setBetGameid(int betGameid) {
        this.betGameid = betGameid;
    }
}
