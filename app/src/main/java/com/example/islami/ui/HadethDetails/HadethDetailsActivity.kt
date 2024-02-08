package com.example.islami.ui.HadethDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class HadethDetailsActivity: AppCompatActivity() {

    lateinit var recycler:RecyclerView
    lateinit var Title:TextView
    lateinit var name:String
    lateinit var adapter:HadethContentAdapter
     var pos:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hadeth_details)


        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        recycler=findViewById(R.id.contnet_of_hadeth)
        Title=findViewById(R.id.Hadeth_Number)

        adapter=HadethContentAdapter()
        recycler.adapter=adapter

         name= intent.getStringExtra("hadeth_name").toString()
         pos=intent.getIntExtra("hadeth_pos",-1)

         Title.setText(name)

         readFile(pos)


    }
    private fun readFile(Pos:Int){
        val fileName="h${Pos+1}.txt"
        val content= assets.open(fileName).bufferedReader().use { it.readText() }
        val Lines:List<String> = content.split("\n")
        adapter.ChangeData(Lines)

    }
}