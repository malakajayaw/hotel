package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.ui.TchangePwd;

public class Tselectinfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tselectinfo);
    }
    public void OClick(View view){
        Intent tchangepwd = new Intent(this, TchangePwd.class);
        startActivity(tchangepwd);
    }
    public void tsavedetail(View view){
        Intent tsaved = new Intent(this,MHome.class) ;
    }
}
