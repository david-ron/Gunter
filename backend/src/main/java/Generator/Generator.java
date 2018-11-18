package Generator;
import com.itextpdf.text.*;

import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

import model.EducationBackground;
import model.HonoraryAndAward;
import model.Resume;
import model.WorkExperience;

public class Generator {

    private Resume resume;
    private String fileName;

    public Generator(String fileName){this.fileName = fileName;}

    public Resume getResume(){
        return resume;
    }
    public void setResume(Resume resume){this.resume = resume;}

    public void generate() throws IOException, DocumentException{
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream(fileName));

        document.open();

        Paragraph name = new Paragraph(resume.getFirstName() + " " + resume.getLastName(),FontFactory.getFont(FontFactory.COURIER,20));
        name.setAlignment(1);
        document.add(name);
        document.add(Chunk.NEWLINE);

        Chunk info = new Chunk("Telephone: " + resume.getContactInfo() + "\n" + "           " + "Email: " + resume.getEmail() + "\n" +
                "Address: " +  resume.getAddress());

        document.add(info);
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);

        Paragraph edu = new Paragraph("Education  background: ", FontFactory.getFont(FontFactory.COURIER,15));
        document.add(edu);

        for (EducationBackground key : resume.getEducationBackground()) {
            Chunk start = new Chunk("        StartTime: " + key.getStartTime());
            document.add(start);
            Chunk end = new Chunk("        EndTime: " + key.getEndTime());
            document.add(end);
            Chunk deg = new Chunk("        Degree: " + key.getDegree());
            document.add(deg);
            Chunk school = new Chunk("        SchoolName: " + key.getSchoolName());
            document.add(school);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        Paragraph work = new Paragraph("Working experiences: ");
        document.add(work);
        for (WorkExperience key : resume.getWorkExperience()) {
            Chunk companyName = new Chunk("        CompanyName: " + key.getCompanyName());
            document.add(companyName);
            Chunk start = new Chunk("        StartTime: " + key.getStart_time());
            document.add(start);
            Chunk end = new Chunk("        EndTime: " + key.getEnd_time());
            document.add(end);
            Chunk Des = new Chunk("        Description: " + key.getDescription());
            document.add(Des);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        Paragraph award = new Paragraph("Honorary and award: ");
        document.add(award);

        for (HonoraryAndAward key : resume.getHonoraryAndAward()) {
            Chunk time = new Chunk("        Time" + key.getTime());
            document.add(time);
            Chunk anyAward = new Chunk("        Award" + key.getAward());
            document.add(anyAward);
            Chunk com = new Chunk("        CompetitionName" + key.getCompetitionName());
            document.add(com);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        Paragraph skill = new Paragraph("Skills and talents: ");
        document.add(skill);
        for (String key : resume.getSkillsOrTalent()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        Paragraph self = new Paragraph("Self Introduction: ");
        document.add(self);
        Chunk selfChunk = new Chunk("        " + resume.getSelfIntroduction());
        document.add(selfChunk);

        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);

        Paragraph target = new Paragraph("Target position: ");
        document.add(target);
        for (String key : resume.getTargetPosition()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        document.close();
    }
}
