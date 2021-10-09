package com.example.recycleviewexemplo.aula

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

class AdapterAlunos(
    val context: Context,
    val lAlunos: List<String>
):RecyclerView.Adapter<AlunoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlunoViewHolder {
        return AlunoViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout,parent,false)

        )
    }

    override fun onBindViewHolder(holder: AlunoViewHolder, position: Int) {
        val nomeAluno: String = lAlunos[position]
        holder.nome.text = nomeAluno

        // ação em elemento específico
//        holder.nome.setOnClickListener {
//            context.startActivity(
//                Intent(context, AlunoEscolhidoActivity::class.java)
//                    .putExtra("nome", nomeAluno)
//            )
//            Toast.makeText(context,"Elemento ${position}",Toast.LENGTH_LONG).show()
//        }

        // ação no elemento card
        holder.card.setOnClickListener {
            (context as IOnClick).onClickElement(position)
            context.startActivity(
                Intent(context,AlunoEscolhidoActivity::class.java)
                    .putExtra("nome",nomeAluno)
            )
        }


    }

    override fun getItemCount(): Int {
        return lAlunos.size
    }
}