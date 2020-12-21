package com.example.navigation2.ui.calculator2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.navigation2.R;

public class Calculator2Fragment extends Fragment {

    public View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_calculator2,container,false);
    }

    private TextView Screen;
    private Button clear,del,add,sub,mul,div,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,dot,Ans,power,eql;
    private String input="",Answer;
    private boolean clearResult;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Screen = view.findViewById(R.id.screen);
        clear = view.findViewById(R.id.clear);
        del = view.findViewById(R.id.del);
        add = view.findViewById(R.id.add);
        sub = view.findViewById(R.id.sub);
        div = view.findViewById(R.id.div);
        mul = view.findViewById(R.id.mul);
        dot = view.findViewById(R.id.dot);
        Ans = view.findViewById(R.id.Ans);
        power = view.findViewById(R.id.power);
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
        eql=view.findViewById(R.id.eql);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn0.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=eql.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn1.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn2.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn3.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn4.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn5.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn6.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });  btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn7.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn8.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=btn9.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=div.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=mul.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });  sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=sub.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });  add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=add.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });  dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=dot.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });
        Ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=Ans.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });  power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=power.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=del.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=clear.getText().toString();
                switch (data){
                    case "AC":
                        input="";
                        break;
                    case "Ans":
                        clearResult=false;
                        input+=Answer;
                        break;
                    case "x":
                        clearResult=false;
                        Solve();
                        input+="*";
                        break;
                    case "^":
                        clearResult=false;
                        Solve();
                        input+="^";
                        break;
                    case "=":
                        clearResult=true;
                        Solve();
                        Answer=input;
                        break;
                    case "del":
                        if(input.length()>0){
                            clearResult=false;
                            String newText=input.substring(0,input.length()-1);
                            input=newText;
                        }
                        break;
                    default:
                        if(input==null){
                            input="";
                        }
                        if(data.equals("+") || data.equals("-") || data.equals("/")){
                            clearResult=false;
                            Solve();
                        }
                        else if(clearResult==true){
                            input="";
                            clearResult=false;
                        }
                        input+=data;
                }
                Screen.setText(input); //here
            }
        });

    }




    public void Solve(){
        if(input.split("\\*").length==2){
            String numbers[]=input.split("\\*");
            try{
                double mul=Double.parseDouble(numbers[0])*Double.parseDouble(numbers[1]);
                input=mul+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("/").length==2){
            String numbers[]=input.split("/");
            try{
                double div=Double.parseDouble(numbers[0])/Double.parseDouble(numbers[1]);
                input=div+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\^").length==2){
            String numbers[]=input.split("\\^");
            try{
                double pow=Math.pow(Double.parseDouble(numbers[0]),Double.parseDouble(numbers[1]));
                input=pow+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\+").length==2){
            String numbers[]=input.split("\\+");
            try{
                double sum=Double.parseDouble(numbers[0])+Double.parseDouble(numbers[1]);
                input=sum+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        else if(input.split("\\-").length>1){
            String numbers[]=input.split("\\-");
            if(numbers[0]=="" && numbers.length==2){
                numbers[0]=0+"";
            }
            try{
                double sub=0;
                if(numbers.length==2) {
                    sub = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
                }
                else if(numbers.length==3){
                    sub = -Double.parseDouble(numbers[1]) - Double.parseDouble(numbers[2]);
                }
                input=sub+"";
            }
            catch (Exception e){
                //Display error
            }
        }
        String n[]=input.split("\\.");
        if(n.length>1){
            if(n[1].equals("0")){
                input=n[0];
            }
        }
        Screen.setText(input);
    }


}

