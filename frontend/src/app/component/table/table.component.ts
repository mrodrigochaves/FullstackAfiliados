import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { Transaction } from 'src/app/model/transactions';
import { ApiService } from 'src/app/services/api.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss'],
})
export class TableComponent implements OnInit {
  dataSource: MatTableDataSource<Transaction>;
  displayedColumns: string[] = ['id', 'type_id', 'date', 'product', 'price', 'seller'];

  @ViewChild('paginator')
  paginator!: MatPaginator;

  constructor(private apiService: ApiService) {
    this.dataSource = new MatTableDataSource<Transaction>();
  }

  ngOnInit() {
    this.apiService.getTransactions().subscribe((data: Transaction[]) => {
      this.dataSource.data = data;
      this.dataSource.paginator = this.paginator;
    });
  }
}
