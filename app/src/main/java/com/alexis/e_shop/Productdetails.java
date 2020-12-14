package com.alexis.e_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Productdetails extends AppCompatActivity {

    private ImageView mImg_back_arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetails);

        mImg_back_arrow = findViewById(R.id.img_back_arrow);
        mImg_back_arrow.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 onBackPressed();
             }
         });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
