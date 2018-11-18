//this url should be sent to user when they click on 'match me' on the website

package ImageToString;
import model.Resume;

import java.util.ArrayList;
import java.io.*;
public class ImageStringMaker {

    public ImageStringMaker() {
    }

    public static void makeString(String path) throws Exception {


//        String pyPath = "/Users/xiyunzhang/Desktop/Gunter/backend/src/main/java/ImageToString/script_python.py";

        String pyPath = new File("src/main/java/ImageToString/script_python.py").getAbsolutePath();

        ProcessBuilder ps=new ProcessBuilder("python3",
                pyPath,path);

        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");



        ps.redirectErrorStream(true);

        Process pr = ps.start();

        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line;
        while ((line = in.readLine()) != null) {
            writer.println(line);
        }
        pr.waitFor();
        writer.close();

        in.close();
        System.exit(0);
    }