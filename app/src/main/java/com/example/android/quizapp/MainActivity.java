package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText ans1;
    private EditText ans2;
    private EditText ans3;
    private EditText ans4;
    private EditText ans5;
    public static final String EXTRA_MESSAGE = "com.example.quizapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ans1 = (EditText) findViewById(R.id.plain_text_input);
        ans2 = (EditText) findViewById(R.id.plain_text_input1);
        ans3 = (EditText) findViewById(R.id.plain_text_input2);
        ans4 = (EditText) findViewById(R.id.plain_text_input3);
        ans5 = (EditText) findViewById(R.id.plain_text_input4);

        submit =(Button) findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //do sth after user clicks submit
                submitMethod();
            }
        });
    }

    public void submitMethod()
    {
        Intent intent = new Intent(this, DisplayMessage.class);

        String message = ans1.getText().toString();
        String message1 = ans2.getText().toString();
        String message2 = ans3.getText().toString();
        String message3 = ans4.getText().toString();
        String message4 = ans5.getText().toString();

        intent.putExtra("ANS1", message);
        intent.putExtra("ANS2", message1);
        intent.putExtra("ANS3", message2);
        intent.putExtra("ANS4", message3);
        intent.putExtra("ANS5", message4);
        startActivity(intent);
    }
}
