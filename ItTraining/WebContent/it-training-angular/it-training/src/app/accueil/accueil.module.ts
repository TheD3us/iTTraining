import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ListFormationComponent } from '../formation/list-formation/list-formation.component';
import { FormationModule } from '../formation/formation.module';




@NgModule({
  declarations: [
    ListFormationComponent

  ],
  imports: [
    FormationModule,
    CommonModule
  ]
})
export class AccueilModule { }
