import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";



@Injectable({
  providedIn: 'root'
})
export class OrderServiceService {
url = 'http://localhost:8080/getmenuitems';
  constructor(private http:HttpClient) { }
  getAllMenuItem(){
    return this.http.get(this.url);
  }

}
