package com.example.designcomponentsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.TextViewCompat.setTextAppearance
import androidx.databinding.DataBindingUtil
import com.example.designcomponentsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setStyle()
    }

    fun setStyle() {

        binding.textView.apply {
            setTextAppearance(binding.textView,R.style.Widget_Theme_DesignComponentsDemo_MyView)
//            ContextThemeWrapper(context, R.style.Widget_Theme_DesignComponentsDemo_MyView)
        }
        binding.textView2.apply {
            setTextAppearance(binding.textView2,R.style.Widget_Theme_DesignComponentsDemo_MyView2)
//            ContextThemeWrapper(context, R.style.Widget_Theme_DesignComponentsDemo_MyView2)
        }


    }
}