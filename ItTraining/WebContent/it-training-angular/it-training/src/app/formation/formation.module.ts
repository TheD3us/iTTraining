import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListFormationComponent } from './list-formation/list-formation.component';
import { FormationRoutingModule } from './formation-routing.module';



@NgModule({
  declarations: [
    ListFormationComponent
  ],
  imports: [
    FormationRoutingModule,
    CommonModule
  ]
})
export class FormationModule { }
