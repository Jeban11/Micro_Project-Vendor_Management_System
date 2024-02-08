import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FrontComponent } from './front/front.component';
import { VendorComponent } from './vendor/vendor.component';
import { HomeComponent } from './home/home.component';
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


const routes: Routes = [
  { path: '',component:SiteComponent},
  { path: 'front', component: FrontComponent },
  { path: 'vendor', component: VendorComponent },
  { path: 'home', component: HomeComponent },
  { path: 'contract', component:ContractComponent  },
  { path: 'product' ,component:ProductComponent },
  { path: 'venview' ,component:VendorviewComponent},
  { path: 'conview' ,component:ContractviewComponent},
  { path: 'proview',component:ProductviewComponent},
  { path: 'myven' ,component:MyvendorsComponent},
  { path: 'my' ,component:MycontractsComponent},
  { path: 'review',component:ReviewComponent},
  { path: 'login',component:LoginComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
