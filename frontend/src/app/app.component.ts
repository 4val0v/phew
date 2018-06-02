import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { AppService } from './app.service';
import { Router } from '@angular/router';
import { tap, catchError, finalize } from 'rxjs/operators';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  constructor(private app: AppService, private http: HttpClient,  private router: Router) {
    this.app.authenticate(undefined, undefined);
  }

  logout() {
    this.http.post('logout', {}).pipe(
      tap(obj => console.log(obj)),
      catchError(obj => obj),
      finalize(function() {
        this.app.authenticated = false;
        this.router.navigateByUrl('/login');
      })
    );
  }
}
