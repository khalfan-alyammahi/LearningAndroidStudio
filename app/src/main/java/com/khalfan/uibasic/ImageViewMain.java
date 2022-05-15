package com.khalfan.uibasic;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class ImageViewMain extends AppCompatActivity {
    private ImageView soloLeveling ;
    private boolean isClicked = false;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view);

        soloLeveling = findViewById(R.id.myImage);
        Button changeVisibilityButton = findViewById(R.id.solo_leveling_button);

        changeVisibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isClicked){
                    soloLeveling.setVisibility(View.INVISIBLE);
                    isClicked = !isClicked;
                }else{
                    soloLeveling.setVisibility(View.VISIBLE);
                    isClicked = !isClicked;
                }
            }
        });


    }
}
