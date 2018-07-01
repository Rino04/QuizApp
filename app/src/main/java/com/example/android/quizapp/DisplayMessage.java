package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessage extends AppCompatActivity {
    private Button seeAns;
    String message1,message2,message3,message4,message5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        seeAns = (Button) findViewById(R.id.seeAnsw);
        if (getIntent() != null) {
            Intent data = getIntent();
            message1 = data.getStringExtra("ANS1");
            message2 = data.getStringExtra("ANS2");
            message3 = data.getStringExtra("ANS3");
            message4 = data.getStringExtra("ANS4");
            message5 = data.getStringExtra("ANS5");

            TextView msg1 = (TextView) findViewById(R.id.text_View);
            msg1.setText("Ans 1: "+message1);
            TextView msg2 = (TextView) findViewById(R.id.text_View2);
            msg2.setText("Ans 2: "+message2);
            TextView msg3 = (TextView) findViewById(R.id.text_View3);
            msg3.setText("Ans 3: "+message3);
            TextView msg4 = (TextView) findViewById(R.id.text_View4);
            msg4.setText("Ans 4: "+message4);
            TextView msg5 = (TextView) findViewById(R.id.text_View5);
            msg5.setText("Ans 5: "+message5);
        }else{
            Toast.makeText(this, "Invalid responses", Toast.LENGTH_SHORT).show();
        }
        seeAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayAnswers();
            }
        });
    }

    private void displayAnswers(){
        TextView msg1 = (TextView) findViewById(R.id.textView);
        msg1.setText("Correct Ans 1: "+25);
        TextView msg2 = (TextView) findViewById(R.id.textView2);
        msg2.setText("Ans 2: "+36);
        TextView msg3 = (TextView) findViewById(R.id.textView3);
        msg3.setText("Ans 3: "+97);
        TextView msg4 = (TextView) findViewById(R.id.textView4);
        msg4.setText("Ans 4: "+11);
        TextView msg5 = (TextView) findViewById(R.id.textView5);
        msg5.setText(" Ans 5:"+55);
    }
}
