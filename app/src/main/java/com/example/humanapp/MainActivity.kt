package com.example.humanapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("太郎", 15, "テニス")

        human1.say()
        human1.think()

        val human2 = Human("花子", 18, "ダンス")

        human2.say()
        human2.think()

    }
}
