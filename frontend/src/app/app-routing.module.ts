import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'table', loadChildren: () => import('./component/table/table.module').then(m => m.TableModule) },
  { path: 'upload-form', loadChildren: () => import('./component/upload-form/upload-form.module').then(m => m.UploadFormModule) },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
