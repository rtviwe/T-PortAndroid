package com.lod.rtviwe.tport.orders.ordercard

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lod.rtviwe.tport.R
import com.lod.rtviwe.tport.orders.ordercard.wrapper.OrderRoute
import com.lod.rtviwe.tport.utils.RouteIcons
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.order_route_item.*
import java.text.SimpleDateFormat
import java.util.*

class ViewHolderOrderRoute(override val containerView: View) : RecyclerView.ViewHolder(containerView),
    LayoutContainer {

    fun bind(routeItem: OrderRoute) {
        val imageResourceToSet = RouteIcons.getImageResource(routeItem.route.type)
        image_view_route_type.setImageResource(imageResourceToSet)

        text_view_route_name.text = routeItem.route.text
        text_view_route_cost.text =
                String.format(containerView.context.getString(R.string.money), routeItem.route.cost)

        text_view_route_time.text =
                SimpleDateFormat("hh:mm", Locale.getDefault()).format(routeItem.route.destination.arrivalDate)

        text_view_is_route_paid.text =
                if (routeItem.route.isPaid)
                    containerView.context.getString(R.string.is_paid)
                else
                    containerView.context.getString(R.string.not_paid)
    }
}