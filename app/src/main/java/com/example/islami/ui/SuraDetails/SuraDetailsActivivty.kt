package com.example.islami.ui.SuraDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R

class SuraDetailsActivivty: AppCompatActivity() {

    lateinit var titleTextView:TextView
    lateinit var Sura_name:String
    var Pos:Int=0
    lateinit var recycler:RecyclerView
    lateinit var adapter:VersesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details_activivty)

        // to appear the back button in it
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        titleTextView=findViewById(R.id.title_text_view)

        initRecyclerView()

        Sura_name= intent.getStringExtra("sura_name").toString()
        Pos=intent.getIntExtra("sura_pos",-1)

        titleTextView.setText(Sura_name)
        readSuraFile(Pos)

    }

    private fun initRecyclerView() {
        recycler=findViewById(R.id.contnet_of_sura)
        adapter=VersesAdapter()
        recycler.adapter=adapter
    }

    private fun readSuraFile(pos:Int){
     // get the content of sura from assets
     val fileName="${pos+1}.txt" // this from assest , add 1 beacuse in asset we begin from index 1
     val fileContent=assets.open(fileName).bufferedReader().use { it.readText() } // this take all content as one line
     val verses:List<String> = fileContent.split("\n") //this function will separate content to lines
     // show verses in recycler view
        adapter.changeData(verses)

 }

}


