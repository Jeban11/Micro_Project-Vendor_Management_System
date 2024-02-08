import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FrontComponent } from './front/front.component';
import { VendorComponent } from './vendor/vendor.component';
import {  RouterModule, Routes, } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { HttpClientModule } from '@angular/common/http';
import { VendorService } from './Services/vendor.service';
import { ContractComponent } from './contract/contract.component';
import { ProductComponent } from './product/product.component';
import { VendorviewComponent } from './vendorview/vendorview.component';
import { ContractviewComponent } from './contractview/contractview.component';
import { ProductviewComponent } from './productview/productview.component';
import { MyvendorsComponent } from './myvendors/myvendors.component';
import { MycontractsComponent } from './mycontracts/mycontracts.component';
import { ReviewComponent } from './review/review.component';
import { LoginComponent } from './login/login.component';
import { SiteComponent } from './site/site.component';




const ROUTES:Routes=[
 


];

@NgModule({
  declarations: [
    AppComponent,
    FrontComponent,
    HomeComponent,
    VendorComponent,
    ContractComponent,
    ProductComponent,
    VendorviewComponent,
    ContractviewComponent,
    ProductviewComponent,
    MyvendorsComponent,
    MycontractsComponent,
    ReviewComponent,
    LoginComponent,
    SiteComponent
 

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(ROUTES),
    FormsModule , ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [VendorService],
  bootstrap: [AppComponent]
})
export class AppModule { }
