package edu.tacoma.uw.team10project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

//import java.awt.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_STRING = "edu.tacoma.uw.teamproject.STRING";
    private final static String TAG = "MainActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "onCreate");
//        Button loginBtn = findViewById(R.id.login_btn);
//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(view.getContext(), MyDashboardPage.class);
//                EditText userNameTextId = (EditText) findViewById(R.id.userName_txt);
//                String userNameText = userNameTextId.getText().toString();
//                intent.putExtra(EXTRA_STRING, userNameText);
//                startActivity(intent);
//            }
//        });
    }

    /** Called when the user taps the Text button */
    public void loginButton(View view) {
        Intent intent = new Intent(this, danvityActivity.class);
        startActivity(intent);
    }
}