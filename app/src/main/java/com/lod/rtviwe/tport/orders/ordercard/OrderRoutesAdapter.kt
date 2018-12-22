package com.lod.rtviwe.tport.orders.ordercard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lod.rtviwe.tport.R
import com.lod.rtviwe.tport.orders.ordercard.wrapper.OrderItem
import com.lod.rtviwe.tport.orders.ordercard.wrapper.OrderItemType
import com.lod.rtviwe.tport.orders.ordercard.wrapper.OrderLocation
import com.lod.rtviwe.tport.orders.ordercard.wrapper.OrderRoute

class OrderRoutesAdapter(
    private val context: Context?,
    private var orderItemsList: List<OrderItem>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemCount() = orderItemsList.size

    override fun getItemViewType(position: Int): Int = orderItemsList[position].type.ordinal

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder = when (viewType) {
        OrderItemType.LOCATION.ordinal -> ViewHolderOrderLocation(
            LayoutInflater.from(context)
                .inflate(R.layout.order_location_item, parent, false)
        )
        OrderItemType.ROUTE.ordinal -> ViewHolderOrderRoute(
            LayoutInflater.from(context)
                .inflate(R.layout.order_route_item, parent, false)
        )
        else -> throw RuntimeException("Unknown route type")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val isLast = (position == (orderItemsList.size - 1))
        val isFirst = (position == 0)
        when (holder.itemViewType) {
            OrderItemType.LOCATION.ordinal -> {
                (holder as ViewHolderOrderLocation).bind(orderItemsList[position] as OrderLocation, isFirst, isLast)
            }
            OrderItemType.ROUTE.ordinal ->
                (holder as ViewHolderOrderRoute).bind(orderItemsList[position] as OrderRoute)
        }
    }

    fun setData(newData: List<OrderItem>) {
        orderItemsList = newData
        notifyDataSetChanged()
    }
}