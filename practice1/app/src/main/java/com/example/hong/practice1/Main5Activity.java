package com.example.hong.practice1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {

    EditText e1,e2,e3;
    Button b1;
    CheckBox chk;
    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        init();
    }
    void init(){
        e1 = (EditText)findViewById(R.id.editText1);
        e2 = (EditText)findViewById(R.id.editText2);
        e3 = (EditText)findViewById(R.id.editText3);
        b1 =(Button)findViewById(R.id.button);
        chk = (CheckBox)findViewById(R.id.checkBox);
        t1 = (TextView)findViewById(R.id.textView5);
        t2 = (TextView)findViewById(R.id.textView7);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                String spaghetti= e2.getText().toString();
                String salad = e3.getText().toString();

                if(pizza.getBytes().length<=0){
                    pizza ="0";
                    e1.setText("0");
                }if(spaghetti.getBytes().length<=0){
                    spaghetti="0";
                    e2.setText("0");
                }
                if(salad.getBytes().length<=0){
                    salad="0";
                    e3.setText("0");
                }

                int num = Integer.parseInt(pizza)+Integer.parseInt(spaghetti)+Integer.parseInt(salad);
                double result = Integer.parseInt(pizza)*15000 + Integer.parseInt(spaghetti)*13000 + Integer.parseInt(salad)*9000;
                if(chk.isChecked()){
                    result = result * 0.9;
                }
                t1.setText(String.valueOf(num));
                t2.setText((String.valueOf((int)result)));
            }
        });
    }
}
