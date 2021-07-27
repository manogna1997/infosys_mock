import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {OrderedItem} from "./order-models";


@Injectable({
    providedIn: 'root'
})
export class OrderServiceService {


    orders: OrderedItem[];

    url = 'http://localhost:8080/getmenuitems';



    constructor(private http: HttpClient) {
        this.orders = []
    }

    getAllMenuItem() {
        return this.http.get(this.url);
    }

    getOrdersData(){
        if(this.orders.length == 0){
            return "No Orders Placed please place a order"
        }else {
           return  "You have placed orders: "+this.orders.length
        }
    }

}
