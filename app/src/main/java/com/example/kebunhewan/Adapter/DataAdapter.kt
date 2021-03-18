package com.example.kebunhewan.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kebunhewan.Models.DataModel
import com.example.kebunhewan.R
import kotlinx.android.synthetic.main.activity_detail.view.*
import kotlinx.android.synthetic.main.item_list.view.*


class DataAdapter(val data:List<DataModel>?, val itemClick: OnClickListener) :
    RecyclerView.Adapter<DataAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): DataAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int =data?.size ?:0
    override fun onBindViewHolder(holder: DataAdapter.MyViewHolder, position: Int) {
        val item = data?.get(position)
        holder.setData(item)
    }
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun setData(item: DataModel?){
            itemView.imageview.setImageResource(item?.gambar ?:R.drawable.singa)
            itemView.textViewNamaDetail.text= item?.nama
            itemView.textViewKetDetail.text = item?.keterangan
            itemView.setOnClickListener{
                itemClick.detail(item)
            }
        }
    }
    interface OnClickListener{
        fun detail (item: DataModel?)
    }


}