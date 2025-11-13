package com.example.q2;

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
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button badd,bsub,bmul,bdiv,beql,bclr,bdot;
    EditText res;
    Float v1,v2;
    Boolean add=false,sub=false,mul=false,div=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // number buttons
        b0=findViewById(R.id.btn_zero);
        b1=findViewById(R.id.btn_one);
        b2=findViewById(R.id.btn_two);
        b3=findViewById(R.id.btn_three);
        b4=findViewById(R.id.btn_four);
        b5=findViewById(R.id.btn_five);
        b6=findViewById(R.id.btn_six);
        b7=findViewById(R.id.btn_seven);
        b8=findViewById(R.id.btn_eight);
        b9=findViewById(R.id.btn_nine);

        // operators
        badd=findViewById(R.id.btn_add);
        bsub=findViewById(R.id.btn_subtract);
        bmul=findViewById(R.id.btn_mul);
        bdiv=findViewById(R.id.btn_div);
        beql=findViewById(R.id.btn_eql);
        bclr=findViewById(R.id.btn_clear);
        bdot=findViewById(R.id.btn_dot);

        res=findViewById(R.id.Result);

        // number clicks
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+"9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(res.getText().toString()+".");
            }
        });

        // operator clicks
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(res.getText().toString());
                add=true;
                res.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(res.getText().toString());
                sub=true;
                res.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(res.getText().toString());
                mul=true;
                res.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Float.parseFloat(res.getText().toString());
                div=true;
                res.setText(null);
            }
        });

        // equals
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Float.parseFloat(res.getText().toString());
                if(add){
                    res.setText(v1+v2+"");
                    add=false;
                }
                if(sub){
                    res.setText(v1-v2+"");
                    sub=false;
                }
                if(mul){
                    res.setText(v1*v2+"");
                    mul=false;
                }
                if(div){
                    if(v2!=0){
                        res.setText(v1/v2+"");
                    } else {
                        res.setText("Error");
                    }
                    div=false;
                }
            }
        });

        // clear
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                v1=null;
                v2=null;
                add=sub=mul=div=false;
            }
        });
    }
}
