package com.ltts.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            var un = editTextTextPersonName2.text
            var pwd = editTextTextPersonName.text
            if (TextUtils.isEmpty(un)) {
                Toast.makeText(this, "Please enter username", Toast.LENGTH_LONG).show()
            } else if (TextUtils.isEmpty(pwd)) {
                Toast.makeText(this, "please enter password", Toast.LENGTH_LONG).show()
            } else {
                if (un.toString().equals("khanith") && pwd.toString().equals("1234")) {
                    var i = Intent(this, MainActivity2::class.java)
                    startActivity(i)
                } else {
                    var r = Intent(this, MainActivity::class.java)
                    startActivity(r)
                }
            }
            Log.i("mytag","activity created")

        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("mytag","activity started")
    }

    override fun onResume() {
        super.onResume()

        Log.e("mytag","resumed")
    }







    override fun onPause() {
        super.onPause()

        Log.w("mytag","activity paused")
    }

    override fun onStop() {
        super.onStop()

        Log.i("mytag","activity stoped")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("mytag","activity destroyed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("mytag","activity restarted")
    }
}