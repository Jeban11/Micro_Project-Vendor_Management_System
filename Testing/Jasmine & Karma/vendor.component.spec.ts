import { TestBed } from '@angular/core/testing';
import { VendorComponent } from './vendor.component';
import { AppComponent } from '../app.component';
import { RouterTestingModule } from '@angular/router/testing';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from '../app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


describe('Vendor Component Test', () => {
  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [VendorComponent, AppComponent],
      imports: [RouterTestingModule, BrowserModule, AppRoutingModule,
        HttpClientModule, FormsModule, ReactiveFormsModule],
    }).compileComponents();
  });
  it('Vendor component test', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const app = fixture.componentInstance;
    fixture.detectChanges();
    expect(app).toBeTruthy();
  });
  it('Vendor Insert Form GUI count', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
    const inputElements = formElement.querySelectorAll("input");
    const buttonElement = formElement.querySelectorAll("button");
    expect(inputElements.length).toEqual(8);
    expect(buttonElement.length).toEqual(4);
  });

  it('Testing Form valid', () => {

    const fixture = TestBed.createComponent(VendorComponent);
    const Vendor = fixture.componentInstance;
    Vendor.myForm.controls?.['id'].setValue("11967");
    Vendor.myForm.controls?.['name'].setValue("Jeyavel");
    Vendor.myForm.controls?.['country'].setValue("India");
    Vendor.myForm.controls?.['company'].setValue("RtZ11902");
    Vendor.myForm.controls?.['ssymbol'].setValue("#789");
    Vendor.myForm.controls?.['realationship'].setValue("1999");
    Vendor.myForm.controls?.['email'].setValue("j@gmail.com");
    Vendor.myForm.controls?.['mobile'].setValue("9078563456");
    expect(Vendor.myForm.valid).toBeTruthy();;
  });

  it('Testing Insert Form valid Falsy', () => {

    const fixture = TestBed.createComponent(VendorComponent);
    const Vendor = fixture.componentInstance;
    Vendor.myForm.controls?.['id'].setValue(" ");
    Vendor.myForm.controls?.['name'].setValue(" ");
    Vendor.myForm.controls?.['country'].setValue(" ");
    Vendor.myForm.controls?.['company'].setValue(" ");
    Vendor.myForm.controls?.['ssymbol'].setValue(" ");
    Vendor.myForm.controls?.['realationship'].setValue(" ");
    Vendor.myForm.controls?.['email'].setValue(" ");
    Vendor.myForm.controls?.['mobile'].setValue(" ");
    expect(Vendor.myForm.valid).toBeFalsy();;
  });



  it('Vendor Update Form GUI count', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
    const inputElements = formElement.querySelectorAll("input");
    const buttonElement = formElement.querySelectorAll("button");
    expect(inputElements.length).toEqual(8);
    expect(buttonElement.length).toEqual(4);
  });

  it('Testing Form valid', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const Vendor = fixture.componentInstance;
    Vendor.myForm.controls?.['id'].setValue("11967");
    Vendor.myForm.controls?.['name'].setValue("Jeyavel");
    Vendor.myForm.controls?.['country'].setValue("England");
    Vendor.myForm.controls?.['company'].setValue("RtZ11902");
    Vendor.myForm.controls?.['ssymbol'].setValue("#789");
    Vendor.myForm.controls?.['realationship'].setValue("1999");
    Vendor.myForm.controls?.['email'].setValue("j@gmail.com");
    Vendor.myForm.controls?.['mobile'].setValue("9078563456");
    expect(Vendor.myForm.valid).toBeTruthy();;
  });
  it('Testing Form Update valid Falsy', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const Vendor = fixture.componentInstance;
    Vendor.myForm.controls?.['id'].setValue(" ");
    Vendor.myForm.controls?.['name'].setValue(" ");
    Vendor.myForm.controls?.['country'].setValue(" ");
    Vendor.myForm.controls?.['company'].setValue(" ");
    Vendor.myForm.controls?.['ssymbol'].setValue(" ");
    Vendor.myForm.controls?.['realationship'].setValue(" ");
    Vendor.myForm.controls?.['email'].setValue(" ");
    Vendor.myForm.controls?.['mobile'].setValue(" ");
    expect(Vendor.myForm.valid).toBeFalsy();;
  });

  it('Vendor Delete Form GUI count', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
    const inputElements = formElement.querySelectorAll("input");
    const buttonElement = formElement.querySelectorAll("button");
    expect(inputElements.length).toEqual(8);
    expect(buttonElement.length).toEqual(4);
  });

  it('Testing Form initial values in Delete', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const app = fixture.componentInstance;
    const loginFormGroup = app.myForm;
    const loginFormValues = {
      id: '',
      name: '',
      country:'',
      company:'',
      ssymbol:'',
      realationship:'',
      email: '',
      mobile:'',
    }
    expect(loginFormGroup.value).toEqual(loginFormValues);
  });

  it('Testing Form valid in Delete', () => {
    const fixture = TestBed.createComponent(VendorComponent);
    const app = fixture.componentInstance;
    app.myForm.controls?.['id'].setValue("11902");
    expect(app.myForm.valid).toBeTruthy;
  });

});



