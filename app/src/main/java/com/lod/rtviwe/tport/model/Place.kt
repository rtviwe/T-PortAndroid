package com.lod.rtviwe.tport.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Place(
    val name: String,
    val region: String,
    val iataCode: String?,
    val coordinates: Coordinates?
) : Parcelable