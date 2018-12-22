package com.lod.rtviwe.tport.search

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.lod.rtviwe.tport.search.wrappers.PopularItem
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.popular_item.*

class ViewHolderPopularItem(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    fun bind(popularItem: PopularItem) {
        text_view_popular_item_place_from.text = popularItem.placeFrom
        text_view_popular_item_place_to.text = popularItem.placeTo

        Glide.with(containerView.context)
            .load(popularItem.backgroundUrl)
            .into(image_view_popular_item_background)

        card_view_popular_item.setOnClickListener {

        }
    }
}