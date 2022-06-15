import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteMachineComponent } from './delete-machine.component';

describe('DeleteMachineComponent', () => {
  let component: DeleteMachineComponent;
  let fixture: ComponentFixture<DeleteMachineComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeleteMachineComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteMachineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
