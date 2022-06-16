import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { ModalComponent } from 'src/app/core/modal/modal.component';
import { FormationService } from '../service/formation.service';

@Component({
  selector: 'app-delete-formation',
  templateUrl: './delete-formation.component.html',
  styleUrls: ['./delete-formation.component.scss']
})
export class DeleteFormationComponent implements OnInit {
  private id : number;
  tmp : string | null;
  constructor(private route: ActivatedRoute,
    private formationService: FormationService ,
    private router: Router,
    private modalService : NgbModal) { }

  ngOnInit(): void {
    this.tmp = this.route.snapshot.paramMap.get('id');
    if(this.tmp) {
      this.id = parseInt(this.tmp);
      const modalRef: NgbModalRef = this.modalService.open(ModalComponent);
      const componentInstance : ModalComponent = modalRef.componentInstance;
      componentInstance.confirmMessage = "Etes vous sur de vouloir supprimer la formation ?";
      componentInstance.confirmResponse.subscribe((b: boolean) => {
        if(b == true){
          this.formationService.DeleteFormation(this.id);
        }
        this.router.navigate(['formation']);
        modalRef.close();
      })
    }
    
  }

}
