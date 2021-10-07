package com.example.recycleviewexemplo.ex01

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.VERTICAL
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R


class Fragment01 : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager

    private lateinit var lDados: MutableList<CardapioItem>

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_01, container, false)

        recyclerView = view.findViewById(R.id.recycler_frag_01)

        layoutManager = LinearLayoutManager(view.context,VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = CardapioAdapter(view.context,initList())

        return view
    }

    private fun initList():MutableList<CardapioItem>{

        val itemList = mutableListOf<CardapioItem>()

        for (index in 0..10) {
            val item: CardapioItem
            item = CardapioItem("Item $index",
                index.toFloat(),
                "https://image.gplustogo.com.br/produto/347/t8446.jpg?v=1",
                "Lorem Ipsum é simplesmente uma simulação de texto da indústria tipográfica e de impressos, e vem sendo utilizado desde o século XVI")
            itemList.add(item)
        }

        return itemList

    }


}