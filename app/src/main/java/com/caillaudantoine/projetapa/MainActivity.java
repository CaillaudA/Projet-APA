package com.caillaudantoine.projetapa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.caillaudantoine.projetapa.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button activityButton = findViewById(R.id.HActivityButton);
        final Button patientButton = findViewById(R.id.HpatientButton);
        final Button decoButton = findViewById(R.id.HdeconnexionButton);

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), ActivityActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        patientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), PatientActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        decoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });


    }
}