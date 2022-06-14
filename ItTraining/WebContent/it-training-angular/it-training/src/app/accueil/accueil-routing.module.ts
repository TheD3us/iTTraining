import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ListFormationComponent } from "../formation/list-formation/list-formation.component";
import { AccueilComponent } from "./accueil.component";

const routes: Routes = [


       { path: '**', component: AccueilComponent}

     ];
   
   @NgModule({
       imports: [RouterModule.forChild(routes)],
       exports: [RouterModule]
   })
   
   export class AccueilRoutingModule { }