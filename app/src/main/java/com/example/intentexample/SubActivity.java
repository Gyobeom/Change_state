package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub=findViewById(R.id.tv_sub);


        Intent intent = getIntent(); //인텐트를 받아올 때 받아오는 인텐튼 생성
        String str = intent.getStringExtra("str");//보내는 쪽에서 설정한 별명(스트링형태)를 받아옴
        //str 문자열 형태로 str이라는 별명 값을 받음

        tv_sub.setText(str);




    }
}