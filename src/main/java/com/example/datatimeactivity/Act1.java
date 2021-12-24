package com.example.datatimeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Act1 extends AppCompatActivity {

    EditText editText;
    Button switcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act1);
        editText = findViewById(R.id.myedittext);
        switcher = findViewById(R.id.mybtn2);
        switcher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Act1.this, Act2.class);
                intent.putExtra("msg", editText.getText());
                startActivity(intent);
            }
        });
    }
}