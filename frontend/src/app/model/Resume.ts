import { Experience } from "./Experience";
import { EduBackground } from "./EduBackground";

export class Resume {
    FirstName: String;
    LastName: String;
    ContactInfo: String;
    WorkExperence: Experience[];
    EducationBackground: EduBackground[];
    SkillsOrTalent: String[];
    HonoraryAndAward: String;
}