import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Formation } from '../entities/formation';
import { AccueilComponent } from './accueil.component';



@NgModule({
  declarations: [
    AccueilComponent
  ],
  imports: [
    Formation,
    CommonModule
  ]
})
export class AccueilModule { }
