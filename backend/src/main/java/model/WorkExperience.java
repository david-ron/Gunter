package model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class WorkExperience {
    @JsonProperty("name")
    String companyName;

    @JsonProperty("startTime")
    String start_time;

    @JsonProperty("endTime")
    String end_time;

    @JsonProperty("description")
    String description;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
