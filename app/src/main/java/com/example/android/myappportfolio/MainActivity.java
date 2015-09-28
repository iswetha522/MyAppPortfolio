package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void spotSteam(View view) {

        Toast.makeText(getApplicationContext(), "This Button will launch my SPOTIFY STEAMER APP!", LENGTH_LONG).show();
    }

    public void scoreApp(View view) {
        Toast.makeText(getApplicationContext(), "This Button will launch my SCORES APP!", LENGTH_LONG).show();
    }

    public void libApp(View view) {

        Toast.makeText(getApplicationContext(), "This Button will launch my LIBRARY APP!", LENGTH_LONG).show();
    }

    public void buildBig(View view) {

        Toast.makeText(getApplicationContext(), "This Button will launch my BUILD IT BIGGER APP!", LENGTH_LONG).show();
    }

    public void xyzRead(View view) {

        Toast.makeText(getApplicationContext(), "This Button will launch my XYZ READER APP!", LENGTH_LONG).show();
    }

    public void capApp(View view) {

        Toast.makeText(getApplicationContext(), "This Button will launch my CAPSTONE APP!", LENGTH_LONG).show();
    }
}
