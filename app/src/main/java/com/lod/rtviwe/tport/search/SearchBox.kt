package com.lod.rtviwe.tport.search

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchBox(
    var fromPlace: String,
    var toPlace: String,
    var travelTime: String
) : Parcelable