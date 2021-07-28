import { Component, OnInit } from '@angular/core';
import {OrderService} from "../order.service";
import {IOrderedItem} from "../order.model";

@Component({
  selector: 'app-order-page',
  templateUrl: './order-page.component.html',
  styleUrls: ['./order-page.component.css']
})
export class OrderPageComponent implements OnInit {

  orders: IOrderedItem[];

  constructor(private service: OrderService) {
    this.orders = [];
  }

  ngOnInit(): void {
    this.service.getOrderedItems().subscribe((allData) => {
      this.orders = allData;
    });
  }

}
