import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import { OrderPageComponent } from "./order-page/order-page.component";
import { HomePageComponent } from "./home-page/home-page.component";

import {HttpClientModule} from "@angular/common/http";
import { OrderItemComponent } from './order-item/order-item.component';



@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    OrderPageComponent,
    OrderItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
