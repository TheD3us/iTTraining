import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ListFormationComponent } from '../formation/list-formation/list-formation.component';
import { FormationModule } from '../formation/formation.module';
import { AccueilRoutingModule } from './accueil-routing.module';
import { AccueilComponent } from './accueil.component';
import { CarouselModule } from 'ngx-owl-carousel-o';




@NgModule({
  declarations: [
    AccueilComponent
  ],
  imports: [
    CarouselModule,
    AccueilRoutingModule,
    FormationModule,
    CommonModule
  ]
})
export class AccueilModule { }
