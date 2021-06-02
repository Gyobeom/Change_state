package com.example.intentexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_test;
    Button btn_change;
    private String str;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test); //ID값 찾아서 넣어주기


        btn_change=findViewById(R.id.btn_change);
        btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = et_test.getText().toString(); //텍스트 가져와서 스트링 형태로 변환
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                intent.putExtra("str",str);//데이터 보내는 역활
                //앞쪽 str은 받아오는 쪽에서 사용하는 별명 , 뒤쪽이 보내는 데이터 입력,
                startActivity(intent); //액티비티 이동 화면 이동

            }
        });
    }

}