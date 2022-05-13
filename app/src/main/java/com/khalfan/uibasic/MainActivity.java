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

public class MainActivity extends AppCompatActivity {
    private static boolean isClickedOnHelloBtn = false;
    private static int index = 1;
    private static int helloAgainIndex = 1;
    private static int helloIndex = 1;

    private CheckBox checkBoxHarry,checkBoxMatrix,checkBoxJoker;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHello = findViewById(R.id.textWelcomeBtn);
        TextView textMessage = findViewById(R.id.txtWelcome);
        // Edit text
        EditText editTextName = findViewById(R.id.edtTxtName);
        // setting a OnClickListener
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextName.getText().toString().length() == 3 || editTextName.getText().toString().length() > 3){
                    // because there is no name with two letters but there is names with three letters like (Tom , Tim )
                    textMessage.setText("you have to enter you're name");
                    return;
                }
                if(index == 1){
                    textMessage.setText("Hello " + editTextName.getText().toString());
                    index = 0 ;
                    return;
                }
                if(isClickedOnHelloBtn){
                    textMessage.setText("Hello world" + helloIndex++);
                    isClickedOnHelloBtn = !isClickedOnHelloBtn;
                }else{
                    textMessage.setText("Hello "+ editTextName.getText().toString() +" Again!" + helloAgainIndex++);
                    isClickedOnHelloBtn = !isClickedOnHelloBtn;

                }
            }
        });
        // reset button
        Button resetBtn = findViewById(R.id.reset_button);
        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    textMessage.setText("Hello world!");
                    index = 1;

            }
        });














    }

    public void onHelloBtnClicked(View view){


    }


}