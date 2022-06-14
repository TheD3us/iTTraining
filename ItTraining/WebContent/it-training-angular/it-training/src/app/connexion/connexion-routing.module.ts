import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ConnexionComponent } from "./connexion.component";
import { ConnexionModule } from "./connexion.module";

const routes: Routes = [

       { path: '**', component: ConnexionComponent}
     ];
   
   @NgModule({
       imports: [RouterModule.forChild(routes)],
       exports: [RouterModule]
   })
   
   export class ConnexionRoutingModule { }