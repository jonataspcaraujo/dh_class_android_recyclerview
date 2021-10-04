package com.example.recycleviewexemplo.aula

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

class AdapterAlunos(
    val context: Context,
    val lAlunos: List<String>
):RecyclerView.Adapter<AlunoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        return AlunoViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.item_layout,parent,false)

        )
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val nomeAluno: String = lAlunos[position]
        holder.nome.text = nomeAluno
    }

    override fun getItemCount(): Int {
        return lAlunos.size
    }
}