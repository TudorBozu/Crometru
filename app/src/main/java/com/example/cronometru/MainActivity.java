package com.example.cronometru;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer cronometru = findViewById(R.id.cronometru);
        Button start_stop = findViewById(R.id.start_stop);
        Button stop = findViewById(R.id.stop_but);
        Button reset = findViewById(R.id.Reset);

        start_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             cronometru.start();
            }
        });
stop.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        cronometru.stop();
        Toast.makeText(MainActivity.this, cronometru.getText(),
                Toast.LENGTH_LONG).show();

    }
});
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cronometru.setBase(SystemClock.elapsedRealtime());
                cronometru.start();
            }
        });
    }
}