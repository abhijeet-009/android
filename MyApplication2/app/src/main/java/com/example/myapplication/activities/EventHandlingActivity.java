package com.example.myapplication.activities;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.QuickContactBadge;

import com.example.myapplication.R;

public class EventHandlingActivity extends AppCompatActivity {
private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_handling_ui);
        button=(Button) findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
        @Override
            public void onClick(View v){
            openActivity2();

        }
        });
    }
   public void openActivity2(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}