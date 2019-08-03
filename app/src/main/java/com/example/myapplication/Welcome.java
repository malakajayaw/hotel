package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void onClick(View view){
        Intent singup = new Intent(this,TSingup.class);
        startActivity(singup);

    }
    public void oonClick(View view){
        Intent singin = new Intent(this ,MainActivity.class);
        startActivity(singin);
    }
}
