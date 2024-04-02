package com.example.travel1.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.travel1.Domains.PopularDomain;
import com.example.travel1.R;

public class DetailActivity extends AppCompatActivity {
    private TextView titleTxt,locationTxt,bedTxt,guideTxt,wifiTxt,descriptionTxt,scoreTxt;
    private PopularDomain item;
    private ImageView picImg,backBtn;

    Button b1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        b1 = findViewById(R.id.Booknow);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"BOOKING SUCCESSFUL",Toast.LENGTH_SHORT).show();
            }
        });


        initView();
        setVariable();
    }

    private void setVariable() {
        item = (PopularDomain) getIntent().getSerializableExtra("object");

        titleTxt.setText(item.getTitle());
        scoreTxt.setText(""+(int) item.getScore());
        locationTxt.setText(item.getLocation());
        bedTxt.setText(item.getBed() + "Bed");
        descriptionTxt.setText(item.getDescription());

        if (item.isGuide()) {
            guideTxt.setText("Guide");


        }else {
            guideTxt.setText("No Guide");

        }
        if (item.isWifi()){
            wifiTxt.setText("Wifi");

        }else {
            wifiTxt.setText("No Wifi");

        }
        int drawableResId=getResources().getIdentifier(item.getPic(),"drawable",getPackageName());

        Glide.with(this)
                .load(drawableResId)
                .into(picImg);

        backBtn.setOnClickListener(view -> finish());








    }

    private void initView() {
        titleTxt = findViewById(R.id.titleTxt);
        locationTxt = findViewById(R.id.locationTxt);
        bedTxt = findViewById(R.id.bedTxt);
        guideTxt = findViewById(R.id.guideTxt);
        wifiTxt = findViewById(R.id.wifiTxt);
        descriptionTxt = findViewById(R.id.descriptionTxt);
        scoreTxt = findViewById(R.id.scoreTxt);
        picImg = findViewById(R.id.picImg);
        scoreTxt = findViewById(R.id.scoreTxt);
        backBtn = findViewById(R.id.backBtn);

    }
}