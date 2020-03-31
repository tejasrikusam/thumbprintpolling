package com.example.codeathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Details_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_activity);

    }

    public void vote(View view) {
        Intent intent=new Intent(this,Vote_activity.class);
        startActivity(intent);
    }
}
