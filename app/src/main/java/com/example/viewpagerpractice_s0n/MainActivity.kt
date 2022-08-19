package com.example.viewpagerpractice_s0n

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpagerpractice_s0n.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //어댑터만들
    lateinit var mViewPagerAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter = MainViewPagerAdapter(supportFragmentManager) //어댑터 객체화
        mainViewPager.adapter = mViewPagerAdapter  //연결


//       +) 페이지가 많아지면 간단하게 부드럽도록 지원하는 기능.
        mainViewPager.offscreenPageLimit=5

    }
}