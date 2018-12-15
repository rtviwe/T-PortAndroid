package com.lod.rtviwe.tport.data

import androidx.lifecycle.MutableLiveData
import com.lod.rtviwe.tport.model.mainscrollitem.MainScrollItem
import com.lod.rtviwe.tport.model.mainscrollitem.PopularItem

object MockMainScroll : MainScrollItemsProvider {

    override fun getItems(): MutableLiveData<MutableList<MainScrollItem>> = data

    var data = MutableLiveData<MutableList<MainScrollItem>>().apply {
        postValue(
            mutableListOf(
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                ),
                PopularItem(
                    "Moscow",
                    "Piter",
                    "https://i1.photocentra.ru/images/main78/781689_main.jpg"
                )
            )
        )
    }
}