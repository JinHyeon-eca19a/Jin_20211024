package com.Gaon.jin_20211024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.Gaon.jin_20211024.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView( this, R.layout.activity_main)

        binding.loginBtn.setOnClickListener {
//              입력한 이메일 비번을 데이터 바인딩으로 가져오기.
            val inputEmail = binding.emailEdt.text.toString()
            val inputPw = binding.password.text.toString()

            Log.d( tag:"입력이메일", inputEmail)
            Log.d( tag:"입력비번", inputPw)

        }
    }
}