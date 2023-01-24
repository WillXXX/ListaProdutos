package com.example.listaprodutos

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView_produtos = findViewById<RecyclerView>(R.id.rv_produtos)
        recyclerView_produtos.layoutManager =   LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView_produtos.setHasFixedSize(true)
    }
}