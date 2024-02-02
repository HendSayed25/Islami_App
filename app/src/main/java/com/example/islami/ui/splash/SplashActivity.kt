package com.example.islami.ui.splash
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.islami.R
import com.example.islami.ui.home.HomeActivity

class splashActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // First parameter is the action i need , second is the time which splash screen take to enter to the second screen
        Handler(Looper.getMainLooper()).postDelayed({StartHomeActivity()},2000)
    }

    private fun StartHomeActivity()
    {
        var intent= Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish() // this function to end splash screen not return to it again
    }
}