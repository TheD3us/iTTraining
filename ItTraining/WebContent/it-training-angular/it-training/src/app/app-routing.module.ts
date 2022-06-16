import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


const routes: Routes = [
  {path:'compte',
  loadChildren: () => import ('./candidat/candidat.module').then(m => m.CandidatModule)
  },

  { path: 'connexion', 
loadChildren: () => import('./connexion/connexion.module').then(m=> m.ConnexionModule)

  },
  {
    path: 'formation',
      loadChildren: () => import('./formation/formation.module').then(m => m.FormationModule)

  },
  {
    path: 'accueil',
      loadChildren: () => import('./accueil/accueil.module').then(m => m.AccueilModule)

  },
  {
    path: '**', 
      loadChildren: () => import('./formation/formation.module').then(m => m.FormationModule) 
  
  }




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

