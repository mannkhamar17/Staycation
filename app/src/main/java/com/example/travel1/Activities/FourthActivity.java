package com.example.travel1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.travel1.R;

import java.util.Locale;

public class FourthActivity extends AppCompatActivity {
    ImageView backBtn;
    Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        backBtn = findViewById(R.id.backbutton2);
        backBtn.setOnClickListener(view -> finish());

        button = findViewById(R.id.logoutbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(intent);

                Toast.makeText(getApplicationContext(),"LOGOUT SUCCESSFUL",Toast.LENGTH_SHORT).show();


            }
        });



    }




}