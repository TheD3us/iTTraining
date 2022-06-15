import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { CreateMachineComponent } from "./create-machine/create-machine.component";
import { DeleteMachineComponent } from "./delete-machine/delete-machine.component";
import { ListMachineComponent } from "./list-machine/list-machine.component";
import { UpdateMachineComponent } from "./update-machine/update-machine.component";


const routes: Routes = [
    { path: 'delete/:id', component: DeleteMachineComponent},
    { path: 'update/:id', component: UpdateMachineComponent},
    { path: 'create', component: CreateMachineComponent},
       { path: '**', component: ListMachineComponent}
     ];
   
   @NgModule({
       imports: [RouterModule.forChild(routes)],
       exports: [RouterModule]
   })
   
   export class MachineRoutingModule { }
   