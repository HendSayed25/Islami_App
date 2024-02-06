package com.example.islami.ui.home.fragments

import android.graphics.Matrix
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.islami.R

class TasbehFragment:Fragment() {
    var image_body: ImageView? = null
    var numbers: TextView? = null
    var counter: Int = 0
    var tasbeh: TextView? = null
    var Tasbeh_List = listOf( //size = 5
        "سبحان الله", "الحمد لله",
        "لا اله الا الله", "لا حول ولا قوة الا بالله",
        "الله اكبر"
    )



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_tasbeh, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        image_body = view.findViewById(R.id.sebha_body)
        numbers = view.findViewById(R.id.Number_of_Tasbeh)
        tasbeh = view.findViewById(R.id.Name_of_Tasbeh)


        image_body?.setOnClickListener {
            OnClickImage()

        }

    }


    private fun OnClickImage() {
        //image rotate
        val rotate=AnimationUtils.loadAnimation(view?.context,R.anim.rotate_sebha)
        image_body?.startAnimation(rotate)
        //increase number
        var current_value = numbers?.text.toString().toInt()
        var new_value = current_value + 1
        if (new_value == 33) {
            new_value = 1
            counter += 1
            if (counter == 5) { // if we reach to the end of list so it will begin from the beginning to the list
                counter = 0
            }
        }

        numbers?.setText(new_value.toString())
        tasbeh?.setText(Tasbeh_List[counter])


    }

}