package com.example.listview_triandika_33_xi_rpl_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    
    //logt
    private static final String TAG = "DetailActivity";

    TextView tvnamaBuah;
    ImageView ivgambarBuah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String namabuah = getIntent().getStringExtra(konstanta.DATANAMA);
        int gambarbuah = getIntent().getIntExtra(konstanta.DATAGAMBAR, 0);

        //log
        Log.d(TAG, "onCreate: " + namabuah);
        Log.d(TAG, "onCreate: " + gambarbuah);

        tvnamaBuah = findViewById(R.id.tv_detail_nama);
        ivgambarBuah = findViewById(R.id.iv_detail_gambar);

        tvnamaBuah.setText(namabuah);
        ivgambarBuah.setImageResource(gambarbuah);
    }
}
