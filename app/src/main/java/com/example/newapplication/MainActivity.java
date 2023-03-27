package com.example.newapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
// new line
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button but = findViewById(R.id.send_button_id);
       EditText text = findViewById(R.id.send_text_id);

        but.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String str = text.getText().toString();
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);
                intent.putExtra("PersonName", str);
                startActivity(intent);
            }
        });
    }}