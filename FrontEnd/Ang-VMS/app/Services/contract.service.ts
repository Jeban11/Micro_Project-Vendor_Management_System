import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Contract } from 'src/app/Models/contract';

@Injectable({
  providedIn: 'root'
})
export class ContractService {
  private url: string = "http://localhost:1111";


  constructor(private http: HttpClient) { }
  insertContract(contract: Contract) {
    this.http.post(this.url + "/ContractInsert", contract).subscribe();
    return "Record Inserted";
  }
  updateContract(contract: Contract) {
    this.http.put(this.url + "/ContractUpdate", contract).subscribe();
    return "Record Updated";
  }
  deleteContract(contract: Contract) {
    this.http.delete(this.url + "/ContractDelete" + contract.id).subscribe();
    return "Record Deleted";
  }
  getAllContractDetails() {
    return this.http.get<Contract[]>(this.url + "/ContractViewAll");


  }
}
