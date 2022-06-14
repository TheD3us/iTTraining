import { NgModule } from '@angular/core';
import {Acc}
import { BrowserModule } from '@angular/platform-browser';


import { AccueilComponent } from './accueil/accueil.component';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

<<<<<<< HEAD
import { FormationComponent } from './formation/formation.component';
import { CoreComponent } from './candidat/core.component';
import { CandidatComponent } from './candidat/candidat.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
=======

import { CandidatComponent } from './candidat/candidat.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';





>>>>>>> deae8d14f0e33792494c2a71fc33804d321e5915

@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    FormationComponent,
    CoreComponent,
    CandidatComponent,

=======
    CandidatComponent,
>>>>>>> deae8d14f0e33792494c2a71fc33804d321e5915
    AccueilComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
