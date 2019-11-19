package com.mymail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3,btn4, btn5, btn6, btn7,btn8, btn9, btnadd, btnsub,btnmul, btndiv, btnclear,
btnequal;
    EditText etresult;
    int first, second;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        //binding
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnadd=findViewById(R.id.btnadd);
        btnsub=findViewById(R.id.btnsub);
        btnmul=findViewById(R.id.btnmul);
        btndiv=findViewById(R.id.btndiv);
        btnclear=findViewById(R.id.btnclear);
        etresult=findViewById(R.id.etresult);
        btnequal=findViewById(R.id.btnequal);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText(etresult.getText()+"0");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etresult==null){
                    etresult.setText("");
                }
                else {
                    first=Integer.parseInt(etresult.getText().toString() + "");
                    add=true;
                    etresult.setText(null);
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etresult.getText().toString() + "");
                sub=true;
                etresult.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etresult.getText().toString() + "");
                mul=true;
                etresult.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Integer.parseInt(etresult.getText().toString() + "");
                div=true;
                etresult.setText(null);
            }
        });

        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second=Integer.parseInt(etresult.getText().toString() +"");
                if (add==true){
                    etresult.setText(first+ second +"");
                    add=false;
                }
                if (sub==true){
                    etresult.setText(first - second+"");
                    sub=false;
                }
                if (mul==true){
                    etresult.setText(first*second +"");
                    mul=false;
                }
                if (div ==true){
                    etresult.setText(first/second +"");
                    div=false;
                }
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etresult.setText("");
            }
        });






    }
}
