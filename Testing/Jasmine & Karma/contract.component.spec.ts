import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractComponent } from './contract.component';
import { AppComponent } from '../app.component';
import { RouterTestingModule } from '@angular/router/testing';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from '../app-routing.module';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

describe('Contract Component Test', () => {
    beforeEach(async () => {
      await TestBed.configureTestingModule({
        declarations: [ContractComponent, AppComponent],
        imports: [RouterTestingModule, BrowserModule, AppRoutingModule,
          HttpClientModule, FormsModule, ReactiveFormsModule],
      }).compileComponents();
    });
    it('Contract component test', () => {
      const fixture = TestBed.createComponent(ContractComponent);
      const app = fixture.componentInstance;
      fixture.detectChanges();
      expect(app).toBeTruthy();
    });
    it('Contract Insert Form GUI count', () => {
      const fixture = TestBed.createComponent(ContractComponent);
      const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
      const inputElements = formElement.querySelectorAll("input");
      const buttonElement = formElement.querySelectorAll("button");
      expect(inputElements.length).toEqual(6);
      expect(buttonElement.length).toEqual(4);
    });
  
    it('Testing Insert Form valid', () => {
  
      const fixture = TestBed.createComponent(ContractComponent);
      const Contract = fixture.componentInstance;
      Contract.myForm.controls?.['id'].setValue("11908");
      Contract.myForm.controls?.['name'].setValue("Jeyavel");
      Contract.myForm.controls?.['cno'].setValue("12345");
      Contract.myForm.controls?.['catogory'].setValue("WholeSale");
      Contract.myForm.controls?.['products'].setValue("Shoes");
      Contract.myForm.controls?.['status'].setValue("onboarding");
      Contract.myForm.controls?.['description'].setValue("Nothing");
      expect(Contract.myForm.valid).toBeTruthy();;
    });
  
    it('Testing Insert Form valid Falsy', () => {
  
      const fixture = TestBed.createComponent(ContractComponent);
      const Contract = fixture.componentInstance;
      Contract.myForm.controls?.['id'].setValue(" ");
      Contract.myForm.controls?.['name'].setValue(" ");
      Contract.myForm.controls?.['cno'].setValue(" ");
      Contract.myForm.controls?.['catogory'].setValue(" ");
      Contract.myForm.controls?.['products'].setValue(" ");
      Contract.myForm.controls?.['status'].setValue(" ");
      Contract.myForm.controls?.['description'].setValue(" ");
      expect(Contract.myForm.valid).toBeFalsy();;
    });
});
