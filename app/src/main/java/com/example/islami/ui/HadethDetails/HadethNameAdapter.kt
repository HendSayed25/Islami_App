package com.example.islami.ui.HadethDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class HadethNameAdapter(val items:List<String>):RecyclerView.Adapter<HadethNameAdapter.HadethViewHolder>() {


    class HadethViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val hadethName:TextView=itemView.findViewById(R.id.hadeth_name)
    }

    var HadethClick: OnHadethNameClick?=null

    interface OnHadethNameClick{
        fun OnClickItem(pos:Int,name:String)

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadethViewHolder {
        var view:View=LayoutInflater.from(parent.context).inflate(R.layout.hadeth_item,parent,false)
        return HadethViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: HadethViewHolder, position: Int) {
        val name=items[position]
        holder.hadethName.setText(name)
        holder.itemView.setOnClickListener{
            HadethClick?.OnClickItem(position,name)
        }

    }


}