package com.example.islami.ui.SuraDetails

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.islami.R

class SuraDetailsActivivty: AppCompatActivity() {

    lateinit var titleTextView:TextView
    lateinit var Sura_name:String
    var Pos:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details_activivty)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        titleTextView=findViewById(R.id.title_text_view)

        Sura_name= intent.getStringExtra("sura_name").toString()
        Pos=intent.getIntExtra("sura_pos",-1)

        titleTextView.setText(Sura_name)


    }



}


