package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void wBMI(View v){
        Intent i;
        i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

    public void cBMI(View v){
        Intent i;
        i = new Intent(this, MainActivity3.class);
        startActivity(i);
    }

    public void fBMI(View v){
        Intent i;
        i = new Intent(this, MainActivity5.class);
        startActivity(i);
    }

    public  void searchMap(View v){
        String strMsgSearch = "https://www.google.co.th/maps/search/ร้านอาหารเพื่อสุขภาพ+ใกล้ฉัน";
        Uri uri = Uri.parse(strMsgSearch);
        Intent i = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(i);
    }

}