import { Component, OnInit } from '@angular/core';
import{OrderServiceService} from'../order-service.service'

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  constructor(private menu:OrderServiceService) { }

  ngOnInit(): void {
    this.menu.getAllMenuItem().subscribe((allData) =>{
      console.log(allData);
      }
    );
  }

}
