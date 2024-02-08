import { Component } from '@angular/core';
import { Contract } from '../Models/contract';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ContractService } from '../Services/contract.service';

@Component({
  selector: 'app-mycontracts',
  templateUrl: './mycontracts.component.html',
  styleUrls: ['./mycontracts.component.css']
})
export class MycontractsComponent {
  title = 'VMS';
  Insert(arg0: any) {
    throw new Error('Method not implemented.');
  }

  flag_insert!: boolean;
  flag_del!: boolean;
  flag_update!: boolean;
  contract: Contract;
  myForm: FormGroup;
  result: String = "";
  conList: Contract[] = [];

  constructor(private con: ContractService) {
    this.myForm = new FormGroup({
      id: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      name: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      cno: new FormControl('', [Validators.required, Validators.pattern('[0-9]+')]),
      catogory: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      products: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      status: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
      description: new FormControl('', [Validators.required, Validators.pattern('[a-zA-Z]+')]),
   
    })

    this.contract = new Contract();
    this.getAllContract();

  }
  DeleteContract(data: any) {
    this.contract.id = data.id;
    this.result = this.con.deleteContract(this.contract);
    this.getAllContract();
    alert(data.id+" Deleted ");
  }


  UpdateContract(data: any) {
    this.contract.id = data.id;
    this.contract.name = data.name;
    this.contract.cno = data.cno;
    this.contract.catogory= data.catogory;
    this.contract.products= data.products;
    this.contract.status= data.status;
    this.result = this.con.updateContract(this.contract);
    this.getAllContract();
    alert("Updated Successfully");

  }
  getAllContract() {
    this.con.getAllContractDetails().subscribe(contract => this.conList = contract);
  }

}
