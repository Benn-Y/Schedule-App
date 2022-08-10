package com.example.youtube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ComposeMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose_message);
        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

    }
    public void handleSend(View v){
        v.setEnabled(true);
        Toast.makeText(this, "SENT", Toast.LENGTH_LONG).show();

    }
}