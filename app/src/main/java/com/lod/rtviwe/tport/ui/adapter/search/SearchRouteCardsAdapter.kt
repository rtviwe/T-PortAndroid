package com.lod.rtviwe.tport.ui.adapter.search

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lod.rtviwe.tport.R
import com.lod.rtviwe.tport.model.Trip
import com.lod.rtviwe.tport.ui.viewholder.searchroutefragment.ViewHolderTripItem

class SearchRouteCardsAdapter(
    private val context: Context?,
    private var tripsList: List<Trip>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = tripsList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolderTripItem(
            LayoutInflater.from(context)
                .inflate(R.layout.search_route_card, parent, false)
        )

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolderTripItem).bind(tripsList[position])
    }

    fun setData(newData: List<Trip>) {
        tripsList = newData
        notifyDataSetChanged()
    }
}