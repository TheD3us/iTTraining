import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CandidatComponent } from './candidat.component';
import { CandidatRoutingModule } from './candidat-routing.module';
import { FlexLayoutModule } from '@angular/flex-layout';



@NgModule({
  declarations: [CandidatComponent],
  imports: [
    FlexLayoutModule,
    CandidatRoutingModule,
    CommonModule
  ]
})
export class CandidatModule { }

