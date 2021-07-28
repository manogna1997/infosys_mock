import { Component, OnInit } from '@angular/core';
import {IOrderedItem} from "../order.model";
import {OrderService} from "../order.service";

@Component({
  selector: 'app-buttons',
  templateUrl: './buttons.component.html',
  styleUrls: ['./buttons.component.css']
})
export class ButtonsComponent implements OnInit {

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
