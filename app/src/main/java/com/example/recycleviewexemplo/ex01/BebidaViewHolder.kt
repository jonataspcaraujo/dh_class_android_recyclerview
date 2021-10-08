package com.example.recycleviewexemplo.ex01

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

class BebidaViewHolder(view: View):RecyclerView.ViewHolder(view) {

    var nome: TextView = view.findViewById(R.id.bebida_item_nome)
    var valor: TextView = view.findViewById(R.id.bebida_item_valor)
    var imagem: ImageView = view.findViewById(R.id.bebida_item_imagem)
}