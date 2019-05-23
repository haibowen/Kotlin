package com.example.kotlindemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,View.OnClickListener{
    var isRegister=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener(this)
        register.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.login->{
                init()
                if(isRegister){
                    var intent=Intent()
                    intent.setClass(this,Main2Activity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"请先注册",Toast.LENGTH_SHORT).show()
                }
            }
            R.id.register-> {
                var intent = Intent()
                intent.setClass(this,MainActivity::class.java)
                startActivity(intent)
                Toast.makeText(this,"已经注册,注册的账号和密码都为 12345",Toast.LENGTH_SHORT).show()
                finish()
            }
        }

    }
    fun init(){
       var account= et_account.text.toString()
        var password=et_password.text.toString()
        if (account.equals("12345")&&password.equals("12345")){
            isRegister=true
        }
    }
}
