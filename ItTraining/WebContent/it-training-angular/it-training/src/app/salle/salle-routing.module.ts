import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { ListSalleComponent } from "./list-salle/list-salle.component";
import { CreateSalleComponent }from "./create-salle/create-salle.component";
import { UpdateSalleComponent } from "./update-salle/update-salle.component";
import { DeleteSalleComponent } from "./delete-salle/delete-salle.component";

const routes: Routes = [
 { path: 'delete/:id', component: DeleteSalleComponent},
 { path: 'update/:id', component: UpdateSalleComponent},
 { path: 'create', component: CreateSalleComponent},
    { path: '**', component: ListSalleComponent}
  ];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})

export class SalleRoutingModule { }
