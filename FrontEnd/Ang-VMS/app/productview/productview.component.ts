import { Component } from '@angular/core';
import { Product } from '../Models/product';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ProductService } from '../Services/product.service';

@Component({
  selector: 'app-productview',
  templateUrl: './productview.component.html',
  styleUrls: ['./productview.component.css']
})
export class ProductviewComponent {
  Insert(arg0: any) {
    throw new Error('Method not implemented.');
  }

  flag_insert!: boolean;
  flag_del!: boolean;
  flag_update!: boolean;
  product: Product;
  myForm: FormGroup;
  result: String = "";
  proList: Product[] = [];

  constructor(private pro: ProductService) {
    this.myForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      cno: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      pname: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      price: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      brand: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
   
    })

    this.product = new Product();
    this.getAllProduct();

  }
  DeleteProduct(data:any ) {
    this.product.id= data.id;
    this.result=this.pro.deleteProduct(this.product)
    this.getAllProduct();
    alert(data.id+" Deleted ");
  }


  UpdateProduct(data: any) {
    this.product.id = data.id;
    this.product.cno = data.cno;
    this.product.pname= data.pname;
    this.product.price= data.price;
    this.product.brand= data.brand;
    this.result = this.pro.updateProduct(this.product);
    this.getAllProduct();
    alert("Updated Successfully");

  }
  getAllProduct() {
    this.pro.getAllProductDetails().subscribe(product => this.proList = product);
  }


}
