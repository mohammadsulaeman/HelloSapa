package com.example.hellosapa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editNama;
    TextView textHasil;
    Button tampilbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = findViewById(R.id.edtnama);
        textHasil = findViewById(R.id.tampilData);
        tampilbutton = findViewById(R.id.tampilButton);
        tampilbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                textHasil.setText("Hallo Nama Saya : "+nama);
                editNama.getText().clear();
            }
        });
    }
}