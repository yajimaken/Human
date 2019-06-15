package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dog=Dog("Jiro",4);
        dog.say();

        var bigdog=BigDog("Taro",6);
        bigdog.say();

        var h1=Human("太郎",20,"読書");
        var h2=Human("二郎",19,"映画鑑賞");

        h1.say();
        h1.think();
        h2.say();
        h2.think();


    }
}
