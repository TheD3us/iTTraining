import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Machine } from 'src/app/entities/machine';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MachineService {
  public AddMachine( machine : Observable<Machine>): void {
    this.http.post<Machine>('http://localhost:8080/ItTraining/machine', machine);
  }

  public GetAllMachine() : Observable<Machine[]>{
    return this.http.get<Machine[]>('http://localhost:8080/ItTraining/machine');
  }

  public DeleteMachine(id : number){
    this.http.delete<Machine>('http://localhost:8080/ItTraining/machine/${id}');
  }

  public GetMachine(id : number){
    return this.http.get<Machine>('http://localhost:8080/ItTraining/machine/${id}');
  }

  public UpdateMachine(machine : Observable<Machine>) {
    
  }

  constructor(private http: HttpClient) { }
}

