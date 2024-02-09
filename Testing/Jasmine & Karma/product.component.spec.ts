import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductComponent } from './product.component';
import { AppComponent } from '../app.component';
import { RouterTestingModule } from '@angular/router/testing';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from '../app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

describe('ProductComponent', () => {
    beforeEach(async () => {
        await TestBed.configureTestingModule({
          declarations: [ProductComponent, AppComponent],
          imports: [RouterTestingModule, BrowserModule, AppRoutingModule,
            HttpClientModule, FormsModule, ReactiveFormsModule],
        }).compileComponents();
      });
      it('Product component test', () => {
        const fixture = TestBed.createComponent(ProductComponent);
        const app = fixture.componentInstance;
        fixture.detectChanges();
        expect(app).toBeTruthy();
      });
      it('Product Insert Form GUI count', () => {
        const fixture = TestBed.createComponent(ProductComponent);
        const formElement = fixture.debugElement.nativeElement.querySelector("#Form");
        const inputElements = formElement.querySelectorAll("input");
        const buttonElement = formElement.querySelectorAll("button");
        expect(inputElements.length).toEqual(5);
        expect(buttonElement.length).toEqual(4);
      });
    
      it('Testing Insert Form valid', () => {
    
        const fixture = TestBed.createComponent(ProductComponent);
        const Product = fixture.componentInstance;
        Product.myForm.controls?.['id'].setValue("102");
        Product.myForm.controls?.['cno'].setValue("3456");
        Product.myForm.controls?.['pname'].setValue("Shoes");
        Product.myForm.controls?.['price'].setValue("10000");
        Product.myForm.controls?.['brand'].setValue("Puma");
        expect(Product.myForm.valid).toBeTruthy();;
      });
    
      it('Testing Insert Form valid Falsy', () => {
    
        const fixture = TestBed.createComponent(ProductComponent);
        const Product = fixture.componentInstance;
        Product.myForm.controls?.['id'].setValue(" ");
        Product.myForm.controls?.['cno'].setValue(" ");
        Product.myForm.controls?.['pname'].setValue(" ");
        Product.myForm.controls?.['price'].setValue(" ");
        Product.myForm.controls?.['brand'].setValue(" ");
        expect(Product.myForm.valid).toBeFalsy();;
      });
});
