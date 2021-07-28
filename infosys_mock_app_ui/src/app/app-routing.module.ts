import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {OrderPageComponent} from './order-page/order-page.component';
import {HomePageComponent} from './home-page/home-page.component';
import {ButtonsComponent} from './buttons/buttons.component';

const routes: Routes = [
    {
        path: 'add',
        component: OrderPageComponent
    },

    {
        path: '',
        component: ButtonsComponent
    },
    {
        path: 'get',
        component: HomePageComponent
    },

];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {
}
