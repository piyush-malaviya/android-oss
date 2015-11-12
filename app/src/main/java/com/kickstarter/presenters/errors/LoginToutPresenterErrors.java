package com.kickstarter.presenters.errors;

import rx.Observable;

public interface LoginToutPresenterErrors {
  Observable<String> missingFacebookEmailError();
  Observable<String> facebookInvalidAccessTokenError();
  Observable<Void> tfaChallenge();
}
