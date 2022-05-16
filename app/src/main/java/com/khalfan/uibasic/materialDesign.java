package com.khalfan.uibasic;
import androidx.annotation.Nullable;
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

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class materialDesign extends AppCompatActivity{
    private FloatingActionButton fab ;
    @RequiresApi (api = Build.VERSION_CODES.M )
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.material_design);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(materialDesign.this, "Fab Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }


}
