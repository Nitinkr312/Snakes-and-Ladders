package com.example.snakes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainscreen extends AppCompatActivity {
    Button inst;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);
        inst=findViewById(R.id.instruction);
        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(mainscreen.this,instruction.class);
                startActivity(i2);
            }
        });
    }
    public void quit(View v)
    {
        finish();
        System.exit(0);
    }

    public void play(View v)
    {
        Intent i3 = new Intent(mainscreen.this,GameActivity.class);
        startActivity(i3);
    }
}