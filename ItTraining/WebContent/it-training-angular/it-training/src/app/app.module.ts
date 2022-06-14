import { NgModule } from '@angular/core';
import {Acc}
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormationComponent } from './formation/formation.component';
import { CoreComponent } from './candidat/core.component';
import { CandidatComponent } from './candidat/candidat.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';


@NgModule({
  declarations: [
    AppComponent,
    FormationComponent,
    CoreComponent,
    CandidatComponent,
    
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
