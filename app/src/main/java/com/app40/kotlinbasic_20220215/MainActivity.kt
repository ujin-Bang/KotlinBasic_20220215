package com.app40.kotlinbasic_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        btnLog가 눌리면 어떤 코드를 실행할지 할일을 설정
        btnLog.setOnClickListener {

//            로그를 찍어보는 기능 실행. => btnLog가 클릭 될 때마다 실행.
            Log.d("메인화면","로그 버튼 눌림")
            Log.d("메인화면","추가 로그 찍어보기")
            Log.e("메인화면", "Log.e로 로그찍기_에러임을 알려줄때")

        }

        btnToast.setOnClickListener {

            Toast.makeText(this, "토스트 자동완성", Toast.LENGTH_SHORT).show()

        }

        btnVariable.setOnClickListener {

//            변수에 대한 문법 연습용 코드

//            본인의 이름을 변수에 담아보자. => 담은 내용을 토스트로 띄우자.

            var myName = "조경진"

            val friendName ="이선생"
//            val friendName: String
//            friendName = "이선생"
//            friendName = "김강사"  val에는 새 값으로 교체 불가.

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

            val myBirthYear = 1988

            val myHeight = 180.7


        }

        



    }
}
