import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Login } from 'src/app/Models/login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private url: string = "http://localhost:1111";


  constructor(private http: HttpClient) { }
  insertData(login: Login) {
    return this.http.post(this.url + "/login", login);
    
  }
}
