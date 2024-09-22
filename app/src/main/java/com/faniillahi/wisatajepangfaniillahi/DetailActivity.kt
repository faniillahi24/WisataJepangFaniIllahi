package com.faniillahi.wisatajepangfaniillahi

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.faniillahi.wisatajepangfaniillahi.model.model_wisata

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)

        val wisata = intent.getParcelableExtra<model_wisata>( "WISATA")

        if(wisata != null){
            val namaTextView: TextView = findViewById(R.id.namaTextView)
            val lokasiTextView: TextView = findViewById(R.id.lokasiTextView)
            val tanggalTextView: TextView = findViewById(R.id.tanggalTextView)
            val detailTextView: TextView = findViewById(R.id.detailTextView)
            val gambarImageView: ImageView = findViewById(R.id.gambarImageView)

            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            tanggalTextView.text = wisata.tanggal
            detailTextView.text = wisata.detail
            gambarImageView.setImageResource(wisata.gambar)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}