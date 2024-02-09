import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContractviewComponent } from './contractview.component';
import { AppComponent } from '../app.component';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

describe('ContractviewComponent', () => {
    beforeEach(async () => {
        await TestBed.configureTestingModule({
            declarations: [ContractviewComponent, AppComponent],
            imports: [RouterTestingModule, BrowserModule, AppRoutingModule,
                HttpClientModule, FormsModule, ReactiveFormsModule],
        }).compileComponents();
    });
    it('ContractView component test', () => {
        const fixture = TestBed.createComponent(ContractviewComponent);
        const app = fixture.componentInstance;
        fixture.detectChanges();
        expect(app).toBeTruthy();
    });



    it('ContractView Form GUI count', () => {
        const fixture = TestBed.createComponent(ContractviewComponent);
        const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
        const buttonElement = formElement.querySelectorAll("button");
        expect(buttonElement.length).toEqual(1);
    });

    it('Testing Update Form valid', () => {

        const fixture = TestBed.createComponent(ContractviewComponent);
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

    it('Testing Update Form valid Falsy', () => {

        const fixture = TestBed.createComponent(ContractviewComponent);
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

    it('Testing Form initial values in Delete', () => {
        const fixture = TestBed.createComponent(ContractviewComponent);
        const app = fixture.componentInstance;
        const loginFormGroup = app.myForm;
        const loginFormValues = {
            id: '',
            name: '',
            cno: '',
            catogory: '',
            products: '',
            status: '',
            description: '',
        }
        expect(loginFormGroup.value).toEqual(loginFormValues);
    });

    it('Testing Form valid in Delete', () => {
        const fixture = TestBed.createComponent(ContractviewComponent);
        const app = fixture.componentInstance;
        app.myForm.controls?.['id'].setValue("11901");
        expect(app.myForm.valid).toBeTruthy;
    });


});
