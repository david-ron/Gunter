package Generator;
import com.itextpdf.text.*;

import com.itextpdf.text.pdf.PdfPTable;
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

        Chunk info = new Chunk("Telephone: " + resume.getContactInfo() + "\n" + "Email: " + resume.getEmail() + "\n" +
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
            document.add(Chunk.NEWLINE);
            Chunk school = new Chunk("        SchoolName: " + key.getSchoolName());
            document.add(school);
            document.add(Chunk.NEWLINE);
            Chunk deg = new Chunk("        Degree: " + key.getDegree());
            document.add(deg);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }
        PdfPTable tt = new PdfPTable(2);
        tt.setWidthPercentage(100f);
        tt.getDefaultCell().setBorderWidthLeft(0);
        tt.getDefaultCell().setBorderWidthRight(0);
        tt.getDefaultCell().setBorderWidthTop(0);
        tt.addCell(" ");
        tt.addCell(" ");

        document.add(tt);

        Paragraph work = new Paragraph("Working experiences: ",FontFactory.getFont(FontFactory.COURIER,15));
        document.add(work);
        for (WorkExperience key : resume.getWorkExperience()) {
            Chunk companyName = new Chunk("        CompanyName: " + key.getCompanyName());
            document.add(companyName);
            document.add(Chunk.NEWLINE);
            Chunk start = new Chunk("        StartTime: " + key.getStart_time());
            document.add(start);
            document.add(Chunk.NEWLINE);
            Chunk end = new Chunk("        EndTime: " + key.getEnd_time());
            document.add(end);
            document.add(Chunk.NEWLINE);
            Chunk Des = new Chunk("        Description: " + key.getDescription());
            document.add(Des);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        document.add(tt);

        Paragraph award = new Paragraph("Honorary and award: ",FontFactory.getFont(FontFactory.COURIER,15));
        document.add(award);

        for (HonoraryAndAward key : resume.getHonoraryAndAward()) {

            Chunk com = new Chunk("        AwardTitles: " + key.getCompetitionName());
            document.add(com);
            document.add(Chunk.NEWLINE);

            Chunk time = new Chunk("        Time: " + key.getTime());
            document.add(time);
            document.add(Chunk.NEWLINE);
            Chunk anyAward = new Chunk("        Award: " + key.getAward());
            document.add(anyAward);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        document.add(tt);

        Paragraph skill = new Paragraph("Skills and talents: ",FontFactory.getFont(FontFactory.COURIER,15));
        document.add(skill);
        for (String key : resume.getSkillsOrTalent()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

//        Paragraph self = new Paragraph("Self Introduction: ",FontFactory.getFont(FontFactory.COURIER,15));
//        document.add(self);
//        Chunk selfChunk = new Chunk("        " + resume.getSelfIntroduction());
//        document.add(selfChunk);
//
//        document.add(Chunk.NEWLINE);
//        document.add(Chunk.NEWLINE);

//        Paragraph target = new Paragraph("Target position: ",FontFactory.getFont(FontFactory.COURIER,15));
//        document.add(target);
//        for (String key : resume.getTargetPosition()) {
//            Chunk eduChunk = new Chunk("        " + key);
//            document.add(eduChunk);
//
//            document.add(Chunk.NEWLINE);
//            document.add(Chunk.NEWLINE);
//        }

        document.close();
    }
}
