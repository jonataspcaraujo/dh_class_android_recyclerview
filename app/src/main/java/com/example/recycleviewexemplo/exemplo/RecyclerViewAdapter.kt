package com.example.recycleviewexemplo.exemplo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R
import com.squareup.picasso.Picasso
import de.hdodenhof.circleimageview.CircleImageView


class RecyclerViewAdapter (
    private var lcontatos: List<Contato>,
    private val contatoView: MainActivity
    ): RecyclerView.Adapter<RecyclerViewAdapter.ContatoViewHoder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHoder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)

        return ContatoViewHoder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHoder, position: Int) {


        Picasso.get()
            .load(lcontatos[position].imagemUrlContato)
            .placeholder(R.drawable.ic_launcher_background)
            .into((holder.imagem))

        holder.nome.text = lcontatos[position].nomeContato

    }

    override fun getItemCount(): Int {
        return lcontatos.size
    }


    class ContatoViewHoder(itemView: View) :RecyclerView.ViewHolder(itemView){

        var imagem: CircleImageView = itemView.findViewById(R.id.item_imagem)
        var nome: TextView = itemView.findViewById(R.id.item_nome)

    }


}