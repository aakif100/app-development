package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_dot,btn_equal,btn_add,btn_sub,btn_mul,btn_div,btn_clear;
    float num1,num2;
    boolean addition,subtraction,multiplication,division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_0=(Button) findViewById(R.id.button14);
        btn_1=(Button) findViewById(R.id.button9);
        btn_2=(Button) findViewById(R.id.button10);
        btn_3=(Button) findViewById(R.id.button11);
        btn_4=(Button) findViewById(R.id.button5);
        btn_5=(Button) findViewById(R.id.button6);
        btn_6=(Button) findViewById(R.id.button7);
        btn_7=(Button) findViewById(R.id.button);
        btn_8=(Button) findViewById(R.id.button2);
        btn_9=(Button) findViewById(R.id.button3);
        btn_dot=(Button) findViewById(R.id.button13);
        btn_equal=(Button) findViewById(R.id.button15);
        btn_add=(Button) findViewById(R.id.button16);
        btn_sub=(Button) findViewById(R.id.button12);
        btn_mul=(Button) findViewById(R.id.button8);
        btn_div=(Button) findViewById(R.id.button4);
        btn_clear=(Button) findViewById(R.id.button17);
        ed1=(EditText) findViewById(R.id.editTextText);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "4");
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "9");
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + "0");
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText() + ".");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText()+"");
                addition = true;
                ed1.setText(null);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText()+"");
                subtraction = true;
                ed1.setText(null);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText()+"");
                multiplication = true;
                ed1.setText(null);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(ed1.getText()+"");
                division = true;
                ed1.setText(null);
            }
        });



        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(ed1.getText()+"");


                if(addition == true){
                    ed1.setText(num1+num2+"");
                    addition = false;
                }
                if(subtraction == true){
                    ed1.setText(num1-num2+"");
                    subtraction = false;
                }
                if(multiplication == true){
                    ed1.setText(num1*num2+"");
                    addition = false;
                }
                if(division == true){
                    ed1.setText(num1/num2+"");
                    addition = false;
                }

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed1.setText("");
            }
        });




    }
}