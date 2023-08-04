import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ApiService } from './services/api.service';
import { TableComponent } from './component/table/table.component';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import { UploadFormComponent } from './resources/templates/upload-form/upload-form.component';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { TableModule } from './component/table/table.module';
import { UploadFormModule } from './resources/templates/upload-form/upload-form.module';
import { HomeComponent } from './home/home.component';
import {MatInputModule} from '@angular/material/input';

@NgModule({
    declarations: [
        AppComponent,
        TableComponent,
        UploadFormComponent,
        HomeComponent
    ],
    providers: [
      ApiService,
    ],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        MatTableModule,
        BrowserAnimationsModule,
        HttpClientModule,
        MatPaginatorModule,
        FormsModule,
        MatCardModule,
        MatFormFieldModule,
        MatSnackBarModule,
        TableModule,
        UploadFormModule,
        MatInputModule
    ]
})
export class AppModule { }
