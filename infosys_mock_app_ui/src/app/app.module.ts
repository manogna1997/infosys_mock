import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {OrderPageComponent} from "./order-page/order-page.component";
import {HomePageComponent} from "./home-page/home-page.component";

import {HttpClientModule} from "@angular/common/http";
import {ButtonsComponent} from './buttons/buttons.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


@NgModule({
    declarations: [
        AppComponent,
        HomePageComponent,
        OrderPageComponent,
        ButtonsComponent

    ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        FormsModule,
        ReactiveFormsModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})

export class AppModule {
}
