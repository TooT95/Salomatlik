package com.example.reproduktivsalomatlik

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.reproduktivsalomatlik.Fragments.Bulimlar_Fragment
import com.example.reproduktivsalomatlik.Fragments.Info_Fragment
import com.example.reproduktivsalomatlik.Fragments.News_Fragment
import kotlinx.android.synthetic.main.main_menu.*
import kotlinx.android.synthetic.main.bulimlar_fragment.*


class Main_Menu: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
        supportFragmentManager
        val fragment =
            News_Fragment()
        supportFragmentManager.beginTransaction().replace(R.id.MainLinearLayout, fragment, fragment.javaClass.getSimpleName())
            .commit()
        initFunctions()
    }

    private fun initFunctions() {
        MainLinearLayout.removeAllViewsInLayout()
        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_Info -> {
                    val fragment =
                        Info_Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.MainLinearLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_Bolimlar -> {
                    val fragment =
                        Bulimlar_Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.MainLinearLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.action_News -> {
                    val fragment =
                        News_Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.MainLinearLayout, fragment, fragment.javaClass.getSimpleName())
                        .commit()
                    return@setOnNavigationItemSelectedListener true
                }
            }
            false
        }
    }

    fun OnClickFragment(view: View) {
        val intent = Intent(this,emptyFragment::class.java)
        startActivity(intent)
    }

}