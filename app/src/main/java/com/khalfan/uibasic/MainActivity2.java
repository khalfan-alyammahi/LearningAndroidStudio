package com.khalfan.uibasic;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox checkBoxHarry,checkBoxMatrix,checkBoxJoker;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_lists);

        checkBoxHarry = findViewById(R.id.check_box_harry);
        checkBoxMatrix = findViewById(R.id.check_box_Matrix);
        checkBoxJoker = findViewById(R.id.check_box_Joker);

        if(checkBoxHarry.isChecked()){
            Toast.makeText(MainActivity2.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2.this, "You Need to watch Harry Potter", Toast.LENGTH_SHORT).show();
        }

        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity2.this, "You have watched Harry Potter", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity2.this, "You Need to watch Harry Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });

        if(checkBoxMatrix.isChecked()){
            Toast.makeText(MainActivity2.this, "You have watched Matrix", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2.this, "You NEED To watch Matrix", Toast.LENGTH_SHORT).show();
        }

        checkBoxMatrix.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity2.this, "You have watched Matrix", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity2.this, "You NEED To watch Matrix", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}
