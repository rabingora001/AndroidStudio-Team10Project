package edu.tacoma.uw.team10project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MyDashboardPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dashboard_page);

        Intent intent = getIntent();
        String userNameReceived = intent.getStringExtra(MainActivity.EXTRA_STRING);

        TextView userNamePlaceHolder = findViewById(R.id.userNameText);
        userNamePlaceHolder.setText(userNameReceived);

    }
}