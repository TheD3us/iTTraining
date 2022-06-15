import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormationModule } from '../formation/formation.module';
import { AccueilRoutingModule } from './accueil-routing.module';
import { AccueilComponent } from './accueil.component';
import { CarouselModule } from 'ngx-owl-carousel-o';
import { FlexLayoutModule } from '@angular/flex-layout';


@NgModule({
  declarations: [


    AccueilComponent
  ],
  imports: [
    FlexLayoutModule,
    CarouselModule,
    AccueilRoutingModule,
    CommonModule

    ]

})
export class AccueilModule { }
