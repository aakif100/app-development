package com.example.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_add,btn_sub,btn_mul,btn_div,btn_clear,btn_dot,btn_equal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btn_0=(Button)findViewById(R.id.button14);
        btn_1=(Button)findViewById(R.id.button9);
        btn_2=(Button)findViewById(R.id.button10);
        btn_3=(Button)findViewById(R.id.button11);
        btn_4=(Button)findViewById(R.id.button5);
        btn_5=(Button)findViewById(R.id.button6);
        btn_6=(Button)findViewById(R.id.button7);
        btn_7=(Button)findViewById(R.id.button14);
        btn_8=(Button)findViewById(R.id.button14);
        btn_9=(Button)findViewById(R.id.button14);
        btn_add=(Button)findViewById(R.id.button14);
        btn_sub=(Button)findViewById(R.id.button14);
        btn_mul=(Button)findViewById(R.id.button14);
        btn_div=(Button)findViewById(R.id.button14);
        btn_clear=(Button)findViewById(R.id.button14);
        btn_equal=(Button)findViewById(R.id.button14);
        btn_dot=(Button)findViewById(R.id.button14);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}