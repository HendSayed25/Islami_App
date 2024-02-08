package com.example.islami.ui.home.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.islami.R
import com.example.islami.ui.Radio.RadioActivity
import com.example.islami.ui.SuraDetails.SuraDetailsActivivty
import com.example.islami.ui.SuraDetails.SuraNameAdapter


class QuranFragment:Fragment() {
    lateinit var recyclerView:RecyclerView
    lateinit var adapter: SuraNameAdapter
    var ChapterNames= listOf(
        "الفاتحه","البقرة","آل عمران","النساء","المائدة","الأنعام","الأعراف","الأنفال","التوبة","يونس","هود"
        ,"يوسف","الرعد","إبراهيم","الحجر","النحل","الإسراء","الكهف","مريم","طه","الأنبياء","الحج","المؤمنون"
        ,"النّور","الفرقان","الشعراء","النّمل","القصص","العنكبوت","الرّوم","لقمان","السجدة","الأحزاب","سبأ"
        ,"فاطر","يس","الصافات","ص","الزمر","غافر","فصّلت","الشورى","الزخرف","الدّخان","الجاثية","الأحقاف"
        ,"محمد","الفتح","الحجرات","ق","الذاريات","الطور","النجم","القمر","الرحمن","الواقعة","الحديد","المجادلة"
        ,"الحشر","الممتحنة","الصف","الجمعة","المنافقون","التغابن","الطلاق","التحريم","الملك","القلم","الحاقة","المعارج"
        ,"نوح","الجن","المزّمّل","المدّثر","القيامة","الإنسان","المرسلات","النبأ","النازعات","عبس","التكوير","الإنفطار"
        ,"المطفّفين","الإنشقاق","البروج","الطارق","الأعلى","الغاشية","الفجر","البلد","الشمس","الليل","الضحى","الشرح"
        ,"التين","العلق","القدر","البينة","الزلزلة","العاديات","القارعة","التكاثر","العصر",
        "الهمزة","الفيل","قريش","الماعون","الكوثر","الكافرون","النصر","المسد","الإخلاص","الفلق","الناس"
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_quran, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView=view.findViewById(R.id.recycler_view)

        adapter= SuraNameAdapter(ChapterNames)

        adapter.Name=object: SuraNameAdapter.OnItemClickListner{
            override fun OnItemClick(pos: Int, name: String) {
               // Toast.makeText(requireActivity(),name,Toast.LENGTH_SHORT).show()
                val intent= Intent(requireActivity(),SuraDetailsActivivty::class.java)
                intent.putExtra("sura_name",name)
                intent.putExtra("sura_pos",pos)
                startActivity(intent)
            }
        }

        adapter.Play=object:SuraNameAdapter.OnItemClickListner{
            override fun OnItemClick(pos: Int, name: String) {
                val intent= Intent(requireActivity(),RadioActivity::class.java)
                intent.putExtra("sura_name",name)
                intent.putExtra("sura_pos",pos)
                startActivity(intent)
            }
        }

        adapter.Play=object:SuraNameAdapter.OnItemClickListner{
            override fun OnItemClick(pos: Int, name: String) {
                var intent=Intent(requireActivity(), RadioActivity::class.java)
                intent.putExtra("sura_name",name)
                intent.putExtra("sura_pos",pos)
                startActivity(intent)

            }
        }
        recyclerView.adapter=adapter
    }
}