import { Injectable } from '@angular/core';
import { Formation } from 'src/app/entities/formation';
import { HttpClient } from '@angular/common/http';
import * as _ from 'lodash';
import { Observable, of } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class FormationService {


  public AddFormation( formation : Observable<Formation>): void {
    this.http.post<Formation>('http://localhost:8080/ItTraining/formation', formation);

  }

  public GetAllFormation() : Observable<Formation[]>{
    return this.http.get<Formation[]>('http://localhost:8080/ItTraining/formation');
  }

  public DeleteFormation(id : number){
    this.http.delete<Formation>('http://localhost:8080/ItTraining/formation/${id}');
  }

  public GetFormation(id : number){
    return this.http.get<Formation>('http://localhost:8080/ItTraining/formation/${id}');
  }

  public UpdateFormation(formation : Observable<Formation>) {
    
  }
  constructor(private http: HttpClient) { }
}
