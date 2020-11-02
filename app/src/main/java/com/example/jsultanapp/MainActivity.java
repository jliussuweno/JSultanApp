package com.example.jsultanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;
    Button buttonResult;
    Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameEditText = findViewById(R.id.editTextTextPersonName);
        buttonResult = findViewById(R.id.button);

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString().trim();

                if (name.isEmpty()){
                    if (toast != null){
                        toast.cancel();
                    }
                    toast = Toast.makeText(MainActivity.this, "Sultan, isi nama dulu ya!", Toast.LENGTH_SHORT);
                    toast.show();
                }

                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}