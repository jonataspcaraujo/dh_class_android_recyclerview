package com.example.recycleviewexemplo.aula

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.recycleviewexemplo.R

class AlunoEscolhidoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aluno_escolhido)

        val extras: Bundle? = intent.extras

        val nome: TextView = findViewById(R.id.item_nome_aluno_escolhido)

        nome.text = extras?.getString("nome")

    }
}