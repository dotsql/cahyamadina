package com.example.edsnowden.guidemanasikumrah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView panduanUmrah = (ImageView) findViewById(R.id.panduanUmrah_img);
        panduanUmrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent panduanIntent = new Intent(MainActivity.this, PanduanUmrah.class);
                startActivity(panduanIntent);
            }
        });

        ImageView doaManasik = (ImageView) findViewById(R.id.doaManasik_img);
        doaManasik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent doaManasikIntent = new Intent(MainActivity.this, DoaManasik.class);
                startActivity(doaManasikIntent);
            }
        });

        ImageView informasi = (ImageView) findViewById(R.id.informasi_img);
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent informasiIntent = new Intent(MainActivity.this, Informasi.class);
                startActivity(informasiIntent);
            }
        });

        ImageView paketUmrah = (ImageView) findViewById(R.id.paketUmrah_img);
        paketUmrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent paketUmrahIntent = new Intent(MainActivity.this, PaketUmrah.class);
                startActivity(paketUmrahIntent);
            }
        });

        ImageView cabangdanPiuh = (ImageView) findViewById(R.id.cabangdanPiuh_img);
        cabangdanPiuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cabangdanPiuhIntent = new Intent(MainActivity.this, Cabang.class);
                startActivity(cabangdanPiuhIntent);
            }
        });

        ImageView jadwalKeberangkatan = (ImageView) findViewById(R.id.jadwal_img);
        jadwalKeberangkatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jadwalKeberangkatanIntent = new Intent(MainActivity.this, JadwalKeberangkatan.class);
                startActivity(jadwalKeberangkatanIntent);
            }
        });
    }
}
