import { Component, OnInit } from '@angular/core';

import { FormationService } from '../service/formation.service';

@Component({
  selector: 'list-formation',
  templateUrl: './list-formation.component.html',
  styleUrls: ['./list-formation.component.scss']
})


export class ListFormationComponent {

  constructor(private formationService : FormationService) { }

   public _formation = this.formationService.GetAllFormation();  



}
