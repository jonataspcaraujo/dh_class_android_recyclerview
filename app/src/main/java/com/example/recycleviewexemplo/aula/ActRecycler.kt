package com.example.recycleviewexemplo.aula

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

@SuppressLint("WrongConstant")
class ActRecycler : AppCompatActivity() {

    private val recycler by lazy{
        RecyclerView(this)
    }
    private val manager by lazy{
        LinearLayoutManager(this,VERTICAL,false)
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
//        setContentView(R.layout.activity_act_recycler)
        setContentView(recycler)

        recycler.layoutManager = manager
        recycler.adapter = AdapterAlunos(this,alunos)

    }
}