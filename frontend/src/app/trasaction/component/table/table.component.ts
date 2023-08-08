import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { ApiService } from 'src/app/trasaction/services/api.service';
import { Transaction } from 'src/app/trasaction/model/transactions';
import { ErrorDialogService } from '../../../shared/containers/error-dialog/error-dialog.service';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.scss'],
})
export class TableComponent implements OnInit {
  dataSource: MatTableDataSource<Transaction>;
  displayedColumns: string[] = ['id', 'type_id', 'date', 'product', 'price', 'seller'];

  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private apiService: ApiService, private errorDialogService: ErrorDialogService) {
    this.dataSource = new MatTableDataSource<Transaction>();
  }

  ngOnInit() {
    this.apiService.getTransactions().subscribe(
      (data: Transaction[]) => {
        this.dataSource.data = data;
        this.dataSource.paginator = this.paginator;
      },
      (error) => {
        this.errorDialogService.openDialog('Failed to load transactions.');
      }
    );
  }
}
