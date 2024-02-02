package com.example.islami.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.ui.home.fragments.HadethFragment
import com.example.islami.ui.home.fragments.QuranFragment
import com.example.islami.ui.home.fragments.RadioFragment
import com.example.islami.ui.home.fragments.TasbehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity:AppCompatActivity() {

    lateinit var bottomNavigaton:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottomNavigaton=findViewById(R.id.bottom_navigation_bar)

        bottomNavigaton.setOnItemSelectedListener {
            if(it.itemId==R.id.navigation_hadeth){
              pushFragment(HadethFragment())
            }
            else if(it.itemId==R.id.navigation_quran){
                pushFragment(QuranFragment())
            }
            else if(it.itemId==R.id.navigation_radio){
                pushFragment(RadioFragment())
            }
            else if(it.itemId==R.id.navigation_sebha){
                pushFragment(TasbehFragment())
            }
            return@setOnItemSelectedListener true // to pointer to this item is selected and do the action
        }

        bottomNavigaton.selectedItemId=R.id.navigation_quran //should be here because he should check first then put it as default
    }


    private fun pushFragment(fragment: Fragment)
    {
         supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
    }
}