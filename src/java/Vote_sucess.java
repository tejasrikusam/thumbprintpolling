package com.example.codeathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Vote_sucess extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_sucess);
        tv=findViewById(R.id.votesucess);
        tv.setText("Successfully voted");


    }
}
