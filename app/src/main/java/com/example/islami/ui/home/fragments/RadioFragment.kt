package com.example.islami.ui.home.fragments

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.islami.R

class RadioFragment:Fragment() {

    lateinit var playbtn:ImageView
    lateinit var mediaPlayer:MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_radio, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        playbtn=view.findViewById(R.id.play)

        mediaPlayer=MediaPlayer.create(requireActivity(),R.raw.sourate_al_baqarah)


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