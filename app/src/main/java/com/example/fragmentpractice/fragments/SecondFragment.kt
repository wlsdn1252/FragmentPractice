package com.example.fragmentpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.fragmentpractice.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     return inflater.inflate(R.layout.fragment_second,container,false)
    }

    // 프래그 먼트 동작에 관한 함수 오버라이딩
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        secondFragmentBtn.setOnClickListener {
            Toast.makeText(context, "두번째 프래그먼트 토스트메세지", Toast.LENGTH_SHORT).show()

        }

    }

}