package com.example.progettogruppo4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button change;
    TextView nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (TextView) findViewById(R.id.nome);
        change = (Button) findViewById(R.id.change);
    }

    public void changeText(){
        nome.setText("Bonomi");
        setContentView(nome);
    }
}