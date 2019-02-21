package com.example.franzi.rentrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.example.franzi.rentrapp.Activity.Menue;

public class SurveySuccessfullyCreated extends AppCompatActivity implements View.OnClickListener {

    Button btnMenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_sucessfully_created);

        btnMenue=(Button)findViewById(R.id.btnMenue);
        btnMenue.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Menue.class);
        startActivity(intent);
        this.finish();
    }
}
