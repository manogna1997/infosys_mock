export interface IOrderedItem {
    name: string ;
    id: number ;
    totalprice: number;
    menuItems: IMenuItem[];
}

export interface IMenuItem {
    name: string ;
    id: number ;
    ingredients: string;
    price: number;
}

export class OrderedItem implements IOrderedItem {
    id: number = 0;
    menuItems: IMenuItem[] = [];
    name: string = '';
    totalprice: number = 0;
}
