package com.example.recycleviewexemplo.documentacao

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R
import com.example.recycleviewexemplo.aula.AdapterAlunos

@SuppressLint("WrongConstant")
class ExemploLibActivity : AppCompatActivity() {

    private val recycler by lazy{
        RecyclerView(this)
    }
    private val manager by lazy{
        LinearLayoutManager(this, LinearLayout.VERTICAL,false)
    }

    private val alunos = listOf(
        "Rafinha",
        "Henrique",
        "Andréia",
        "Daniel",
        "Pedro",
        "Giulia",
        "Felipe"
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_exemplo_lib)
        setContentView(recycler)

        recycler.layoutManager = manager
        recycler.adapter = AdapterAlunos(this,alunos)


    }
}