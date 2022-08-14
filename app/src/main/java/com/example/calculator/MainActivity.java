package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mEt;
    private TextView button7, button8, button9, buttonC, tvAns;
    private TextView button4, button5, button6, buttonmul;
    private TextView button1, button2, button3, buttonsub;
    private TextView button0, button10, buttondiv, buttonadd;
    private TextView buttoneql1;
    private String mAnswer = "";
    float value1,value2;
    boolean b_add,b_sub,b_mul,b_div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        buttoneql1 = findViewById(R.id.buttoneql1);
        buttonadd = findViewById(R.id.buttonadd);
        buttonsub = findViewById(R.id.buttonsub);
        buttondiv = findViewById(R.id.buttondiv);
        buttonmul = findViewById(R.id.buttonmul);
        buttonC = findViewById(R.id.buttonC);
        mEt = findViewById(R.id.edt1);
        tvAns = findViewById(R.id.tvAns);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText()+"1");
//                String one = "1";
//                //     mEt.setText(one);
//
//                mEt.append("1");
//                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mEt.setText(mEt.getText() + "7");
//                mAnswer = mEt.getText().toString().trim();
//               //// mEt.setText(mAnswer + " + " + button7.getText().toString());
//                mEt.setText( button7.getText().toString());
//
//                String secNem = button7.getText().toString().trim();
//                String stAns = String.valueOf(total(mAnswer, Integer.parseInt(secNem)));
//                tvAns.setText(stAns);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "9");
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + ".");
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mEt.setText(mEt.getText() + "0");
            }
        });
        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(mEt.getText() + "");
                b_add = true;
                mEt.setText(null);


            }
        });
        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(mEt.getText() + "");
                b_sub = true;
                mEt.setText(null);

            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(mEt.getText() + "");
                b_mul = true;
                mEt.setText(null);

            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1 = Float.parseFloat(mEt.getText() + "");
                b_div = true;
                mEt.setText(null);

            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAns.setText(null);
                mEt.setText( " ");
            }
        });
        
        buttoneql1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                value2=Float.parseFloat(mEt.getText() + "");
                if(b_add==true){
                    tvAns.setText(value1 + value2 + "");
                    mEt.setText(value1 + "+" +value2+" = ");
                    b_add=false;

                }
                if(b_sub==true){
                    tvAns.setText(value1 - value2 + "");
                    mEt.setText(value1 + "-" +value2+" = ");
                    b_sub=false;
                }
                if(b_mul==true){
                    tvAns.setText(value1 * value2 + "");
                    mEt.setText(value1 + "*" +value2+" =");
                    b_mul=false;
                }
                if(b_div==true){
                    tvAns.setText(value1 / value2 + "");
                    mEt.setText(value1 + "/" +value2+" = ");
                    b_div=false;
                }
            }
        });

    }

    private int total(String firstNum, int secondNumber) {


     //   firstNum.replaceAll("+","")

     int fst  =   Integer.parseInt(firstNum);

        return fst + secondNumber;
    }
}