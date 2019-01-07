package com.lod.rtviwe.tport.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
enum class TransportationType : Parcelable {
    TAXI, AIRPLANE, TRAIN, SHIP, FOOT
}