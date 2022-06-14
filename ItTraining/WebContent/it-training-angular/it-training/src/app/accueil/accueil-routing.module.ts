import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ListFormationComponent } from "../formation/list-formation/list-formation.component";

const routes: Routes = [
    //   { path: 'delete/:id', component: DeleteFormationComponent},
    //   { path: 'update/:id', component: UpdateFormationComponent},
    //   { path: 'create', component: CreateFormationComponent},
       { path: '**', component: ListFormationComponent}
     ];
   
   @NgModule({
       imports: [RouterModule.forChild(routes)],
       exports: [RouterModule]
   })
   
   export class AccueilRoutingModule { }