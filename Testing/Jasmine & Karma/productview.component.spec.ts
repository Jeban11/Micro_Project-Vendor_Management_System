import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductviewComponent } from './productview.component';
import { AppComponent } from '../app.component';
import { RouterTestingModule } from '@angular/router/testing';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AppRoutingModule } from '../app-routing.module';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

describe('ProductviewComponent', () => {
    beforeEach(async () => {
        await TestBed.configureTestingModule({
            declarations: [ProductviewComponent, AppComponent],
            imports: [RouterTestingModule, BrowserModule, AppRoutingModule,
                HttpClientModule, FormsModule, ReactiveFormsModule],
        }).compileComponents();
    });
    it('Productview component test', () => {
        const fixture = TestBed.createComponent(ProductviewComponent);
        const app = fixture.componentInstance;
        fixture.detectChanges();
        expect(app).toBeTruthy();
    });
    it('Productview Form GUI count', () => {
        const fixture = TestBed.createComponent(ProductviewComponent);
        const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
        const buttonElement = formElement.querySelectorAll("button");
        expect(buttonElement.length).toEqual(1);
    });

    it('Testing Update Form valid', () => {

        const fixture = TestBed.createComponent(ProductviewComponent);
        const Product = fixture.componentInstance;
        Product.myForm.controls?.['id'].setValue("103");
        Product.myForm.controls?.['cno'].setValue("7867");
        Product.myForm.controls?.['pname'].setValue("Tshirts");
        Product.myForm.controls?.['price'].setValue("10000");
        Product.myForm.controls?.['brand'].setValue("Puma");
        expect(Product.myForm.valid).toBeTruthy();;
    });

    it('Testing Update Form valid Falsy', () => {

        const fixture = TestBed.createComponent(ProductviewComponent);
        const Product = fixture.componentInstance;
        Product.myForm.controls?.['id'].setValue(" ");
        Product.myForm.controls?.['cno'].setValue(" ");
        Product.myForm.controls?.['pname'].setValue(" ");
        Product.myForm.controls?.['price'].setValue(" ");
        Product.myForm.controls?.['brand'].setValue(" ");
        expect(Product.myForm.valid).toBeFalsy();;
    });
    it('Testing Form initial values in Delete', () => {
        const fixture = TestBed.createComponent(ProductviewComponent);
        const app = fixture.componentInstance;
        const loginFormGroup = app.myForm;
        const loginFormValues = {
            id: '',
            cno: '',
            pname: '',
            price: '',
            brand: '',
        }
        expect(loginFormGroup.value).toEqual(loginFormValues);
    });

    it('Testing Form valid in Delete', () => {
        const fixture = TestBed.createComponent(ProductviewComponent);
        const app = fixture.componentInstance;
        app.myForm.controls?.['id'].setValue("11901");
        expect(app.myForm.valid).toBeTruthy;
    });
});
