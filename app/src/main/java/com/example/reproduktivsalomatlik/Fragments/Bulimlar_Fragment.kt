package com.example.reproduktivsalomatlik.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.reproduktivsalomatlik.MainActivity
import com.example.reproduktivsalomatlik.R
import com.example.reproduktivsalomatlik.emptyFragment
import kotlinx.android.synthetic.main.bulimlar_fragment.*


public var fragmentName1 = "fragmentName"
class Bulimlar_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       return inflater.inflate(R.layout.bulimlar_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initActivities()
    }

    private fun initActivities() {
        //
        linearReprSalomatlik?.setOnClickListener {setOnClickListenerForFragments("ReproduktivSalomatlik")}
        //
        linearReprXuquq?.setOnClickListener {setOnClickListenerForFragments("ReproduktivXuquq")}
        //
        linearSoglomNikohUchunMuxim?.setOnClickListener {setOnClickListenerForFragments("SoglomNikohUchunMuxim")}
        //
        linearIstalmaganXomiladorlikningOnaSalomatligi?.setOnClickListener {setOnClickListenerForFragments("IstalmaganXomiladorlikningOnaSalomatligi")}
        //
        linearMaslaxatolibborishjarayoni?.setOnClickListener {setOnClickListenerForFragments("Maslaxatolibborishjarayoni")}
        //
        linearIstalmaganXomiladorlikdanSaqlovchi?.setOnClickListener {setOnClickListenerForFragments("IstalmaganXomiladorlikdanSaqlovchi")}
        //
        linearOIVodamimmuntanqisligivirusi?.setOnClickListener {setOnClickListenerForFragments("OIVodamimmuntanqisligivirusi")}
        //
    }

    private fun setOnClickListenerForFragments(name_Html:String) {
        val intent = Intent(getActivity(), emptyFragment::class.java)
        intent.putExtra(fragmentName1, name_Html)
        getActivity()?.startActivity(intent)
    }

    companion object {
        fun newInstance(): Bulimlar_Fragment {
            return Bulimlar_Fragment()
        }
    }
}