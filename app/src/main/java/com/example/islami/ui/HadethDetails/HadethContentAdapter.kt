package com.example.islami.ui.HadethDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R


class HadethContentAdapter : RecyclerView.Adapter<HadethContentAdapter.HadethViewHolder>() {

    var items:List<String>?=null
    class HadethViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
       val contnet=itemView .findViewById<TextView>(R.id.hadeth_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadethViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.hadeth_item,parent,false)
        return HadethViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items?.size ?:0
    }

    override fun onBindViewHolder(holder: HadethViewHolder, position: Int) {
        val content=items?.get(position)
        holder.contnet.setText(content)
    }
    fun ChangeData(Lists:List<String>){
        this.items=Lists
        notifyDataSetChanged()
    }


}