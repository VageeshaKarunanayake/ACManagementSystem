package com.optimus.acmanagementsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Order_Main_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__main_);
    }

    public void Add(View view) {
        Intent orderL = new Intent(this,Order_Form_Activity.class);
        startActivity(orderL);

    }


}
