import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CatalogueComponent } from './catalogue.component';
import { CatalogueRoutingModule } from './catalogue-routing.module';
import { FormationsComponent } from './formations/formations.component';



@NgModule({
  declarations: [CatalogueComponent,
  FormationsComponent],
  imports: [
    CatalogueRoutingModule,
    CommonModule
  ]
})
export class CatalogueModule { }
