package com.example.jsultanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent getResultIntent = getIntent();
        String name = getResultIntent.getStringExtra("name");

        resultTextView = findViewById(R.id.textView);
        resultTextView.setText("Hai " + name +"! Ternyata kamu memang Sultan! Share di IG Story dengan #SultanApp dan ajak teman-Mu yang memang Sultan beneran!");
    }
}