package com.example.navigation2.ui.calculator;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigation2.R;

public class CalculatorFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator,container,false);
    }

    EditText txt1;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btneq,btnpt,btnc,btnadd,btnsub,btnmul,btndiv;
    float r1;
    float r2;
    int count = 0;
    boolean a,s,d,m;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn0 = view.findViewById(R.id.btn0);
        btn1 = view.findViewById(R.id.btn1);
        btn2 = view.findViewById(R.id.btn2);
        btn3 = view.findViewById(R.id.btn3);
        btn4 = view.findViewById(R.id.btn4);
        btn5 = view.findViewById(R.id.btn5);
        btn6 = view.findViewById(R.id.btn6);
        btn7 = view.findViewById(R.id.btn7);
        btn8 = view.findViewById(R.id.btn8);
        btn9 = view.findViewById(R.id.btn9);
        btnadd = view.findViewById(R.id.btnadd);
        btnsub = view.findViewById(R.id.btnsub);
        btndiv = view.findViewById(R.id.btndiv);
        btnmul = view.findViewById(R.id.btnmul);
        btneq = view.findViewById(R.id.btneq);
        btnc = view.findViewById(R.id.btnc);
        btnpt = view.findViewById(R.id.btnpt);
        txt1 = view.findViewById(R.id.ed1);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + "9");
            }
        });
        btnpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText(txt1.getText() + ".");
                count++;
                if(count>1)
                    txt1.setText("");
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
            }
        });



        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    d=true;
                    txt1.setText(null);
                }
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    m=true;
                    txt1.setText(null);
                }
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    a=true;
                    txt1.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //txt1.setText(txt1.getText()+"/");
                if(txt1==null){
                    txt1.setText("");
                }
                else{
                    r1=Float.parseFloat(txt1.getText()+" ");
                    s=true;
                    txt1.setText(null);
                }
            }
        });


        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r2=Float.parseFloat(txt1.getText()+" ");
                if(a==true)
                {
                    txt1.setText(r1+r2+" ");
                    a=false;
                }
                if(d==true)
                {
                    txt1.setText(r1/r2+" ");
                    d=false;
                }
                if(s==true)
                {
                    txt1.setText(r1-r2+" ");
                    s=false;
                }
                if(m==true)
                {
                    txt1.setText(r1*r2+" ");
                    m=false;
                }
            }
        });

    }
}
