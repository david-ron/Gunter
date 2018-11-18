import { Component, OnInit } from '@angular/core';
import { Resume } from '../model/Resume';
import { EduBackground } from "../model/EduBackground";
import { TranslateService } from '../service/translate.service';

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
    firstname : "",
    lastname : "",
    work: [{name: "567", startTime: new Date(), endTime: new Date(), description: ""}],
    edu: [{name: "123", startTime: new Date(), endTime: new Date(), degree: ""}],
    skills: ["testskill"],
    awards: [{name: "test", time: new Date(), award: "first prize"}],
    email: "",
    contact: "",
    addr: ""
  };

  constructor(private translateService: TranslateService) { }

  ngOnInit() {
  }

  handleClick(event: any){
    console.log(this.resume);
    this.translateService.translate(this.resume).subscribe(ret => {
      console.log(ret);}
    );
  }

}
