package com.example.recycleviewexemplo.ex01

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleviewexemplo.R


class Fragment03(var lDados:MutableList<CardapioItem>) : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager

    @SuppressLint("WrongConstant")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_03, container, false)

        recyclerView = view.findViewById(R.id.recycler_frag_03)

        layoutManager = LinearLayoutManager(view.context, LinearLayout.VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = BebidaAdapter(view.context,lDados)

        return view
    }
}