package com.example.animalcatalogue

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CatalogueAdapter(private val items: List<CatalogueItem>) :
    RecyclerView.Adapter<CatalogueAdapter.CatalogueViewHolder>() {

    class CatalogueViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.itemTitle)
        val image: ImageView = view.findViewById(R.id.itemImage)
        val description: TextView = view.findViewById(R.id.itemDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogueViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_catalogue, parent, false)
        return CatalogueViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatalogueViewHolder, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.image.setImageResource(item.imageResId)
        holder.description.text = item.description
    }

    override fun getItemCount() = items.size
}
