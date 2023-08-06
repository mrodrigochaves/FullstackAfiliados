import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  { path:'', pathMatch:'full', redirectTo: 'home'},
  { path:'home',
  loadChildren:() => import('./home/home.component').then(m => m.HomeComponent)
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
