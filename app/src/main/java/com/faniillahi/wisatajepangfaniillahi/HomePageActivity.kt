package com.faniillahi.wisatajepangfaniillahi

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.faniillahi.wisatajepangfaniillahi.adapter.WisataAdapter
import com.faniillahi.wisatajepangfaniillahi.model.model_wisata

class HomePageActivity : AppCompatActivity() {
    private lateinit var wisataAdapter: WisataAdapter
    private lateinit var wisataList: List<model_wisata>


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_page)

        wisataList = listOf(
            model_wisata("Sensoji Temple","Asakusa, Tokyo", R.drawable.sensoji,"Tanggal : 20 september 2024", "Sensō-ji adalah kuil tertua di Tokyo, Jepang, yang didirikan pada tahun 645 M. Terletak di distrik Asakusa, kuil ini didedikasikan untuk Bodhisattva Kannon, dewi belas kasih. Pengunjung dapat melihat gerbang Kaminarimon yang megah, yang menjadi ikon kuil. Selain itu, jalan Nakamise yang mengarah ke kuil dipenuhi dengan toko-toko yang menjual makanan dan suvenir khas Jepang.\n" +
                    "\n" +
                    "Kuil ini juga menjadi pusat berbagai festival, terutama Sanja Matsuri, yang diadakan setiap tahun pada bulan Mei. Sensō-ji menarik jutaan pengunjung setiap tahun, baik untuk beribadah maupun wisata. Atmosfer spiritual dan sejarah yang kaya menjadikan tempat ini salah satu tujuan utama di Tokyo."),
            model_wisata("Kiyomizu-dera Temple","Kiyomizu, Kyoto", R.drawable.kiyomizu,"Tanggal : 20 september 2024", "Kiyomizu-dera adalah kuil Buddha yang terletak di Kyoto, Jepang, dan merupakan salah satu situs warisan dunia UNESCO. Didirikan pada tahun 778 M, kuil ini terkenal dengan platform kayu yang menonjol dari tebing, menawarkan pemandangan indah kota Kyoto dan sekitarnya, terutama saat musim semi dan musim gugur.\n" +
                    "\n" +
                    "Nama \"Kiyomizu\" berarti \"air bersih,\" merujuk pada mata air yang mengalir di bawah kuil, yang dianggap suci. Pengunjung dapat minum dari sumber air tersebut untuk mendapatkan keberuntungan dan kesehatan. Kuil ini juga memiliki patung Kannon dan berbagai bangunan bersejarah lainnya.\n" +
                    "\n" +
                    "Kiyomizu-dera sangat ramai saat festival dan musim sakura, menjadikannya salah satu tempat yang paling banyak dikunjungi di Kyoto."),
            model_wisata("Kinkakuji Temple","Kinkajicho, Kita Ward", R.drawable.kinkakuji,"Tanggal : 20 september 2024", "Kinkaku-ji, atau Kuil Paviliun Emas, adalah kuil Zen yang terletak di Kyoto, Jepang. Didirikan pada tahun 1397 oleh shogun Ashikaga Yoshimitsu, kuil ini terkenal karena paviliunnya yang dilapisi daun emas, yang mencerminkan keindahan dan kemewahan arsitektur Jepang.\n" +
                    "\n" +
                    "Kinkaku-ji dikelilingi oleh taman yang indah dan kolam yang menambah keindahan pemandangan. Meskipun paviliun aslinya terbakar habis pada tahun 1950, struktur yang ada saat ini dibangun kembali pada tahun 1955 dan tetap setia pada desain aslinya.\n" +
                    "\n" +
                    "Kuil ini merupakan bagian dari situs warisan dunia UNESCO dan menjadi salah satu tujuan wisata paling populer di Kyoto, menarik pengunjung dengan keindahan arsitekturnya dan suasana yang tenang."),
            model_wisata("Fushimi Inari Taishi Shrine","Fukaskusa, Fushimi", R.drawable.funshimi,"Tanggal : 22 september 2024", "Fushimi Inari Taisha adalah kuil Shinto yang terletak di Kyoto, Jepang, terkenal karena ribuan torii (gerbang tradisional Jepang) yang membentuk jalan setapak di sepanjang lereng Gunung Inari. Kuil ini didedikasikan untuk Inari, dewa padi, dan dibangun pada abad ke-8.\n" +
                    "\n" +
                    "Jalan setapak yang dipenuhi torii berwarna oranye cerah memberikan pengalaman yang menakjubkan saat menjelajahi kuil. Setiap torii biasanya didanai oleh individu atau perusahaan, dengan nama mereka terukir di papan kayu di belakang gerbang.\n" +
                    "\n" +
                    "Fushimi Inari Taisha juga dikenal sebagai tempat yang indah untuk hiking, dengan berbagai jalur menuju puncak gunung yang menawarkan pemandangan kota yang menakjubkan. Kuil ini menjadi salah satu tujuan wisata paling populer di Kyoto, baik untuk spiritualitas maupun keindahan alamnya.")
        )

        wisataAdapter = WisataAdapter(wisataList){ wisata ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("WISATA", wisata)
            startActivity(intent)
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this,2)
        recyclerView.adapter = wisataAdapter

    }
}