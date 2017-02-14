package com.example.pablocovarrubias.androidexamples;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends FragmentActivity {

    public final static String EXTRA_MESSAGE = "com.example.pablocovarrubias.androidexamples.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
