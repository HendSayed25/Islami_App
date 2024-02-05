package com.example.islami.ui.home.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import com.example.islami.ui.HadethDetails.HadethDetailsActivity
import com.example.islami.ui.HadethDetails.HadethNameAdapter

class HadethFragment:Fragment() {

    lateinit var recycler:RecyclerView
    lateinit var adapter: HadethNameAdapter
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

        adapter= HadethNameAdapter(Hadeth_Name)


        adapter.HadethClick=object: HadethNameAdapter.OnHadethNameClick{
            override fun OnClickItem(pos: Int, name: String) {
             var intent=Intent(requireActivity(),HadethDetailsActivity::class.java)
                intent.putExtra("hadeth_name",name)
                intent.putExtra("hadeth_pos",pos)
                startActivity(intent)

            }
        }

        recycler.adapter=adapter
    }
}