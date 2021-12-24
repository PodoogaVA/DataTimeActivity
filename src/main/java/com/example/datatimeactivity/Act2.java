package com.example.datatimeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Act2 extends AppCompatActivity {

    TextView send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        Bundle arguments = getIntent().getExtras();
        String msg = arguments.get("msg").toString();
        send = findViewById(R.id.mysend);
        send.setText(msg);
    }
}