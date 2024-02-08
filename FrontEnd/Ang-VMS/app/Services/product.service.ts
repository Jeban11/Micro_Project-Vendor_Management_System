import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from 'src/app/Models/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private url: string = "http://localhost:1111";


  constructor(private http: HttpClient) { }
  insertProduct(product: Product) {
    this.http.post(this.url + "/ProductInsert", product).subscribe();
    return "Record Inserted";
  }
  updateProduct(product: Product) {
    this.http.put(this.url + "/ProducUpdate", product).subscribe();
    return "Record Updated";
  }
  deleteProduct(product: Product) {
    this.http.delete(this.url + "/ProductDelete/" + product.id).subscribe();
    return "Deleted"
    
  }
  getAllProductDetails() {
    return this.http.get<Product[]>(this.url + "/ProductViewAll");


  }
}
