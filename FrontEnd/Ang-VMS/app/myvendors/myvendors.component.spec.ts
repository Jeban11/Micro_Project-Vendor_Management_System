import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyvendorsComponent } from './myvendors.component';

describe('MyvendorsComponent', () => {
  let component: MyvendorsComponent;
  let fixture: ComponentFixture<MyvendorsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [MyvendorsComponent]
    });
    fixture = TestBed.createComponent(MyvendorsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
