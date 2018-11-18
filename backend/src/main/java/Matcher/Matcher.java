//this url should be sent to user when they click on 'match me' on the website

package Matcher;
import model.Resume;
import java.util.ArrayList;

public class Matcher {

    public static String getMatchUrl(Resume resume){
        String url = "https://ca.indeed.com/jobs?";
        String l = "&l=Montréal%2C+QC";
//        String query = "q=software+engineer";
        String query = "q=" + resume.getTargetPosition().get(0);
        ArrayList<String> targetPosition = resume.getTargetPosition();
        url = url + query + l;
        return url;

    }
}