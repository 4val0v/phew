import { Post } from './../model/post';
import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TimelineService {

  constructor(
    private http: HttpClient,
  ) { }

  getPosts(): Observable<Post[]> {
    const header: HttpHeaders = new HttpHeaders({
      'Content-Type': 'application/json; charset=utf-8'
    });
    
    return this.http.get<Post[]>('http://localhost:8080/posts', { headers: header });
  }
}
