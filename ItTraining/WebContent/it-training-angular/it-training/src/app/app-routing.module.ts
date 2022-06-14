import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', redirectTo: '/accueil', pathMatch: 'full' },
  {path: 'accueil',
  loadChildren: () => import('./accueil/accueil.module').then(m => m.AccueilModule)
  },
  { path: 'connexion', 
loadChildren: () => import('./connexion/connexion.module').then(m=> m.ConnexionModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

