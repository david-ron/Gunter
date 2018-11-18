import { Experience } from "./Experience";
import { EduBackground } from "./EduBackground";
import { Award } from "./Award";

export class Resume {
    firstname: String;
    lastname: String;
    contact: String;
    work: Experience[];
    edu: EduBackground[];
    skills: String[];
    awards: Award[];
}