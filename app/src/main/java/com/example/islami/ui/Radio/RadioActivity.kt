package com.example.islami.ui.Radio

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.islami.R

class RadioActivity:AppCompatActivity() {

    lateinit var playbtn: ImageView
    lateinit var mediaPlayer: MediaPlayer
    lateinit var SuraName:TextView
    lateinit var Name:String
    var Pos:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_radio)
        playbtn=findViewById(R.id.play)
        SuraName=findViewById(R.id.channel)

        Name=intent.getStringExtra("sura_name").toString()
        Pos=intent.getIntExtra("sura_pos",-1)

        SuraName.setText(Name)

       if(Pos==1) mediaPlayer=MediaPlayer.create(this,R.raw.sourate_al_baqarah)


        playbtn.setOnClickListener{
            // audio not played
            if(!mediaPlayer.isPlaying){
                mediaPlayer.start()

                // in end we will change button's image
                playbtn.setImageResource(R.drawable.baseline_pause_24)
            }//played
            else{
                mediaPlayer.pause()
                playbtn.setImageResource(R.drawable.baseline_slow_motion_video_24)

            }

        }

    }

}