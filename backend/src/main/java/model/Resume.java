package model;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Resume {

    @JsonProperty("firstname")
    private String FirstName;
    @JsonProperty("lastname")
    private String LastName;
    @JsonProperty("contact")
    private String ContactInfo;
    @JsonProperty("work")
    private List<WorkExperience> WorkExperience;
    @JsonProperty("edu")
    private List<EducationBackground> EducationBackground;
    @JsonProperty("skills")
    private ArrayList<String> SkillsOrTalent;
    @JsonProperty("awards")
    private List<HonoraryAndAward> HonoraryAndAward;
//    @JsonProperty("selfIntro")
    private String SelfIntroduction;
    @JsonProperty("addr")
    private String address;
    @JsonProperty("email")
    private String email;
//    @JsonProperty("tar_pos")
    private ArrayList<String> targetPosition;

    public Resume(){
        SkillsOrTalent = new ArrayList<>();
        targetPosition = new ArrayList<>();


    }

    public ArrayList<String> getTargetPosition(){return targetPosition;}

    public void setTargetPosition(ArrayList<String> targetPosition){
        this.targetPosition = targetPosition;
    }

    public String getAddress(){return address;}

    public void setAddress(String address){this.address = address;}

    public String getEmail(){ return email;}

    public void setEmail(String email) { this.email = email;}

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(String contactInfo) {
        ContactInfo = contactInfo;
    }



    public ArrayList<String> getSkillsOrTalent() {
        return SkillsOrTalent;
    }

    public void setSkillsOrTalent(ArrayList<String> skillsOrTalent) {
        SkillsOrTalent = skillsOrTalent;
    }


    public String getSelfIntroduction() {
        return SelfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        SelfIntroduction = selfIntroduction;
    }
    public List<WorkExperience> getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(List<WorkExperience> workExperience) {
        WorkExperience = workExperience;
    }

    public List<EducationBackground> getEducationBackground() {
        return EducationBackground;
    }

    public void setEducationBackground(List<EducationBackground> educationBackground) {
        EducationBackground = educationBackground;
    }

    public List<HonoraryAndAward> getHonoraryAndAward() {
        return HonoraryAndAward;
    }

    public void setHonoraryAndAward(List<HonoraryAndAward> honoraryAndAward) {
        HonoraryAndAward = honoraryAndAward;
    }
}
