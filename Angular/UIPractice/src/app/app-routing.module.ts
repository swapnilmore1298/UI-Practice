import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FlexboxComponent } from './flexbox/flexbox.component';
import { LoginPageComponent } from './login-page/login-page.component';

const routes: Routes = [
  {
    path : "",
    component : LoginPageComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
