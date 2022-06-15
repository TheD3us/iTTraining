
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListFormationComponent } from './list-formation/list-formation.component';
import { FormationRoutingModule } from './formation-routing.module';
import { CoreModule } from '../core/core.module';
import { DeleteFormationComponent } from './delete-formation/delete-formation.component';




@NgModule({
  declarations: [
    ListFormationComponent,
    DeleteFormationComponent
      ],
  imports: [
    FormationRoutingModule,
    CommonModule,
    CoreModule
  ]
})
export class FormationModule { }
