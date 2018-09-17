package com.optimus.acmanagementsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Order_Form_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order__form_);
    }

    public void AddButton(View view) {
        Toast.makeText(this,
                "Order added Successfully", Toast.LENGTH_LONG).show();

    }
    public void ResetButton(View view) {
        Toast.makeText(this,
                "All the fields Resetted", Toast.LENGTH_LONG).show();

    }
}
