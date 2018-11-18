package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HonoraryAndAward {
    @JsonProperty("time")
    String time;

    @JsonProperty("award")
    String award;

    @JsonProperty("name")
    String competitionName;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
}
