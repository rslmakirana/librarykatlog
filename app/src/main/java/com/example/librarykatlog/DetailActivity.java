package com.example.librarykatlog;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. Menangkap data dari Intent
        String judul = getIntent().getStringExtra("nama_buku");
        int idGambar = getIntent().getIntExtra("gambar_buku", 0);

        // Menampilkan Judul
        TextView txtJudul = (TextView) findViewById(R.id.txtJudulDetail);
        txtJudul.setText(judul);

        // Menampilkan Gambar Buku
        ImageView imgBuku = (ImageView) findViewById(R.id.imgBuku);
        if (idGambar != 0) {
            imgBuku.setImageResource(idGambar);
        }

        // 2. Koding Tombol Go Back agar bisa kembali
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // 3. Memunculkan Fragment
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        DetailFragment fragment = new DetailFragment();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.commit();
    }
}