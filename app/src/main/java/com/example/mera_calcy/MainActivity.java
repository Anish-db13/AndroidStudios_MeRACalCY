package com.example.mera_calcy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText res;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,be,bp,bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.etResult);
        b0=findViewById(R.id.btn0);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        b7=findViewById(R.id.btn7);
        b8=findViewById(R.id.btn8);
        b9=findViewById(R.id.btn9);
        ba=findViewById(R.id.btna);
        bs=findViewById(R.id.btns);
        bm=findViewById(R.id.btnm);
        bd=findViewById(R.id.btnd);
        be=findViewById(R.id.btne);
        bp=findViewById(R.id.btnp);
        bc=findViewById(R.id.btnc);

        b0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("0");
            }
        });
        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("1");
            }
        });
        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("2");
            }
        });
        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("3");
            }
        });
        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("4");
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("5");
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("6");
            }
        });
        b7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("7");
            }
        });
        b8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("8");
            }
        });
        b9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("9");
            }
        });
        ba.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("+");
            }
        });
        bs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("-");
            }
        });
        bm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("*");
            }
        });
        bd.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.append("/");
            }
        });
        be.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = res.getText().toString();
                if(data.contains("+")){
                    String op[] = data.split(Pattern.quote("+"));
                    double op1 = Double.parseDouble(op[0]);
                    double op2 = Double.parseDouble(op[1]);
                    double sum = op1+op2;

                    res.setText(""+sum);
                }else if(data.contains("-")){
                    String op[] = data.split(Pattern.quote("-"));
                    double op1 = Double.parseDouble(op[0]);
                    double op2 = Double.parseDouble(op[1]);
                    double diff = op1-op2;

                    res.setText(""+diff);
                }else if(data.contains("*")){
                    String op[] = data.split(Pattern.quote("*"));
                    double op1 = Double.parseDouble(op[0]);
                    double op2 = Double.parseDouble(op[1]);
                    double mul = op1*op2;

                    res.setText(""+mul);
                }
                else if(data.contains("/")){
                    String op[] = data.split(Pattern.quote("/"));
                    double op1 = Double.parseDouble(op[0]);
                    double op2 = Double.parseDouble(op[1]);

                    if(op2==0)
                    {
                        Toast.makeText(MainActivity.this,"Invalid Expression", Toast.LENGTH_LONG).show();
                    }else{
                        double div = op1/op2;
                        res.setText(""+div);
                    }
                }
            }
        });
        bc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
            }
        });
    }
}