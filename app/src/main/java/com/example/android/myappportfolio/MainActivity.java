package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void myApp(View v) {
        Button clickedButton = (Button) v;
        switch (clickedButton.getId()) {
            case R.id.spotify_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my SPOTIFY STREAMER APP!", LENGTH_LONG).show();
                break;

            case R.id.scores_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my SCORES APP!", LENGTH_LONG).show();
                break;

            case R.id.lib_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my LIBRARY APP!", LENGTH_LONG).show();
                break;

            case R.id.build_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my BUILD IT BIGGER APP!", LENGTH_LONG).show();
                break;

            case R.id.read_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my XYZ READER APP!", LENGTH_LONG).show();
                break;
            case R.id.cap_button:
                Toast.makeText(getApplicationContext(), "This Button will launch my CAPSTONE APP!", LENGTH_LONG).show();
                break;
        }
    }
}



