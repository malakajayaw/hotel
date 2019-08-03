package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAddPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madd_package);
    }
    public void goToMAddHotel(View view){
        Intent a = new Intent(this,MAddHotel.class);
        startActivity(a);
    }
    public void goToMAddPackage(View view){
        Intent a = new Intent(this,MAddPackage.class);
        startActivity(a);
    }
}
