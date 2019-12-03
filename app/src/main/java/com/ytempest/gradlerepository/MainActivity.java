package com.ytempest.gradlerepository;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhoneBean phone = PhoneCreator.createPhone();

        TextView nameTv = findViewById(R.id.tv_name);
        nameTv.setText(phone.getName());

        TextView descTv = findViewById(R.id.tv_desc);
        descTv.setText(phone.getDescription());

    }
}
