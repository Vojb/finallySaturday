
package com.example.vojb.finallysaturday.service;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("eventNumber")
    @Expose
    private Integer eventNumber;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("extraInfo")
    @Expose
    private Object extraInfo;
    @SerializedName("eventTypeDescription")
    @Expose
    private String eventTypeDescription;
    @SerializedName("participantType")
    @Expose
    private String participantType;
    @SerializedName("outcomes")
    @Expose
    private Object outcomes;
    @SerializedName("odds")
    @Expose
    private Object odds;
    @SerializedName("distribution")
    @Expose
    private Distribution distribution;
    @SerializedName("newspaperAdvice")
    @Expose
    private NewspaperAdvice newspaperAdvice;
    @SerializedName("league")
    @Expose
    private League league;
    @SerializedName("participants")
    @Expose
    private List<Participant> participants = null;
    @SerializedName("sportEventId")
    @Expose
    private Integer sportEventId;
    @SerializedName("sportEventStart")
    @Expose
    private String sportEventStart;

    public Integer getEventNumber() {
        return eventNumber;
    }

    public void setEventNumber(Integer eventNumber) {
        this.eventNumber = eventNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    public String getEventTypeDescription() {
        return eventTypeDescription;
    }

    public void setEventTypeDescription(String eventTypeDescription) {
        this.eventTypeDescription = eventTypeDescription;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public Object getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(Object outcomes) {
        this.outcomes = outcomes;
    }

    public Object getOdds() {
        return odds;
    }

    public void setOdds(Object odds) {
        this.odds = odds;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public NewspaperAdvice getNewspaperAdvice() {
        return newspaperAdvice;
    }

    public void setNewspaperAdvice(NewspaperAdvice newspaperAdvice) {
        this.newspaperAdvice = newspaperAdvice;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public Integer getSportEventId() {
        return sportEventId;
    }

    public void setSportEventId(Integer sportEventId) {
        this.sportEventId = sportEventId;
    }

    public String getSportEventStart() {
        return sportEventStart;
    }

    public void setSportEventStart(String sportEventStart) {
        this.sportEventStart = sportEventStart;
    }

}
