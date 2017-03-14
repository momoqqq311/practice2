package com.example.hong.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.sql.Types.NULL;

public class Main6Activity extends AppCompatActivity {

    EditText e1, e2;
    Button b1, b2, b3, b4;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        init();
    }

    void init() {
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();
                boolean check=check(num1,num2);
                if(check == true){
                    int result = Integer.parseInt(num1)+Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는" + result + "입니다", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();
                boolean check=check(num1,num2);
                if(check == true){
                    int result = Integer.parseInt(num1)-Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "빼기 계산 결과는" + result + "입니다", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();
                boolean check=check(num1,num2);
                if(check==true){
                    int result = Integer.parseInt(num1)*Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "곱하기 계산 결과는" + result + "입니다", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = e1.getText().toString();
                String num2 = e2.getText().toString();
                boolean check=check(num1,num2);
                if(check==true){
                    double result = Integer.parseInt(num1)/Integer.parseInt(num2);
                    Toast.makeText(getApplicationContext(), "나누기 계산 결과는" + (int)result + "입니다", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "값을 입력하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }boolean check(String num1, String num2){
        if(num1.getBytes().length<=0||num2.getBytes().length<=0){
            return false;
        }
        return true;
    }
}
