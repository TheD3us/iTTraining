import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Salle } from 'src/app/entities/salle';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SalleService {

  public AddSalle( salle : Observable<Salle>): void {
    this.http.post<Salle>('http://localhost:8080/ItTraining/salle', salle);
  }

  public GetAllSalle() : Observable<Salle[]>{
    return this.http.get<Salle[]>('http://localhost:8080/ItTraining/salle');
  }

  public DeleteSalle(id : number){
    this.http.delete<Salle>('http://localhost:8080/ItTraining/salle/${id}');
  }

  public GetSalle(id : number){
    return this.http.get<Salle>('http://localhost:8080/ItTraining/salle/${id}');
  }

  public UpdateSalle(salle : Observable<Salle>) {
    
  }

  constructor(private http: HttpClient) { }
}

