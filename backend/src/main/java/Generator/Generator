import com.itextpdf.text.*;

import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class Generator {

    private Resume resume;

    public Generator(){
        resume = new Resume();
    }

    public Resume getResume(){
        return resume;
    }

    public void generate() throws IOException, DocumentException{
        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, new FileOutputStream("createSamplePDF.pdf"));


        document.open();

        Paragraph name = new Paragraph(resume.getFirstName() + " " + resume.getLastName(),FontFactory.getFont(FontFactory.COURIER,20));
        name.setAlignment(1);
        document.add(name);
        document.add(Chunk.NEWLINE);

        Chunk info = new Chunk("Telephone: " + resume.getContactInfo() + "           " + "Email: " + resume.getEmail() + "\n" +
                "Address: " +  resume.getAddress());

        document.add(info);
        document.add(Chunk.NEWLINE);
        document.add(Chunk.NEWLINE);

        Paragraph edu = new Paragraph("Education  background: ");
        document.add(edu);

        for (String key : resume.getEducationBackground()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }


        Paragraph work = new Paragraph("Working experiences: ");
        document.add(work);
        for (String key : resume.getWorkExperence()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);
        }

        Paragraph award = new Paragraph("Honorary and award: ");
        document.add(award);
        for (String key : resume.getHonoraryAndAward()) {
            Chunk eduChunk = new Chunk("        " + key);
            document.add(eduChunk);

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
