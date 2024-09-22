package com.faniillahi.wisatajepangfaniillahi.model

import android.os.Parcel
import android.os.Parcelable

data class model_wisata(
    val nama: String,
    val lokasi: String,
    val gambar: Int,
    val tanggal: String,
    val detail: String
) : Parcelable{
    constructor(parcel: Parcel):this(
        parcel.readString()?:"",
        parcel.readString()?:"",
        parcel.readInt(),
        parcel.readString()?:"",
        parcel.readString()?:""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeString(lokasi)
        parcel.writeInt(gambar)
        parcel.writeString(tanggal)
        parcel.writeString(detail)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<model_wisata> {
        override fun createFromParcel(parcel: Parcel): model_wisata {
            return model_wisata(parcel)
        }

        override fun newArray(size: Int): Array<model_wisata?> {
            return arrayOfNulls(size)
        }
    }
}