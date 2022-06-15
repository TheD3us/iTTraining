import { NgModule } from '@angular/core';
import { AccueilComponent } from './accueil/accueil.component';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FlexLayoutModule } from '@angular/flex-layout';
import { ConnexionComponent } from './connexion/connexion.component';
import { BrowserModule } from '@angular/platform-browser';
import { CandidatComponent } from './candidat/candidat.component';


@NgModule({
  declarations: [
    AppComponent
  ],
  
  imports: [
    FlexLayoutModule,
    BrowserModule,
    AppRoutingModule,
    NgbModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
