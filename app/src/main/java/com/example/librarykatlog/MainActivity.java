package com.example.librarykatlog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listViewBuku);
        ArrayList<buku> daftarBuku = new ArrayList<>();

        // 1. Menambahkan data buku secara dinamis ke dalam list
        daftarBuku.add(new buku("Bumi Manusia", "Pramoedya Ananta Toer", "Menceritakan kehidupan Minke, seorang pribumi terpelajar di masa penjajahan Belanda yang berjuang melawan diskriminasi dan mencari kebebasan hidup serta cinta.", R.drawable.bumi_manusia));
        daftarBuku.add(new buku("Cantik Itu Luka", "Eka Kurniawan", "Berkisah tentang Dewi Ayu, perempuan cantik yang hidup penuh penderitaan di masa kolonial. Novel ini memadukan sejarah, mistis, tragedi, dan kritik sosial.", R.drawable.cantik_itu_luka));
        daftarBuku.add(new buku("Azab dan Sengsara", "Merari Siregar", "Novel klasik Indonesia yang menceritakan kisah cinta Amiruddin dan Mariamin yang gagal karena adat dan perjodohan paksa.", R.drawable.azab_sengsara));
        daftarBuku.add(new buku("Pulang", "Tere Liye", "Menceritakan kehidupan para korban tragedi politik 1965 yang harus hidup di pengasingan luar negeri dan merindukan Indonesia sebagai tanah air mereka.", R.drawable.pulang));
        daftarBuku.add(new buku("Di Tanah Lada", "Ziggy Zezsyazeoviennazabrizkie", "Mengisahkan kehidupan Ava, anak kecil yang hidup dalam keluarga bermasalah dan berteman dengan seorang anak laki-laki bernama P di rumah susun.", R.drawable.ditanah_lada));
        daftarBuku.add(new buku("Misteri Cinta Guru Honorer", "Sartika Sari", "Novel Misteri Cinta Guru Honorer menceritakan perjuangan seorang guru honorer bernama Alya yang harus menghadapi kerasnya kehidupan dengan gaji minim dan berbagai tekanan pekerjaan.", R.drawable.mcintaguru_honorer));
        daftarBuku.add(new buku("Dilan 1990", "Pidi Baiq", "Novel ini menceritakan kisah cinta remaja antara Dilan dan Milea saat SMA tahun 1990 di Bandung. Ceritanya ringan, lucu, dan banyak kutipan romantis yang terkenal.", R.drawable.dilan));
        daftarBuku.add(new buku("Laskar Pelangi", "Andrea Hirata", "Novel ini mengisahkan perjuangan 10 anak dari Belitung yang tetap semangat sekolah meski hidup dalam keterbatasan.", R.drawable.laskar_pelangi));
        daftarBuku.add(new buku("Menanti Restu Langit", "Makhasin", "Buku ini menceritakan tentang perjuangan cinta, harapan, dan doa dalam menghadapi kehidupan.", R.drawable.menanti_restu_l));
        daftarBuku.add(new buku("Layangan Putus", "Mommy ASF", "Buku ini menceritakan tentang rumah tangga yang awalnya terlihat sempurna, namun berubah karena hadirnya orang ketiga.", R.drawable.layangan_putus));
        daftarBuku.add(new buku("When It's Real", "Erin Watt", "Novel ini bercerita tentang Vaughn, seorang musisi terkenal, yang berpura-pura pacaran dengan Oakley demi memperbaiki citra publiknya.", R.drawable.wir));
        daftarBuku.add(new buku("Dikta Dan Hukum", "Dhia'an Farah", "Buku ini menceritakan tentang Nadhira Aisha, seorang gadis yang harus menghadapi penyakit serius di usianya yang masih muda.", R.drawable.dikta_dan_hukum));

        // 2. Memasang Adapter ke ListView
        BukuAdapter adapter = new BukuAdapter(this, daftarBuku);
        listView.setAdapter(adapter);

        // 3. Menambahkan Event Listener untuk Klik tiap Item Buku
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Ambil data buku yang diklik berdasarkan posisinya di list
                buku bukuDipilih = daftarBuku.get(position);

                // Lakukan perpindahan (Intent) membawa data buku
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("nama_buku", bukuDipilih.getJudul());
                pindah.putExtra("author_buku", bukuDipilih.getPenulis());
                pindah.putExtra("sinopsis_buku", bukuDipilih.getSinopsis());
                pindah.putExtra("gambar_buku", bukuDipilih.getGambar());
                startActivity(pindah);
            }
        });
    }
}