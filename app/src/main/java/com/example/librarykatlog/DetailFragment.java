package com.example.librarykatlog;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        // Menghubungkan id komponen XML ke Java
        ImageView imgBuku = (ImageView) view.findViewById(R.id.imgBuku);
        TextView txtJudul = (TextView) view.findViewById(R.id.txtJudulDetail);
        TextView txtAuthor = (TextView) view.findViewById(R.id.txtAuthor);
        TextView txtSinopsis = (TextView) view.findViewById(R.id.txtSinopsis);

        // Menangkap kiriman data dari MainActivity
        if (getActivity().getIntent() != null) {
            String judul = getActivity().getIntent().getStringExtra("nama_buku");
            String author = getActivity().getIntent().getStringExtra("author_buku");
            String sinopsis = getActivity().getIntent().getStringExtra("sinopsis_buku");
            int idGambar = getActivity().getIntent().getIntExtra("gambar_buku", 0);

            // Menampilkan data ke layar
            if (judul != null) txtJudul.setText(judul);
            if (author != null) txtAuthor.setText(author);
            if (sinopsis != null) txtSinopsis.setText(sinopsis);
            if (idGambar != 0) imgBuku.setImageResource(idGambar);
        }

        return view;
    }
}