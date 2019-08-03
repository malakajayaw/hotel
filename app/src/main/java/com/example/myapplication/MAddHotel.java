package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MAddHotel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madd_hotel);
    }
    public void goToMAddPackage(View view){
        Intent a = new Intent(this,MAddPackage.class);
        startActivity(a);
    }
}
