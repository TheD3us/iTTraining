import { NgModule } from '@angular/core';
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


>>>>>>> 12402b9f345d4d6d21bb6fa31ff259a2f1df2a57


@NgModule({
  declarations: [
    AppComponent,
<<<<<<< HEAD
    FormationComponent,
    CoreComponent,
    CandidatComponent,
=======
    AccueilComponent

>>>>>>> 12402b9f345d4d6d21bb6fa31ff259a2f1df2a57
    
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
