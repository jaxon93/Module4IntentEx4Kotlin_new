package com.example.module4intentex4kotlin_new

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.module4intentex4kotlin_new.modul.Member
import com.example.module4intentex4kotlin_new.modul.User

class MainActivity : AppCompatActivity() {
    lateinit var tv_main: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    var secondLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if(result.resultCode == Activity.RESULT_OK){
            var data: Intent? = result.data
            var member: Member? = data!!.getSerializableExtra("member") as Member?
            tv_main.text = member.toString()
        }
    }

    private fun initView() {
        tv_main = findViewById<TextView>(R.id.tv_main)
        var b_open_second = findViewById<Button>(R.id.b_open_second)
        var user = User(20, "Jakhongir")

        b_open_second.setOnClickListener() {
            openSecondActivity(user)
        }
    }

    private fun openSecondActivity(user: User) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)
        secondLauncher.launch(intent)
    }
}