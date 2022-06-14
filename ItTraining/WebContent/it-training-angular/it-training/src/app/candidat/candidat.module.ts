import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CandidatComponent } from './candidat.component';
import { CandidatRoutingModule } from './candidat-routing.module';



@NgModule({
  declarations: [CandidatComponent],
  imports: [
    CandidatRoutingModule,
    CommonModule
  ]
})
export class CandidatModule { }

