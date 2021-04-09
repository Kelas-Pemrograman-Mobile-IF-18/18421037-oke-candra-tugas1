package com.chandra.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNama, txtNpm, txtFakultas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView) findViewById(R.id.txtNama);
        txtNama.setText("Oke Chandra");

        txtNpm = (TextView) findViewById(R.id.txtNpm);
        txtNpm.setText("18421037");

        txtFakultas = (TextView) findViewById(R.id.txtFakultas);
        txtFakultas.setText("Fakultas Ilmu Komputer");
    }
}