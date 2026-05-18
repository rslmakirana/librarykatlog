package com.example.librarykatlog;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // 1. Menangkap data dari Intent
        String judul = getIntent().getStringExtra("nama_buku");
        TextView txtJudul = (TextView) findViewById(R.id.txtJudulDetail);
        txtJudul.setText(judul);

        // 2. Koding Tombol Go Back agar bisa kembali
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Menutup activity ini dan kembali ke MainActivity
            }
        });

        // 3. Memunculkan Fragment (Isi Lorem Ipsum) ke dalam Layout
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        // Memasukkan DetailFragment ke dalam container 'fragmentContainer'
        DetailFragment fragment = new DetailFragment();
        ft.replace(R.id.fragmentContainer, fragment);
        ft.commit();
    }
}