import { Component, OnInit } from '@angular/core';
import { Transaction } from 'src/app/model/transactions';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss'],
})
export class TableComponent implements OnInit {
  dataSource: Transaction[] = [];
  displayedColumns: string[] = ['id', 'type_id', 'date', 'product', 'price', 'seller'];

  constructor(private apiService: ApiService) {}

  ngOnInit() {
    this.apiService.getTransactions().subscribe((data: Transaction[]) => {
      this.dataSource = data;
    });
  }
}

