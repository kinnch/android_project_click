package com.example.tngp17_001.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class TapActivity extends AppCompatActivity  {

    private TextView showText;
    private int count;
    private int target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap);
        Intent extra = getIntent();
        target = extra.getIntExtra("Count", 10);
        Log.d("count", ""+target);
        count = 0;
        showText = (TextView) findViewById(R.id.tv_count);
        ImageButton btn = (ImageButton) findViewById(R.id.btn_add);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                showText.setText("" + count);
                if (count >= target) {
                    Intent i = new Intent(TapActivity.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });
    }


}
