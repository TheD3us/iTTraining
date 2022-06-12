import { Injectable } from '@angular/core';
import { Formation } from 'src/app/entities/formation';
import * as _ from 'lodash';


@Injectable({
  providedIn: 'root'
})
export class FormationService {
  private _formation : Formation[] = [];

  public AddFormation( formation : Formation): void {

    if(_.maxBy(this._formation, r => r.id) == undefined){
      formation.id = 1;
    }else{
      const maxFormation : Formation = _.maxBy(this._formation, r => r.id)!;
      formation.id = maxFormation.id + 1;
    }
    this._formation.push(formation);

  }
  constructor() { }
}
