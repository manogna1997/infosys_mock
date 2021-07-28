import {Component, OnInit} from '@angular/core';
import {OrderService} from '../order.service'
import {IMenuItem, IOrderedItem, OrderedItem} from "../order.model";
import {FormBuilder, FormControl} from '@angular/forms';
import {async} from "rxjs";
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { Observable } from 'rxjs';
@Component({
    selector: 'app-home-page',
    templateUrl: './home-page.component.html',
    styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

    items: IMenuItem[];
    orders: IOrderedItem[];
    neworder: OrderedItem;
    checkoutForm = this.formBuilder.group({
        name: ''
    });

    constructor(private service: OrderService,    private formBuilder: FormBuilder,    private route: ActivatedRoute,
                private router: Router ) {
        this.items = [];
        this.orders = [];
        this.neworder = new OrderedItem();
    }


    ngOnInit(): void {
        this.service.getAllMenuItem().subscribe((allData) => {
            this.items = allData;
        });
        this.service.getOrderedItems().subscribe((allData) => {
            this.orders = allData;
        });

    }

    onCheckboxChange(e: any) {
        if (e.target.checked) {
            // @ts-ignore
            const item: IMenuItem = this.items.find(x => {
                console.log(x.id);
                if (x.id == e.target.value) {
                    console.log(x.name);
                    return x;
                }
            });
            this.neworder.menuItems.push(item)
        } else {
            this.neworder.menuItems = this.neworder.menuItems.filter(x => x.id != e.target.value);
        }
    }

    onSubmit(){
        this.neworder.name = this.checkoutForm.value.name;
        if(this.neworder.menuItems.length < 1){
            alert("Please select items to order")
            return;
        }
        if(this.checkoutForm.value.name.length < 4){
            alert("Please add your name to the order")
            return;
        }
        this.neworder.name = this.checkoutForm.value.name;
        let prize = 0;
        this.neworder.menuItems.forEach( m =>{
            prize = prize + m.price;
        })
        this.neworder.totalprice = prize;
        this.neworder.id = 0;
        console.log(JSON.stringify(this.neworder))
        this.service.createOrder(this.neworder).subscribe((allData) => {
            if (allData.id > 0){
                alert("Order placed id: "+allData.id)
                this.router.navigate(['/']);
            }
        });

    }

}
