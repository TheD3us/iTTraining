import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AccueilRoutingModule } from './accueil-routing.module';
import { FormationModule } from '../formation/formation.module';







@NgModule({
  declarations: [
 
  ],
  imports: [
    CommonModule,
    AccueilRoutingModule,
    FormationModule
  ]
})
export class AccueilModule { }
