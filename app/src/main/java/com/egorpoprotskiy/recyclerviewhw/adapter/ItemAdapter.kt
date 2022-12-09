package com.egorpoprotskiy.recyclerviewhw.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.egorpoprotskiy.recyclerviewhw.R
import com.egorpoprotskiy.recyclerviewhw.model.Hmm


class ItemAdapter(private val context: Context, private val dataset: List<Hmm>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        val textView1: TextView = view.findViewById(R.id.tv_text1)
        val textView2: TextView = view.findViewById(R.id.tv_text2)
        val imageView: ImageView = view.findViewById(R.id.iv_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text = context.resources.getText(item.stringResourceId)
        holder.textView2.text = context.resources.getText(item.stringDate)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int = dataset.size
}