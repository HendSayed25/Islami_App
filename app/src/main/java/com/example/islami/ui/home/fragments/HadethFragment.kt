package com.example.islami.ui.home.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.islami.R
import com.example.islami.ui.home.fragments.Adapter.HadethNameAdapter

class HadethFragment:Fragment() {

    lateinit var recycler:RecyclerView
    lateinit var adapter:HadethNameAdapter
    var Hadeth_Name= listOf(
        "الحديث الاول","الحديث التانى","الحديث التالت","الحديث الرابع","الحديث الخامس","الحديث السادس","الحديث السابع","الحديث الثامن","الحديث التاسع",
        "الحديث العاشر","الحديث الجادى عشر","الحديث الثانى عشر","الحديث الثالث عشر","الحدبث الرابع عشر","الحديث الخامس عشر"

    )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hadeth, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)
        recycler=view.findViewById(R.id.recycler_hadeth)

        adapter=HadethNameAdapter(Hadeth_Name)
        recycler.adapter=adapter
    }
}