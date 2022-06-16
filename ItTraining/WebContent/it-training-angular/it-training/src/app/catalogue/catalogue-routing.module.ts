import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { CatalogueComponent } from "./catalogue.component";


const routes: Routes = [
   // { path: 'delete/:id', component: DeleteFormationComponent},
  //   { path: 'update/:id', component: UpdateFormationComponent},
  //   { path: 'create', component: CreateFormationComponent},
     { path: '**', component: CatalogueComponent}
   ];
 
 @NgModule({
     imports: [RouterModule.forChild(routes)],
     exports: [RouterModule]
 })

 export class CatalogueRoutingModule { }