package com.example.viewpagerpractice_s0n.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerpractice_s0n.fragments.GreetingsFragment
import com.example.viewpagerpractice_s0n.fragments.MyinfoFragment
import com.example.viewpagerpractice_s0n.fragments.NameFragment

//줄 찍 그어져잇는 부분 alt+ enter -> implement... 선택
class MainViewPagerAdapter(fm : FragmentManager)
    :FragmentPagerAdapter(fm) {
    //필수 오버라이딩 함수 2개를 구현
    override fun getCount(): Int {
// 뷰페이저가 총 몇페이지를 표현하고싶은지 숫자로 리턴.

        return 3 //name, info, greeting 총 3장

    }

    override fun getItem(position: Int): Fragment {
// 각각의 position에 맞는 Fragment가 어떤 Fragment인지 명시 해주는 함수.
//        각 상황 별로 프래그먼트를 객체화해서 리턴처리.
        if (position == 0 )
        {
            return NameFragment()
        }
        else if (position ==1)
        {
            return MyinfoFragment()
        }
        else
        {
            return GreetingsFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {


        if (position == 0 )
        {
            return "이름"
        }
        else if (position ==1)
        {
            return "내정보"
        }
        else
        {
            return "인사말"
        }


    }

}