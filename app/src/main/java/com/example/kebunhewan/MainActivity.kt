package com.example.kebunhewan

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kebunhewan.Adapter.DataAdapter
import com.example.kebunhewan.Models.DataModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

        var data: ArrayList<DataModel>? = null

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //Inisialisasi Array
            data = ArrayList()

            //Simpan data
            data?.add(
                DataModel(R.drawable.singa,"Singa","Singa (bahasa Sanskerta: Siṃha, " +
                    "atau nama ilmiahnya Panthera leo) adalah spesies hewan dari keluarga felidae atau jenis kucing.")
            )

            data?.add(DataModel(R.drawable.jerapa,"Jerapah","Jerapah atau zarafah (nama ilmiah: Giraffa " +
                    "camelopardalis) adalah mamalia berkuku genap endemik Afrika dan merupakan spesies hewan tertinggi yang " +
                    "hidup di darat."))

            data?.add(DataModel(R.drawable.rusa,"Kancil","Pelanduk kancil[3] (Tragulus kanchil), juga dikenal " +
                    "sebagai kancil atau pelanduk, adalah sejenis ungulata berteracak genap bertubuh kecil anggota suku Tragulidae"))

            data?.add(DataModel(R.drawable.harimo,"Harimau","Harimau (Tulisan Jawi: هريماو; Panthera tigris) (juga " +
                    "dipanggil harimau belang atau pak belang) merupakan spesies binatang terbesar di kalangan empat jenis " +
                    "\"kucing besar\" dalam genus Panthera, dan anggota famili Felidae."))

            data?.add(DataModel(R.drawable.koala,"Koala","Koala (Phascolarctos cinereus atau, disalah tafsir sebagai " +
                    "beruang koala[a]) adalah spesies sejenis marsupial yang tergolong maun dalam famili Phascolarctidae"))

            data?.add(DataModel(R.drawable.tapir,"Tapir","Tenuk merupakan sejenis haiwan mamalia. Juga dikenali sebagai" +
                    " Tapir, Senuk, Cipan, Kipan, Badak Tampung, Badak Murai, Badak Tenuk, Badak Babi, dan Kuda Air"))

            //Set data to Adapter
            recyclerView.adapter = DataAdapter(data, object : DataAdapter.OnClickListener {
                override fun detail(item: DataModel?) {
                    val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    intent.putExtra("gambar", item?.gambar)
                    intent.putExtra("nama", item?.nama)
                    intent.putExtra("keterangan", item?.keterangan)
                    startActivity(intent)
                }
            })

        }
    }

