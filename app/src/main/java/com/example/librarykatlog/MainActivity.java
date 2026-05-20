package com.example.librarykatlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Memanggil fungsi untuk mengatur klik pada setiap buku
        aturBuku(R.id.buku1, "Judul Buku 1", "Ini adalah sinopsis buku pertama. Nanti isinya bisa kamu ganti menjadi sangat panjang.", R.drawable.bumi_manusia);
        aturBuku(R.id.buku2, "Judul Buku 2", "Ini sinopsis buku kedua. Ceritanya berbeda dari buku yang pertama.", R.drawable.cantik_itu_luka);
        aturBuku(R.id.buku3, "Judul Buku 3", "Sinopsis buku ketiga ada di sini.", R.drawable.azab_sengsara);
        aturBuku(R.id.buku4, "Judul Buku 4", "Cerita seru di buku keempat...", R.drawable.pulang);
        aturBuku(R.id.buku5, "Judul Buku 5", "Petualangan baru di buku kelima.", R.drawable.ditanah_lada);
        aturBuku(R.id.buku6, "Judul Buku 6", "Kisah inspiratif di buku keenam.", R.drawable.mcintaguru_honorer);
    //    aturBuku(R.id.buku7, "Judul Buku 7", "Misteri yang belum terpecahkan di buku ketujuh.", R.drawable.buku7);
    //    aturBuku(R.id.buku8, "Judul Buku 8", "Drama kehidupan pada buku kedelapan.", R.drawable.buku8);
    //    aturBuku(R.id.buku9, "Judul Buku 9", "Penutup yang manis di buku kesembilan.", R.drawable.buku9);
    }

    // Fungsi bantuan agar kodingan tidak terlalu panjang dan berulang
    private void aturBuku(int idImageView, final String judul, final String sinopsis, final int idGambar) {
        ImageView buku = (ImageView) findViewById(idImageView);
        buku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama_buku", judul);
                pindah.putExtra("sinopsis_buku", sinopsis);
                pindah.putExtra("gambar_buku", idGambar);
                startActivity(pindah);
            }
        });
    }
}