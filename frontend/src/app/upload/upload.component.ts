import { Component, OnInit } from '@angular/core';
import { Resume } from '../model/Resume';
import { EduBackground } from "../model/EduBackground";

@Component({
  selector: 'app-upload',
  templateUrl: './upload.component.html',
  styleUrls: ['./upload.component.css']
})
export class UploadComponent implements OnInit {

  // profileForm = new FormGroup({
  //   firstName: new FormControl(''),
  //   lastName: new FormControl(''),
  //   contact: new FormControl(''),
  //   edu: new FormControl(''),
  //   work: new FormControl(''),
  //   skill: new FormControl(''),
  //   award: new FormControl('')
  // });

  public resume: Resume = {
    firstname : "123",
    lastname : "345",
    contact: "667",
    work: [{name: "567", startTime: new Date(), endTime: new Date(), description: ""}],
    edu: [{name: "123", startTime: new Date(), endTime: new Date(), description: ""}],
    skills: ["testskill"],
    awards: [{name: "test", time: new Date(), description: ""}],
  };

  constructor() { }

  ngOnInit() {
  }


  arrayOne(n: number): any[] {
    return Array(n);
  }

}
