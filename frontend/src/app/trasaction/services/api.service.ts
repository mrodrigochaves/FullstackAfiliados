import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Transaction } from '../model/transactions';

@Injectable({
  providedIn: 'root',
})
export class ApiService {

  uploadFile(formData: FormData): Observable<any> {
    return this.http.post<any>(this.apiUrl + 'upload', formData);
  }

  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) {}

  getTransactions(): Observable<Transaction[]> {
    return this.http.get<Transaction[]>(this.apiUrl);
  }
}
