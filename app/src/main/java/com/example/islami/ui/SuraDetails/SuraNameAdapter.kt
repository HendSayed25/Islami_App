package com.example.islami.ui.SuraDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.islami.R

class SuraNameAdapter(val items:List<String>):Adapter<SuraNameAdapter.ViewHolder>(){

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name:TextView=itemView.findViewById(R.id.chapter_name)

    }


    var Name: OnItemClickListner?=null

    interface OnItemClickListner{
        fun OnItemClick(pos:Int,name:String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_chapter_name,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var SuraName=items[position]
        holder.name.setText(SuraName)
        holder.name.setOnClickListener{
            Name?.OnItemClick(position,SuraName)

        }
        
    }

    override fun getItemCount(): Int {
       return items.size
    }

}