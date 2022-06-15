import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListSalleComponent } from './list-salle/list-salle.component';
import { UpdateSalleComponent } from './update-salle/update-salle.component';
import { DeleteSalleComponent } from './delete-salle/delete-salle.component';
import { CreateSalleComponent } from './create-salle/create-salle.component';



@NgModule({
  declarations: [
    ListSalleComponent,
    CreateSalleComponent,
    UpdateSalleComponent,
    DeleteSalleComponent
  ],
  imports: [
    CommonModule
  ]
})
export class SalleModule { }

