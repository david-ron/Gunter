import { Component, OnInit } from '@angular/core';
import { Resume } from './model/Resume';
import { ResumeService } from './resume.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  constructor(private resumeService: ResumeService) { }
  ngOnInit() {  }
  title = 'ResumeServices';
  const newResume = (args) =>{
    //if missing information
    //if (parameters) { return; }
    //  ploadresummeService
    this.resumeService.uploadResume(resume);

  }





}
