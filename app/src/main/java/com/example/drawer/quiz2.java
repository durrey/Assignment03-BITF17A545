package com.example.drawer;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class quiz2 extends AppCompatActivity {

    TextView textView;
    Button next,finish;
    RadioGroup rg;
    RadioButton rb1,rb2,rb3,rb4;
    public static int iterator,score;
    TextView timer;

    private static final long START_TIME_IN_MILLIS = 15000;
    private CountDownTimer mCountDownTimer;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }
            @Override
            public void onFinish() {
                nextMCQS();
            }
        }.start();
    }
    private void updateCountDownText() {
        int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
        int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
        String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
        timer.setText(timeLeftFormatted);
    }

    String questions[] = {
            "Intents are of __________ types?",
            "Java is a __________ language",
            "COMPUTER MONITOR IS ALSO KNOWN AS __________?",
            "Online education is ?",
            "How to pass data between activities ?",
            "How to stop services in android___________?",
            "What is fragment in android____________?",
            "What is Interface in android____________?",
            "What is DDMS in Android ?",
            "What is ANR responding time in android____________?"
    };
    String answers[] = {"2","Programming","VDU","Annoying",
            "Intent","stopService()","Peace of activity","Bridge","Dalvik debug monitor services","5 SEC"};
    String opt[] = {
            "2","3","4","5",
            "markup","Programming","both","none",
            "CCTV","DVU","UVD","VDU",
            "wORST","Annoying","best","none",
            "process","Broadcast receiver","Content Provider","Intent",
            "manually","stopService()","finish()","None of these",
            "JSON","Intent","Layout","Peace of activity",
            "Class","Bridge","Layout File","None",
            "Dalvik debug monitor services","Dalvik monitoring services","server","None",
            "1 HOUR","1 MIN","10 SEC","5 SEC"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        timer = findViewById(R.id.timer);
        next=(Button)findViewById(R.id.next);
        finish=(Button)findViewById(R.id.finish);
        textView=(TextView) findViewById(R.id.textView);

        rg=(RadioGroup)findViewById(R.id.rg);
        rb1=(RadioButton)findViewById(R.id.rb1);
        rb2=(RadioButton)findViewById(R.id.rb2);
        rb3=(RadioButton)findViewById(R.id.rb3);
        rb4=(RadioButton)findViewById(R.id.rb4);
        textView.setText(questions[iterator]);
        rb1.setText(opt[0]);
        rb2.setText(opt[1]);
        rb3.setText(opt[2]);
        rb4.setText(opt[3]);

        startTimer();
        score=0;
        iterator=0;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCountDownTimer.cancel();
                mTimeLeftInMillis = START_TIME_IN_MILLIS;
                if(rg.getCheckedRadioButtonId()==-1)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Please select a choice", Toast.LENGTH_LONG);

                    toast.show();
                    return;
                }
                RadioButton selected_ans = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String answer = selected_ans.getText().toString();
                if(answer.equals(answers[iterator])) {
                    score++;
                    Log.i("score",score+"");
                }
                startTimer();
                iterator++;

                if(iterator<questions.length)
                {
                    textView.setText(questions[iterator]);
                    rb1.setText(opt[iterator*4]);
                    rb2.setText(opt[iterator*4 +1]);
                    rb3.setText(opt[iterator*4 +2]);
                    rb4.setText(opt[iterator*4 +3]);
                }
                else
                {
                    dotask();
                }
                rg.clearCheck();
            }
        });

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotask();
            }
        });

    }
    public void  dotask()
    {
        Intent in = new Intent(getApplicationContext(),quiz1.class);
        in.putExtra("score",score+"");
        startActivity(in);
    }

    public void nextMCQS(){
        mCountDownTimer.cancel();
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        iterator++;
        textView.setText(questions[iterator]);
        rb1.setText(opt[iterator*4]);
        rb2.setText(opt[iterator*4 +1]);
        rb3.setText(opt[iterator*4 +2]);
        rb4.setText(opt[iterator*4 +3]);
        rg.clearCheck();
        startTimer();
    }

}