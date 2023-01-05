package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        Toast.makeText(this, "Алеся лучше всех!!! :-*", Toast.LENGTH_SHORT).show(); //Данный метод выводит оповещени о нажатой кнопке
    }
}