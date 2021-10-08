package com.example.recycleviewexemplo.ex01

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R
import com.squareup.picasso.Picasso

class BebidaAdapter(var context: Context?, var lDados: MutableList<CardapioItem>)
    : RecyclerView.Adapter<BebidaViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BebidaViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_bebida_list,parent,false)
        return BebidaViewHolder(view)
    }

    override fun onBindViewHolder(holder: BebidaViewHolder, position: Int) {
        val item = lDados[position]


        holder.nome.text = item.nome
        holder.valor.text = item.valor.toString()
        Picasso.get().load(item.imagem).into(holder.imagem)
    }

    override fun getItemCount(): Int {
        return lDados.size
    }

}
