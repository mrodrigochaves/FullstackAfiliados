import { Component } from '@angular/core';
import { ApiService } from 'src/app/services/api.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-upload-form',
  templateUrl: './upload-form.component.html',
  styleUrls: ['./upload-form.component.scss'],
})
export class UploadFormComponent {
  selectedFile: File | undefined;

  constructor(private apiService: ApiService, private snackBar: MatSnackBar) {}

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
  }

  onSubmit() {
    if (this.selectedFile) {
      const formData = new FormData();
      formData.append('file', this.selectedFile);

      this.apiService.uploadFile(formData).subscribe(
        () => {
          this.showMessage('File uploaded successfully.');

        },
        (error) => {
          this.showMessage('Error in file upload.', true);
          console.error('Error in file upload.', error);

        }
      );
    }
  }

  showMessage(message: string, isError: boolean = false) {
    this.snackBar.open(message, 'Close', {
      duration: 5000,
      panelClass: isError ? 'error-snackbar' : 'success-snackbar',
    });
  }
}
