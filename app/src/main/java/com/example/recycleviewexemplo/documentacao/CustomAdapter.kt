package com.example.recycleviewexemplo.documentacao

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

class CustomAdapter(private val dataSet: Array<String>): RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    class ViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val textView: TextView

        init{
            textView = view.findViewById(R.id.textView)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}