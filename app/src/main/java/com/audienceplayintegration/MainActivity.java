package com.audienceplayintegration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.play.PlayApp;
import com.play.PlayListeners.PlayCallbacks;

public class MainActivity extends AppCompatActivity implements PlayCallbacks {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Replace with your keys
        PlayApp.initialize(MainActivity.this, "YOUR_API_KEY",  "USER_GOOGLE_ADVERTISER_ID");
        PlayApp.start("testing transaction");
        PlayApp.add("string", "name", "myname");
        PlayApp.add("string", "email", "myemail@gmail.com");
        PlayApp.add("date", "stratdate", "20192233");
        PlayApp.send();

    }

    @Override
    public void onDataSuccess(String message, String data) {
        Log.i("onDataSuccess",""+data);
        Toast.makeText(this,message.toString(),2000).show();

    }

    @Override
    public void onDataFailure(String message) {
        Log.i("onDataFailure",""+message);
        Toast.makeText(this,message.toString(),2000).show();
    }
}
