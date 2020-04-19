package com.example.reproduktivsalomatlik.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.reproduktivsalomatlik.R

class News_Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.news_fragment, container, false)
    }

    companion object {
        fun newInstance(): News_Fragment {
            return News_Fragment()
        }
    }
}