package com.sicoapp.myapplication.activity

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import com.sicoapp.myapplication.R

import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*
        fab.setOnClickListener { view ->
            val intent = Intent(this, MainActivity::class.java)
            }
            startActivity(intent)
        }
*/
    }
}

