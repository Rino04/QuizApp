package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message2= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message3= intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.text_View);
        textView.setText(message);
        findViewById(R.id.text_View2);
        textView.setText(message1);
         findViewById(R.id.text_View3);
        textView.setText(message2);
        findViewById(R.id.text_View4);
        textView.setText(message3);
        findViewById(R.id.text_View5);
        textView.setText(message4);
    }
    public void submit(View view) {

            }

}
