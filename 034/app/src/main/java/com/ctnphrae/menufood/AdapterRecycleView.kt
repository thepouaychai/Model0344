package com.ctnphrae.menufood

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.model.view.*
import java.lang.Exception

class AdapterRecycleView (var dataText:Array<String>
                          , var imgId:Array<String>
                          ,var context: Context) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // return layout model
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.model, parent, false))

    }

    override fun getItemCount(): Int {
        //return size ของข้อมูล
        return dataText.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // set text & set image & event on click
        try {


            holder?.getName.text = dataText.get(position)
            //holder?.getImage.setImageResource(imgId.get(position))
            Glide.with(context).load(imgId.get(position)).into(holder.getImage)

        } catch (er : Exception){
            Toast.makeText(context,"${er.message}",Toast.LENGTH_LONG).show()
        }
    }

}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val getName = view.tv_name
    val getImage = view.imgFood
}