import { Component } from '@angular/core';
import { Vendor } from '../Models/vendor';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { VendorService } from '../Services/vendor.service';

@Component({
  selector: 'app-vendor',
  templateUrl: './vendor.component.html',
  styleUrls: ['./vendor.component.css']
})
export class VendorComponent {
  title = 'VMS';
  

  flag_insert!: boolean;
  flag_del!: boolean;
  flag_update!: boolean;
  vendor: Vendor;
  myForm: FormGroup;
  result: String = "";
  venList: Vendor[] = [];

  constructor(private ven: VendorService) {
    this.myForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      country: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      company: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+[0-9]+')]),
      ssymbol: new FormControl('', [Validators.required, Validators.pattern('[0-9-+#*@$&]{4}')]),
      realationship: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      email: new FormControl('', [Validators.required, Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}')]),
      mobile: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
     
    });

    this.vendor = new Vendor();
    this.getAllVendor();

  }


  InsertVendor(data: any) {
    this.vendor.id = data.id;
    this.vendor.name = data.name;
    this.vendor.country = data.country;
    this.vendor.company= data.company;
    this.vendor.ssymbol = data.ssymbol;
    this.vendor.relationship = data.realationship;
    this.vendor.email = data.email;
    this.vendor.mobile = data.mobile;
    this.result = this.ven.insertVendor(this.vendor);
    this.getAllVendor();
    alert("Inserted Successfully");
  }
  DeleteVendor(data: any) {
    this.vendor.id = data.id;
    this.result = this.ven.deleteVendor(this.vendor);
    this.getAllVendor();
    alert(data.id+" Deleted ");
  }


  UpdateVendor(data: any) {
    this.vendor.id = data.id;
    this.vendor.name = data.name;
    this.vendor.country = data.country;
    this.vendor.company= data.company;
    this.vendor.ssymbol = data.ssymbol;
    this.vendor.relationship = data.realationship;
    this.vendor.email = data.email;
    this.vendor.mobile = data.mobile;
    this.result = this.ven.updateVendor(this.vendor);
    this.getAllVendor();
    alert("Updated Successfully");

  }

  getAllVendor() {
    this.ven.getAllVendorDetails().subscribe(vendor => this.venList = vendor);
  }

}
