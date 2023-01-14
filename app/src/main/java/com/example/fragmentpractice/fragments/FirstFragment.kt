package com.example.fragmentpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice.R
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment(){   // 프래그먼트 상속

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    // 프래그 먼트 동작에 관한 함수 오버라이딩
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        
        changeTextBtn.setOnClickListener { 
            //텍스트뷰 문구 변경
            contnetTxt.text = "안녕하세요"
        }
        toastBtn.setOnClickListener {
            Toast.makeText(context, "첫번째 프래그먼트의 토스트메세지 입니다.", Toast.LENGTH_SHORT).show()
        }
    }

}