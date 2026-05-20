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

        // Mengatur klik untuk 9 buku lengkap dengan Judul, Penulis, Sinopsis, dan Gambar
        aturBuku(R.id.buku1, "Bumi Manusia", "Pramoedya Ananta Toer", "Menceritakan kehidupan Minke, seorang pribumi terpelajar di masa penjajahan Belanda yang berjuang melawan diskriminasi dan mencari kebebasan hidup serta cinta.", R.drawable.bumi_manusia);
        aturBuku(R.id.buku2, "Cantik Itu Luka", "Eka Kurniawan", "Berkisah tentang Dewi Ayu, perempuan cantik yang hidup penuh penderitaan di masa kolonial. Novel ini memadukan sejarah, mistis, tragedi, dan kritik sosial.", R.drawable.cantik_itu_luka);
        aturBuku(R.id.buku3, "Azab dan Sengsara", "Merari Siregar", "Novel klasik Indonesia yang menceritakan kisah cinta Amiruddin dan Mariamin yang gagal karena adat dan perjodohan paksa.", R.drawable.azab_sengsara);
        aturBuku(R.id.buku4, "Pulang", "Tere Liye", "Menceritakan kehidupan para korban tragedi politik 1965 yang harus hidup di pengasingan luar negeri dan merindukan Indonesia sebagai tanah air mereka.", R.drawable.pulang);
        aturBuku(R.id.buku5, "Di Tanah Lada", "Ziggy Zezsyazeoviennazabrizkie", "Mengisahkan kehidupan Ava, anak kecil yang hidup dalam keluarga bermasalah dan berteman dengan seorang anak laki-laki bernama P di rumah susun.", R.drawable.ditanah_lada);
        aturBuku(R.id.buku6, "Misteri Cinta Guru Honorer", "Sartika Sari", "Novel Misteri Cinta Guru Honorer menceritakan perjuangan seorang guru honorer bernama Alya yang harus menghadapi kerasnya kehidupan dengan gaji minim dan berbagai tekanan pekerjaan. " +
                "Di tengah kesulitannya, Alya terjebak dalam kisah cinta yang penuh rahasia dan konflik. Kehadiran seseorang dari masa lalu membuat hidupnya berubah dan menghadirkan misteri yang perlahan terungkap. Novel ini menggambarkan perjuangan, pengorbanan, persahabatan, " +
                "dan arti cinta yang sebenarnya dalam kehidupan seorang guru honorer.", R.drawable.mcintaguru_honorer);

        // Mengaktifkan buku 7, 8, 9 (Untuk sementara pakai gambar yang ada dulu agar tidak merah)
    //    aturBuku(R.id.buku7, "Judul Buku 7", "Penulis Buku 7", "Ini adalah sinopsis untuk buku ketujuh.", R.drawable.bumi_manusia);
    //    aturBuku(R.id.buku8, "Judul Buku 8", "Penulis Buku 8", "Ini adalah sinopsis untuk buku kedelapan.", R.drawable.cantik_itu_luka);
     //   aturBuku(R.id.buku9, "Judul Buku 9", "Penulis Buku 9", "Ini adalah sinopsis untuk buku kesembilan.", R.drawable.azab_sengsara);
    }

    private void aturBuku(int idImageView, final String judul, final String author, final String sinopsis, final int idGambar) {
        ImageView buku = (ImageView) findViewById(idImageView);
        if (buku != null) {
            buku.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                    pindah.putExtra("nama_buku", judul);
                    pindah.putExtra("author_buku", author);
                    pindah.putExtra("sinopsis_buku", sinopsis);
                    pindah.putExtra("gambar_buku", idGambar);
                    startActivity(pindah);
                }
            });
        }
    }
}