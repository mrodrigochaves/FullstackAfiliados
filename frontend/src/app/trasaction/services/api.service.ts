import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Transaction } from '../model/transactions';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class ApiService {
  errorDialogService: any;

  uploadFile(formData: FormData): Observable<any> {
    return this.http.post<any>(this.apiUrl + 'upload', formData);
  }

  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  getTransactions(): Observable<Transaction[]> {
    return this.http.get<Transaction[]>(this.apiUrl).pipe(
      catchError((error) => {
        this.errorDialogService.openDialog('Failed to load transactions.');
        throw error;
      })
    );
  }
}
