package com.anubrata.song

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* This is my favourite song.
        */
         */
        //There were only 3 information on google
        val Artist: String = "Artist: Armaan Malik, Amaal Malik"
        val Movie: String = "M.S. Dhoni: The Untold Story"
        val Released: String = "2016"

        print("$Artist")
        print("$Movie")
        print("$Released")

    }
}