import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VendorviewComponent } from './vendorview.component';

describe('VendorviewComponent', () => {
  let component: VendorviewComponent;
  let fixture: ComponentFixture<VendorviewComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VendorviewComponent]
    });
    fixture = TestBed.createComponent(VendorviewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
