import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Resume } from '../model/Resume';
import { RequestOptions, Request, RequestMethod, ResponseContentType } from '@angular/http';



@Injectable({
  providedIn: 'root'
})
export class TranslateService {

  private hostUrl = "http://localhost:8080/upload";

  constructor(private http: HttpClient) { }

  translate(resume: Resume) : Observable<any> {
    console.log(resume);
      return this.http.post(this.hostUrl, JSON.stringify(resume), {
        headers: new HttpHeaders({ 'Content-Type': 'application/json' }),
        responseType: 'blob'});
  }
}
