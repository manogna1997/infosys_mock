import {Injectable, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {IMenuItem, IOrderedItem, OrderedItem} from "./order.model";
import {Observable} from "rxjs";
import {catchError, retry} from "rxjs/operators";


@Injectable({
    providedIn: 'root'
})
export class OrderService implements OnInit {


    menuItems: IMenuItem[];
    orderItems: IOrderedItem[];

    url = 'http://localhost:8080';

    constructor(private http: HttpClient) {
        this.menuItems = [];
        this.orderItems = [];
    }

    ngOnInit(): void {

    }


    getAllMenuItem() {
        return this.http.get<IMenuItem[]>(this.url + "/getmenuitems");
    }

    getOrderedItems() {
        return this.http.get<IOrderedItem[]>(this.url + "/getallordereditems");
    }

    createOrder(order: OrderedItem): Observable<IOrderedItem> {
        return this.http.post<IOrderedItem>(this.url + "/addordereditem", order)
            .pipe(
                retry(2)
            );
    }

    getOrderedItem(): IOrderedItem[] {
        return this.orderItems;
    }

    getMenuItems(): IMenuItem[] {
        return this.menuItems;
    }

}
