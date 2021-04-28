package com.example.listview_triandika_33_xi_rpl_4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private Context context;
    private String[] namaBuah;
    private int[] gambarBuah;

    public CustomListAdapter(Context context1, String[] namaBuah, int[] gambarBuah) {
        super(context1, R.layout.item_buah, namaBuah);
        this.context = context1;
        this.namaBuah = namaBuah;
        this.gambarBuah = gambarBuah;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater;
        View view = LayoutInflater.from(context).inflate(R.layout.item_buah,parent, false);
        TextView tvNamaBuah = view.findViewById(R.id.tv_detail_nama);
        ImageView ivGambarBuah = view.findViewById(R.id.iv_detail_gambar);
        tvNamaBuah.setText(namaBuah[position]);
        ivGambarBuah.setImageResource(gambarBuah[position]);
        return view;
    }
}
