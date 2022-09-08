package com.example.virtualjoystick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JoystickView joystick = (JoystickView) findViewById(R.id.joystickView);
        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {

System.out.println(String.valueOf(angle));
               if(angle >= 0 && angle <= 90){
                   Toast.makeText(getApplicationContext(), "0 to 90", Toast.LENGTH_SHORT).show();
               }
               else if(angle >= 90 && angle <= 180){
                   Toast.makeText(getApplicationContext(), "90 to 180", Toast.LENGTH_SHORT).show();
               }
               else if(angle >= 180 && angle <= 270){
                   Toast.makeText(getApplicationContext(), "180 to 270", Toast.LENGTH_SHORT).show();
               }
               else if(angle >= 270 && angle <= 360){
                   Toast.makeText(getApplicationContext(), "270 to 360", Toast.LENGTH_SHORT).show();
               }
            }
        });
    }
}