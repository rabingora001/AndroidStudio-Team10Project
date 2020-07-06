package edu.tacoma.uw.team10project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_STRING = "edu.tacoma.uw.teamproject.STRING";
    private final static String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");

        Button loginBtn = findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MyDashboardPage.class);
                EditText userNameTextId = (EditText) findViewById(R.id.userName_txt);
                String userNameText = userNameTextId.getText().toString();
                intent.putExtra(EXTRA_STRING, userNameText);
                startActivity(intent);
            }
        });

    }
}