package com.optimus.acmanagementsystem;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ebanx.swipebtn.OnActiveListener;
import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;


public class Main_Page_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__page_);

        SwipeButton orderButton = (SwipeButton) findViewById(R.id.order_btn);

        orderButton.setOnActiveListener(new OnActiveListener() {
            @Override
            public void onActive() {
                OrderButton();
            }
        });
    }

    public void OrderButton() {
        Intent OL = new Intent(this,Order_Main_Activity.class);
        startActivity(OL);

    }

    public void InventoryButton() {
        Intent IL = new Intent(this,Order_Main_Activity.class);
        startActivity(IL);

    }

    public void CustomerButton() {
        Intent CL = new Intent(this,Order_Main_Activity.class);
        startActivity(CL);

    }

    public void EmployeeButton() {
        Intent CL = new Intent(this,Order_Main_Activity.class);
        startActivity(CL);

    }
}
