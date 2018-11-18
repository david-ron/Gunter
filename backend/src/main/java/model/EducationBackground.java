package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EducationBackground {
    @JsonProperty("startTime")
    String startTime;

    @JsonProperty("endTime")
    String endTime;

    @JsonProperty("degree")
    String degree;

    @JsonProperty("name")
    String schoolName;


    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
