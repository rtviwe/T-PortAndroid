package com.lod.rtviwe.tport.search.searchtrip

data class SearchTripsRequest(
    val departureCityName: String,
    val destinationCityName: String,
    val departDate: String
)