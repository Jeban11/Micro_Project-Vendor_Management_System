import { Component } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Login } from '../Models/login';
import { LoginService } from '../Services/login.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  login:Login;
  myForm:FormGroup;
  flag:boolean=false;
 
  constructor(private service:LoginService ,private router:Router) {


    this.myForm = new FormGroup(
      {
        username: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
        password:new FormControl('',[Validators.required,Validators.pattern('')]),
      }
    );
 
     this.login=new Login();
  }




   Logindata(data:any){
   this.login.username=data.username;
   this.login.password=data.password;


  this.service.insertData(this.login).subscribe(
    (resultdata:any)=> {
      console.log(resultdata)


      
      if(resultdata.message=="User Success"){
        this.router.navigate(['/front']);
      }
      else{
        alert("Invalid User");
      }
    }
   );
  }


}
