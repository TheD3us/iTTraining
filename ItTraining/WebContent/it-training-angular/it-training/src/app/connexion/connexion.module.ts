import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ConnexionComponent } from './connexion.component';
import { ConnexionRoutingModule } from './connexion-routing.module';



@NgModule({
  declarations: [ConnexionComponent],
  imports: [
    ConnexionRoutingModule,
    CommonModule
  ]
})
export class ConnexionModule { }
