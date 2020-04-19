package com.example.reproduktivsalomatlik

import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.example.reproduktivsalomatlik.Fragments.fragmentName1
import kotlinx.android.synthetic.main.emty_layout_for_fragments.*


class emptyFragment : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.emty_layout_for_fragments)
        val sender= this.getIntent().getExtras()?.getString(fragmentName1);

        if(sender != null)
        {
            webViewFragment.loadUrl("file:///android_asset/${sender}.html")
        }

    }

    override fun onResume() {
        super.onResume()

    }
}