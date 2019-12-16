package com.example.asus.kalkulator_ririn2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText angkapertama, angkakedua, angkaketiga;
    Button btntambah, btnkurang, btnkali, btnbagi;
    TextView hasil;
    CheckBox chb1, chb2, chb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkapertama = findViewById(R.id.angkapertama);
        angkakedua = findViewById(R.id.angkakedua);
        angkaketiga = findViewById(R.id.angkaketiga);
        btntambah = findViewById(R.id.btntambah);
        btnkurang = findViewById(R.id.btnkurang);
        btnkali = findViewById(R.id.btnkali);
        btnbagi = findViewById(R.id.btnbagi);
        hasil = findViewById(R.id.hasil);
        chb1 = findViewById(R.id.chb1);
        chb2 = findViewById(R.id.chb2);
        chb3 = findViewById(R.id.chb3);

        btntambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb1.isChecked() && !chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && !chb2.isChecked() && chb3.isChecked()
                        ){
                    Toast.makeText(getApplicationContext(), "Minimal masukkan 2 input", Toast.LENGTH_SHORT).show();
                }else{

                    if ((angkapertama.getText().length() > 0) && (angkakedua.getText().length() > 0) && (angkaketiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (chb1.isChecked()){
                            angka1 = Double.parseDouble(angkapertama.getText().toString());
                        }else{
                            angka1 = 0;
                        }
                        if (chb2.isChecked()){
                            angka2 = Double.parseDouble(angkakedua.getText().toString());
                        }else{
                            angka2 = 0;
                        }
                        if (chb3.isChecked()){
                            angka3 = Double.parseDouble(angkaketiga.getText().toString());
                        }else{
                            angka3 = 0;
                        }
                        double result = angka1 + angka2 + angka3;
                        hasil.setText(Double.toString(result));
                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }



            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb1.isChecked() && !chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && !chb2.isChecked() && chb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "minimal masukkan 2 input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkapertama.getText().length() > 0) && (angkakedua.getText().length() > 0) && (angkaketiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (chb1.isChecked()){
                            angka1 = Double.parseDouble(angkapertama.getText().toString());
                        }else{
                            angka1 = 0;
                        }
                        if (chb2.isChecked()){
                            angka2 = Double.parseDouble(angkakedua.getText().toString());
                        }else{
                            angka2 = 0;
                        }
                        if (chb3.isChecked()){
                            angka3 = Double.parseDouble(angkaketiga.getText().toString());
                        }else{
                            angka3 = 0;
                        }
                        double result = angka1 - angka2 - angka3;
                        hasil.setText(Double.toString(result));
                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb1.isChecked() && !chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && !chb2.isChecked() && chb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "minimal masukkan 2 input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkapertama.getText().length() > 0) && (angkakedua.getText().length() > 0) && (angkaketiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (chb1.isChecked()){
                            angka1 = Double.parseDouble(angkapertama.getText().toString());
                        }else{
                            angka1 = 1;
                        }
                        if (chb2.isChecked()){
                            angka2 = Double.parseDouble(angkakedua.getText().toString());
                        }else{
                            angka2 = 1;
                        }
                        if (chb3.isChecked()){
                            angka3 = Double.parseDouble(angkaketiga.getText().toString());
                        }else{
                            angka3 = 1;
                        }
                        double result = angka1 * angka2 * angka3;
                        hasil.setText(Double.toString(result));
                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb1.isChecked() && !chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && chb2.isChecked() && !chb3.isChecked() ||
                        !chb1.isChecked() && !chb2.isChecked() && chb3.isChecked()) {
                    Toast.makeText(getApplicationContext(), "minimal masukkan 2 input", Toast.LENGTH_LONG).show();
                } else {
                    if ((angkapertama.getText().length() > 0) && (angkakedua.getText().length() > 0) && (angkaketiga.getText().length() > 0)) {
                        double angka1, angka2, angka3;
                        if (chb1.isChecked()){
                            angka1 = Double.parseDouble(angkapertama.getText().toString());
                        }else{
                            angka1 = 1;
                        }
                        if (chb2.isChecked()){
                            angka2 = Double.parseDouble(angkakedua.getText().toString());
                        }else{
                            angka2 = 1;
                        }
                        if (chb3.isChecked()){
                            angka3 = Double.parseDouble(angkaketiga.getText().toString());
                        }else{
                            angka3 = 1;
                        }
                        double result = angka1 / angka2 / angka3;
                        hasil.setText(Double.toString(result));
                    }
                    if ((angkapertama.getText().length() > 0) && (angkakedua.getText().length() > 0) && (angkaketiga.getText().length() > 0)) {
                        double angka1 = Double.parseDouble(angkapertama.getText().toString());
                        double angka2 = Double.parseDouble(angkakedua.getText().toString());
                        double angka3 = Double.parseDouble(angkaketiga.getText().toString());
                        double result = angka1 / angka2 / angka3;
                        hasil.setText(Double.toString(result));
                    } else {
                        Toast toast = Toast.makeText(MainActivity.this, "Input tidak boleh kosong", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
    }

}

