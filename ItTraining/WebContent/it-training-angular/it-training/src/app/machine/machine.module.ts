import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListMachineComponent } from './list-machine/list-machine.component';
import { CreateMachineComponent } from './create-machine/create-machine.component';
import { UpdateMachineComponent } from './update-machine/update-machine.component';
import { DeleteMachineComponent } from './delete-machine/delete-machine.component';



@NgModule({
  declarations: [
    ListMachineComponent,
    CreateMachineComponent,
    UpdateMachineComponent,
    DeleteMachineComponent,

  ],
  imports: [
    CommonModule
  ]
})
export class MachineModule { }


