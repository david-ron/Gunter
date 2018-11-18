import { Injectable } from '@angular/core';
import {Resume} from  './model/Resume';
import { HttpClient, HttpParams } from '@angular/common/http';
// #docregion http-options
import { HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
  })
};
export class ResumeService {
 resumeUrl = '/upload';  // URL to web api
 private handleError: HandleError;
constructor() {
      private http: HttpClient,
      httpErrorHandler: HttpErrorHandler) {
      this.handleError = httpErrorHandler.createHandleError('ResumeService');
    }
const uploadResume  = (resume) => {
    return this.http.post<Resume>(this.resumeUrl, resume, httpOptions)
      .pipe(
        catchError(this.handleError('uploadResume', resume))
      );
  }
}
}
