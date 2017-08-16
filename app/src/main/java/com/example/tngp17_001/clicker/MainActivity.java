package com.example.tngp17_001.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.et_userInput);

    }
    public void hitPlay(View v){
        Intent i = new Intent( this, TapActivity.class);
        i.putExtra("Count",Integer.parseInt(this.input.getText().toString()));
        startActivity(i);
    }

}
