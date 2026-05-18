package com.example.librarykatlog;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.librarykatlog.R;

public class MainActivity extends Activity {
    // Data sederhana untuk ditampilkan di ListView
    String[] daftarBuku = {"Bumi - Tere Liye", "Bulan - Tere Liye", "Matahari - Tere Liye"}; //ini nanti diganti pake daftar buku yang ud dikirim tim inspirasi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listViewBuku);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftarBuku);
        listView.setAdapter(adapter);

        // Mengirim data ke activity kedua menggunakan Intent
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama_buku", daftarBuku[position]);
                startActivity(pindah);
            }
        });
    }
}