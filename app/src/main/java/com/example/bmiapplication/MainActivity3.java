package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity3 extends AppCompatActivity {

    EditText etWeight, etHeight;
    double weight, height, bmi;
    Button btCalBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        etWeight = findViewById(R.id.id_et_Weight);
        etHeight = findViewById(R.id.id_et_Height);

        btCalBMI = findViewById(R.id.id_bt_CalBMI);
    }

    public void calBMI(View v){
        String strWeight = etWeight.getText().toString();
        weight = Double.parseDouble(strWeight);
        String strHeight = etHeight.getText().toString();
        height = Double.parseDouble(strHeight);

        bmi = weight / (Math.pow(height/100, 2));

        DecimalFormat bmiDecimal = new DecimalFormat("#.####");

        String strBMI = bmiDecimal.format(bmi);
//        String strBMI = Double.toString(bmi);
//        Toast.makeText(this, strBMI, Toast.LENGTH_SHORT).show();

        Intent i;
        i = new Intent(this, MainActivity4.class);
        i.putExtra("WEIGHT", strWeight);
        i.putExtra("HEIGHT", strHeight);
        i.putExtra("BMI", strBMI);
        i.putExtra("BMICALL", bmi);
        startActivity(i);
    }
}