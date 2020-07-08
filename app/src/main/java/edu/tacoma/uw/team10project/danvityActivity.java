package edu.tacoma.uw.team10project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class danvityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danvity);

        //added second commit over here
        TextView newTextlines = findViewById(R.id.second_textview);
        newTextlines.setText("2) This is the commit by rabin001 after\n merging " +
                "danvity's pull request");
    }
}