package com.faniillahi.wisatajepangfaniillahi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.faniillahi.wisatajepangfaniillahi.R
import com.faniillahi.wisatajepangfaniillahi.model.model_wisata


class WisataAdapter (
    private val wisataList : List<model_wisata>,
    private val onItemClick : (model_wisata) -> Unit
) : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata,parent,false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.bind(wisata, onItemClick)
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val namaTextView : TextView = itemView.findViewById(R.id.namaTextView)
        val lokasiTextView : TextView = itemView.findViewById(R.id.lokasiTextView)
        val gambarImageView : ImageView = itemView.findViewById(R.id.gambarImageView)

        fun bind(wisata: model_wisata, onItemClick: (model_wisata) -> Unit){
            namaTextView.text = wisata.nama
            lokasiTextView.text = wisata.lokasi
            gambarImageView.setImageResource(wisata.gambar)

            itemView.setOnClickListener{
                onItemClick(wisata)
            }
        }
    }
}