package com.example.islami.ui.SuraDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.islami.R

class VersesAdapter:Adapter<VersesAdapter.VerseViewHolder>() {

    var items:List<String>?=null

     class VerseViewHolder(itemView: View):ViewHolder(itemView){
         val content:TextView=itemView.findViewById(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VerseViewHolder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_vrese,parent,false)
        return VerseViewHolder(view)

    }

    override fun getItemCount(): Int {
        return items?.size ?:0 // ?: this means if the list size is null return 0
    }

    override fun onBindViewHolder(holder: VerseViewHolder, position: Int) {
        val content=items?.get(position)
        holder.content.setText(content)
    }
    fun changeData(verses:List<String>){
        this.items=verses
        notifyDataSetChanged() // this make adapter to reload and update it's data
    }

}