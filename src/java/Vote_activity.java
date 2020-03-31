package com.example.codeathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Vote_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote_activity);
    }

    public void voting(View view) {
        Intent in=new Intent(this,Vote_sucess.class);
        startActivity(in);
    }
}
