package com.example.bilgiscroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val items = listOf(

            ItemModel(R.drawable.images_bir, "Resim 1"),
            ItemModel(R.drawable.images_iki, "Resim 2"),
            ItemModel(R.drawable.images_uc, "Resim 3"),
            ItemModel(R.drawable.images_dort, "Resim 4"),
            ItemModel(R.drawable.images_bes, "Resim 5"),
            ItemModel(R.drawable.images_alti, "Resim 6")
        )

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager

        val adapter = ItemAdapter(items)
        recyclerView.adapter = adapter
    }
}
