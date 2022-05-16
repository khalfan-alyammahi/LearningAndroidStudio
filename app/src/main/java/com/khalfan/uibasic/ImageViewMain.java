package com.khalfan.uibasic;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageViewMain extends AppCompatActivity {
    private ImageView soloLeveling ;
    private boolean isChangeImageVisibilityButtonClicked = false;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.image_view);

        soloLeveling = findViewById(R.id.myImage);
        Button changeVisibilityButton = findViewById(R.id.solo_leveling_button);
        TextView ImageText = findViewById(R.id.ImageTxt);

        changeVisibilityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isChangeImageVisibilityButtonClicked){
                    soloLeveling.setVisibility(View.INVISIBLE);
                    ImageText.setText("Image is INVISIBLE Now");
                    isChangeImageVisibilityButtonClicked = !isChangeImageVisibilityButtonClicked;
                }else{
                    soloLeveling.setVisibility(View.VISIBLE);
                    ImageText.setText("");
                    isChangeImageVisibilityButtonClicked = !isChangeImageVisibilityButtonClicked;
                }
            }
        });


    }
}
