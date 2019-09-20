package com.rezn.newapp.home.main

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.rezn.newapp.R
import com.rezn.newapp.home.dogs.DogsActivity
import com.rezn.newapp.home.list.FakeApiActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        if (view.id == R.id.dogs_activity_btn){
            val intent = Intent(this, DogsActivity::class.java)
            startActivity(intent)
        } else if (view.id == R.id.list_activity_btn){
            val intent = Intent(this, FakeApiActivity::class.java)
            startActivity(intent)
        }
    }
}