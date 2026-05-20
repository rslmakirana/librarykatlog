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
        aturBuku(R.id.buku7, "Dilan 1990", "Pidi Baiq", "Novel ini menceritakan kisah cinta remaja antara Dilan dan Milea saat SMA tahun 1990 di Bandung. Dilan dikenal sebagai cowok unik, romantis, dan suka memberi kejutan. Cara pendekatannya yang beda membuat Milea perlahan jatuh hati. " +
                "Ceritanya ringan, lucu, dan banyak kutipan romantis yang terkenal.", R.drawable.dilan);
        aturBuku(R.id.buku8, "Laskar Pelangi", "Andrea Hirata", "Novel ini mengisahkan perjuangan 10 anak dari Belitung yang tetap semangat sekolah meski hidup dalam keterbatasan. Dengan guru yang penuh dedikasi, mereka belajar tentang persahabatan, mimpi, dan perjuangan hidup. " +
                "Ceritanya menginspirasi dan penuh pesan tentang pendidikan.", R.drawable.laskar_pelangi);
        aturBuku(R.id.buku9, "Menanti Restu Langit", "Makhasin", "Buku ini menceritakan tentang perjuangan cinta, harapan, dan doa dalam menghadapi kehidupan. Tokohnya belajar menerima takdir dan terus berharap pada restu Tuhan di tengah berbagai ujian hidup. " +
                "Nuansa ceritanya lebih menyentuh dan penuh motivasi tentang kesabaran.", R.drawable.menanti_restu_l);
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