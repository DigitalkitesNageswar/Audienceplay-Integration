# AudienceplayIntegration

## Steps to integrate our API

1) Register your account with valid Email address from http://register.audienceplay.com/

2) Login with authentication details.

3) Once admin activate your account you can access API_KEY.
(Note :- Usually it will take 24 hours to aprove your account)

4) Once account activated you can find API_KEY in settings tab.

5) Installation : Android Studio (or Gradle) No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

```
 compile 'com.play:audienceplay:1.0.0'
                    (or)
 implementation 'com.play:audienceplay:1.0.0' if you are using Android Studio version 3.0
```

Note: We recommend you to use

```
 compile 'com.play:audienceplay:1.+'
```

Usage : To initiate our library, place the below code at initial activity of your application(ex: splash activity).

PlayApp.initialize(context, "YOUR_API_KEY",  "USER_GOOGLE_ADVERTISER_ID");

        PlayApp.start("transaction_name");
        
        PlayApp.add("string", "name", "myname");
        
        PlayApp.add("string", "email", "myemail@gmail.com");
        
        PlayApp.add("date", "stratdate", "20192233");
        
        PlayApp.send();
```
context -> your application context
YOUR_API_KEY -> your registered application API key from http://way2online.audienceplay.com/
USER_GOOGLE_ADVERTISER_ID -> it is the google advertiserId from the mobile.
transaction_name -> name of thetransaction.
```
implement PlayCallbacks in the same Activity where you are calling above initialize() method, so that Callback methods will be overriden and you can redirect the user accourdingly with success, failure functions accordingly.

MainActivity extends AppCompatActivity implements PlayCallbacks
```
@Override public void onDataSuccess(String message, String data) { 
  //TODO for successful request with data as response

}

@Override
 public void onDataFailure(String message) {
    //TODO for failure with failure message.

}
```
