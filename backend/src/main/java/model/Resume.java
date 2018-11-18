package model;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Resume {

    @JsonProperty("f_name")
    private String FirstName;
    @JsonProperty("l_name")
    private String LastName;
    @JsonProperty("age")
    private String Age;
    @JsonProperty("nation")
    private String Nationality;
    @JsonProperty("cotact")
    private String ContactInfo;
    @JsonProperty("work_exp")
    private ArrayList<String> WorkExperence;
    @JsonProperty("edu_bac")
    private ArrayList<String> EducationBackground;
    @JsonProperty("ski_tal")
    private ArrayList<String> SkillsOrTalent;
    @JsonProperty("honor_awa")
    private ArrayList<String> HonoraryAndAward;
    @JsonProperty("selfIntro")
    private String SelfIntroduction;
    @JsonProperty("address")
    private String address;
    @JsonProperty("email")
    private String email;
    @JsonProperty("tar_pos")
    private ArrayList<String> targetPosition;


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

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getContactInfo() {
        return ContactInfo;
    }

    public void setContactInfo(String contactInfo) {
        ContactInfo = contactInfo;
    }

    public ArrayList<String> getWorkExperence() {
        return WorkExperence;
    }

    public void setWorkExperence(ArrayList<String> workExperence) {
        WorkExperence = workExperence;
    }

    public ArrayList<String> getEducationBackground() {
        return EducationBackground;
    }

    public void setEducationBackground(ArrayList<String> educationBackground) {
        EducationBackground = educationBackground;
    }

    public ArrayList<String> getSkillsOrTalent() {
        return SkillsOrTalent;
    }

    public void setSkillsOrTalent(ArrayList<String> skillsOrTalent) {
        SkillsOrTalent = skillsOrTalent;
    }

    public ArrayList<String> getHonoraryAndAward() {
        return HonoraryAndAward;
    }

    public void setHonoraryAndAward(ArrayList<String> honoraryAndAward) {
        HonoraryAndAward = honoraryAndAward;
    }

    public String getSelfIntroduction() {
        return SelfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        SelfIntroduction = selfIntroduction;
    }
}
