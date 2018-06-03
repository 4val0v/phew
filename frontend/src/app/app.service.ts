import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AppService {
  authenticated: Boolean = false;

  constructor(private http: HttpClient) {
  }

  authenticate(credentials, callback) {

    console.log('認証' + this.authenticated);

    const headers = new HttpHeaders(credentials ? {
      authorization : 'Basic' + btoa(credentials.username + ':' + credentials.password)
    } : {});

    console.log(credentials);

    this.http.get('http://localhost:8080/user', { headers: headers }).subscribe(response => {
      if (response['name']) {
        this.authenticated = true;
      } else {
        this.authenticated = false;
      }
      return callback && callback();
    });
  }
}
