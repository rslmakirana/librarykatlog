package com.example.librarykatlog;

public class buku {
    private String judul;
    private String penulis;
    private String sinopsis;
    private int gambar;

    public buku(String judul, String penulis, String sinopsis, int gambar) {
        this.judul = judul;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
        this.gambar = gambar;
    }

    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
    public String getSinopsis() { return sinopsis; }
    public int getGambar() { return gambar; }
}
