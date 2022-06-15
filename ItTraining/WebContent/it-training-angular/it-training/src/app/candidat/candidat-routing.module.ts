import { CandidatComponent } from "./candidat.component";
import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";

const routes: Routes = [
    //{ path: 'delete/:id', component: CandidatComponent},
    //{ path: 'update/:id', component: CandidatComponent},

    { path: '**', component: CandidatComponent}
  ];

  @NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
  })
  export class CandidatRoutingModule { }