package com.example.datatimeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    TextView txt1;
    TextView txt2;
    // Текущее время
    Date currentDate = new Date();
    // Форматирование времени как "день.месяц.год"
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
    String dateText = dateFormat.format(currentDate);
    // Форматирование времени как "часы:минуты:секунды"
    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
    String timeText = timeFormat.format(currentDate);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.mybtn1);
        txt1 = findViewById(R.id.mytxt1);
        txt2 = findViewById(R.id.mytxt2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(" ");
                txt2.setText("Дата: " + dateText + ", время: " + timeText);
                Intent switcher = new Intent(MainActivity.this, Act1.class);
                MainActivity.this.startActivity(switcher);
            }
        });
    }
}