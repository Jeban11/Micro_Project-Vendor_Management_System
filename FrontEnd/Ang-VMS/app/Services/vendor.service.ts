import { Injectable } from '@angular/core';
import { Vendor } from '../Models/vendor';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VendorService {

  private url: string = "http://localhost:1111";


  constructor(private http: HttpClient) { }
  insertVendor(vendor: Vendor) {
    this.http.post(this.url + "/VendorInsert", vendor).subscribe();
    return "Record Inserted";
  }
  updateVendor(vendor: Vendor) {
    this.http.put(this.url + "/VendorUpdate", vendor).subscribe();
    return "Record Updated";
  }
  deleteVendor(vendor: Vendor) {
    this.http.delete(this.url + "/VendorDelete/" + vendor.id).subscribe();
    return "Record Deleted";
  }
  
  getAllVendorDetails() {
    return this.http.get<Vendor[]>(this.url + "/AllVendors");
  }
}
