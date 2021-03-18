package com.example.kebunhewan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        imageViewDetail.setImageResource(intent.getIntExtra("gambar", R.drawable.singa))
        textViewNamaDetail.text= intent.getStringExtra("nama")
        textViewKetDetail.text= intent.getStringExtra("keterangan")
    }
}