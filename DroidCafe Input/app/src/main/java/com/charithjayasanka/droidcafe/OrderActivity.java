package com.charithjayasanka.droidcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent = getIntent();
        String message;
        if (intent.getStringExtra(MainActivity.EXTRA_MESSAGE) != null) {
            message = "Order: " +
                    intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        } else {
            message = "You have not ordered anything";
        }
        TextView textView = findViewById(R.id.order_textview);
        textView.setText(message);
    }


}
