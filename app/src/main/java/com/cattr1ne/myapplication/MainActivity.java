package com.cattr1ne.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // поле
    private EditText massIn;
    private Button button;
    private TextView energyOut;

    private  String mass = "";

    Algorithm algorithm = new Algorithm();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // привязка к полям разметки по id
        massIn = findViewById(R.id.massIn);
        button = findViewById(R.id.button);
        energyOut = findViewById(R.id.energyOut);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // исполняемый код при нажатие кномки
            mass = massIn.getText().toString();

            energyOut.setText("Количество энергии будет равно" + algorithm.absoluteEnergy(mass) + " Джоулей");

        }
    };
}