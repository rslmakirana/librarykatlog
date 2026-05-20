package com.example.librarykatlog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BukuAdapter extends ArrayAdapter<buku>{
    public BukuAdapter(Context context, List<buku> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        buku buku = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_buku, parent, false);
        }

        ImageView imgBuku = convertView.findViewById(R.id.imgBukuItem);
        TextView txtJudul = convertView.findViewById(R.id.txtJudulItem);
        TextView txtPenulis = convertView.findViewById(R.id.txtPenulisItem);

        imgBuku.setImageResource(buku.getGambar());
        txtJudul.setText(buku.getJudul());
        txtPenulis.setText(buku.getPenulis());

        return convertView;
    }
}
