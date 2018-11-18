import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Resume } from '../model/Resume';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};


@Injectable({
  providedIn: 'root'
})
export class TranslateService {

  private hostUrl = "http://localhost:25000/upload";

  constructor(private http: HttpClient) { }

  translate(resume: Resume) : Observable<Blob> {
    console.log(resume);
      return this.http.post<Blob>(this.hostUrl, resume, httpOptions);
  }
}
