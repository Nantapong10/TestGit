package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    TextView tvWeight, tvHeight, tvBMI, tvBMICall;

    ImageView imBMIAction;

    String weight, height, bmi, strBmi;

    int underweight, normal, obeseClassI, obeseClassII, obeseClassIII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        tvWeight = findViewById(R.id.id_tv_Weight);
        tvHeight = findViewById(R.id.id_tv_Height);
        tvBMI = findViewById(R.id.id_tv_BMI);
        tvBMICall = findViewById(R.id.id_tv_BMIcall);
        imBMIAction = findViewById(R.id.id_im_BMIaction);

        underweight = ContextCompat.getColor(this, R.color.Underweight);
        normal = ContextCompat.getColor(this, R.color.Normal);
        obeseClassI = ContextCompat.getColor(this, R.color.Obese_Class_I);
        obeseClassII = ContextCompat.getColor(this, R.color.Obese_Class_II);
        obeseClassIII = ContextCompat.getColor(this, R.color.Obese_Class_III);


        Intent i = getIntent();
        weight = i.getStringExtra("WEIGHT");
        height = i.getStringExtra("HEIGHT");
        bmi = i.getStringExtra("BMI");
        double bmiCall = i.getDoubleExtra("BMICALL", 0.0);

        if(bmiCall < 18.5) {
            tvBMI.setTextColor(underweight);
            tvBMICall.setTextColor(underweight);
            strBmi = "Underweight";
            imBMIAction.setImageResource(R.drawable.neutral_2351443);
        }else if(bmiCall >= 18.5 && bmiCall < 23.0){
            tvBMI.setTextColor(normal);
            tvBMICall.setTextColor(normal);
            strBmi = "Normal";
            imBMIAction.setImageResource(R.drawable.happy_2351427);
        }else if(bmiCall >= 23.0 && bmiCall < 25.0){
            tvBMI.setTextColor(obeseClassI);
            tvBMICall.setTextColor(obeseClassI);
            strBmi = "Obese Class I";
            imBMIAction.setImageResource(R.drawable.neutral_2351443);
        }else if(bmiCall >= 25.0 && bmiCall < 30.0){
            tvBMI.setTextColor(obeseClassII);
            tvBMICall.setTextColor(obeseClassII);
            strBmi = "Obese Class II";
            imBMIAction.setImageResource(R.drawable.upset_2351497);
        }else {
            tvBMI.setTextColor(obeseClassIII);
            tvBMICall.setTextColor(obeseClassIII);
            strBmi = "Obese Class III";
            imBMIAction.setImageResource(R.drawable.stunned_2351470);
        }

        tvWeight.setText(weight);
        tvHeight.setText(height);
        tvBMI.setText(bmi);
        tvBMICall.setText(strBmi);

    }

    public void getBMI(View v){

    }
}