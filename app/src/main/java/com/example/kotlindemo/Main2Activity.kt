package com.example.kotlindemo

import adapter.MyAdapter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(),View.OnClickListener {
    private lateinit var mAdapter: MyAdapter
    private lateinit var mDatas: MutableList<String>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        bt_show.setOnClickListener(this)
        mDatas= mutableListOf()
        for (i in 1..20){
            mDatas.add(i.toString());
        }
        mAdapter= MyAdapter(this,mDatas)
        //recycler.layoutManager=LinearLayoutManager(this)
        recycler.layoutManager=GridLayoutManager(this,2)
        recycler.adapter=mAdapter




    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.bt_show->{
                Toast.makeText(this,"已经登录成功",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
