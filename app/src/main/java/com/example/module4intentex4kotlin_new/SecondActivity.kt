package com.example.module4intentex4kotlin_new

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.module4intentex4kotlin_new.modul.Member
import com.example.module4intentex4kotlin_new.modul.User

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initView()
    }

    private fun initView() {
        var tv_second = findViewById<TextView>(R.id.tv_second)
        var b_exit_second = findViewById<Button>(R.id.b_exit_second)
        var user = intent.getSerializableExtra("user")
        tv_second.text = user.toString()

        var member = Member(21, "Mirabbos")

        b_exit_second.setOnClickListener() {
            backToFinish(member)
        }
    }

    private fun backToFinish(member: Member) {
        var returnIntent = Intent()
        returnIntent.putExtra("member", member)
        setResult(RESULT_OK, returnIntent)
        finish()
    }
}