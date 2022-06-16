import { Component, OnInit } from '@angular/core';
import { forEach } from 'lodash';
import { Observable } from 'rxjs';
import { Formation } from 'src/app/entities/formation';

import { FormationService } from '../service/formation.service';

@Component({
  selector: 'list-formation',
  templateUrl: './list-formation.component.html',
  styleUrls: ['./list-formation.component.scss']
})


export class ListFormationComponent implements OnInit {
  public formation$ : Observable<Formation[]>;
  
  constructor(private formationService : FormationService,
    ) { }
  ngOnInit(): void {
    this.formation$ = this.formationService.GetAllFormation();

  }



  }

