package com.example.toggle;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ToggleButton togglebtn;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        togglebtn=(ToggleButton) findViewById(R.id.togglebtn);
        togglebtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this, "Toggle is on", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Toggle is off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        aSwitch=findViewById(R.id.switchbtn);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                {
                    Toast.makeText(MainActivity.this, "switch is on", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "switch is off", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}