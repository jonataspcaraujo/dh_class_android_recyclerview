package com.example.recycleviewexemplo.exemplo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R

class MainActivity : AppCompatActivity() {



    lateinit var recyclerView: RecyclerView
    lateinit var adapter: RecyclerViewAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()


    }

    private fun initContacList():MutableList<Contato> {

        val lcontatos = mutableListOf(
            Contato("Jonatas","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Maria","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
            Contato("João","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Jamilli","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
            Contato("Matheus","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Lara","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
            Contato("Pedro","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-4.jpg"),
            Contato("Mariana","https://icon-library.com/images/avatar-icon-images/avatar-icon-images-6.jpg"),
            Contato("Cesar","url")
        )

        return lcontatos
    }

    @SuppressLint("WrongConstant")
    private fun initComponents() {

        val lcontatos = initContacList()

//        findViewById<RecyclerView>(R.id.recycler_view).apply {
//            layoutManager = LinearLayoutManager(this@MainActivity)
////            layoutManager = GridLayoutManager(this@MainActivity,2,LinearLayout.VERTICAL,false)
//            adapter = RecyclerViewAdapter(lcontatos,this@MainActivity as MainActivity)
//        }
        recyclerView = findViewById(R.id.recycler_view)
        adapter = RecyclerViewAdapter(lcontatos,this)
        recyclerView?.layoutManager = LinearLayoutManager(this)
        recyclerView?.adapter = adapter

    }



}