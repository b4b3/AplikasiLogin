package com.dicoding.picodiploma.aplikasilogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SuccessActivity extends AppCompatActivity {

    private Button btnPos;
    private Button btnProfil;
    private Button btnStatus;
    private Button btnPenerimaan;
    private Button btnAbout;
    private Button btnKosong;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        btnPos = findViewById(R.id.btnPos);
        btnPos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SuccessActivity.this,  PosActivity.class);
                startActivity(intent);
                //SuccessActivity.this.finish();
            }
        });

        btnProfil = findViewById(R.id.btnProfil);
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(SuccessActivity.this, ProfilActivity.class);
               // startActivity(intent);
                Toast.makeText(SuccessActivity.this, "Menu Belum Tersedia", Toast.LENGTH_LONG).show();

            }
        });

        btnStatus = findViewById(R.id.btnStatus);
        btnStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(SuccessActivity.this, StatusActivity.class);
                //startActivity(intent);
                Toast.makeText(SuccessActivity.this, "Menu Belum Tersedia", Toast.LENGTH_LONG).show();

            }
        });

        btnPenerimaan = findViewById(R.id.btnPenerimaan);
        btnPenerimaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(SuccessActivity.this, PenerimaanActivity.class);
                //startActivity(intent);
                Toast.makeText(SuccessActivity.this, "Menu Belum Tersedia", Toast.LENGTH_LONG).show();

            }
        });

        btnAbout = findViewById(R.id.btnAbout);
        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent intent = new Intent(SuccessActivity.this, AboutActivity.class);
               // startActivity(intent);
                Toast.makeText(SuccessActivity.this, "Menu Belum Tersedia", Toast.LENGTH_LONG).show();

            }
        });

        btnKosong = findViewById(R.id.btnKosong);
        btnKosong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent = new Intent(SuccessActivity.this,AboutActivity.class);
                //startActivity(intent);
                Toast.makeText(SuccessActivity.this, "Menu Belum Tersedia", Toast.LENGTH_LONG).show();
            }
        });
    }
}
