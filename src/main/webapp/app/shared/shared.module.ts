import { NgModule } from '@angular/core';
import { SallefySharedLibsModule } from './shared-libs.module';
import { FindLanguageFromKeyPipe } from './language/find-language-from-key.pipe';
import { SfAlertComponent } from './alert/alert.component';
import { SfAlertErrorComponent } from './alert/alert-error.component';
import { SfLoginComponent } from './login/login.component';
import { HasAnyAuthorityDirective } from './auth/has-any-authority.directive';

@NgModule({
  imports: [SallefySharedLibsModule],
  declarations: [FindLanguageFromKeyPipe, SfAlertComponent, SfAlertErrorComponent, SfLoginComponent, HasAnyAuthorityDirective],
  entryComponents: [SfLoginComponent],
  exports: [
    SallefySharedLibsModule,
    FindLanguageFromKeyPipe,
    SfAlertComponent,
    SfAlertErrorComponent,
    SfLoginComponent,
    HasAnyAuthorityDirective
  ]
})
export class SallefySharedModule {}
