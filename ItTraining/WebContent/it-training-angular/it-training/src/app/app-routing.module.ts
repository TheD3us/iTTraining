import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  { path: '', redirectTo: '/accueil', pathMatch: 'full' },
  {path: 'accueil',
  loadChildren: () => import('./accueil/accueil.module').then(m => m.AccueilModule)
  },
  {path:'compte',
  loadChildren: () => import ('./candidat/candidat.module').then(m => m.CandidatModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
