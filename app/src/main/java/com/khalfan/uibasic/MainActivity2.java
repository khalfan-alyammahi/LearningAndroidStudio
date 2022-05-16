package com.khalfan.uibasic;
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
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private CheckBox checkBoxHarry,checkBoxMatrix,checkBoxJoker;
    private RadioGroup rgMaritalStatus;
    private ProgressBar progressBar;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_lists);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i<10 ; i++){
                    progressBar.incrementProgressBy(10);
                    // stops the code for 500ms (0.5 second ) then run it again it's like threading
                    // but this method only works in android studio it does not run in normal java file
                    SystemClock.sleep(500);
                }
            }
        });

        thread.start();


        // CheckBox variables
        checkBoxHarry = findViewById(R.id.check_box_harry);
        checkBoxMatrix = findViewById(R.id.check_box_Matrix);
        checkBoxJoker = findViewById(R.id.check_box_Joker);

        // RadioGroup Button Variables
        rgMaritalStatus = findViewById(R.id.rgMaritalState);

        // ProgressBar Variables
        progressBar = findViewById(R.id.progressBar);

        // checking whether Harry Potter checkBox is Checked or not
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

        // checking whether The Matrix checkBox is Checked or not
        if(checkBoxMatrix.isChecked()){
            Toast.makeText(MainActivity2.this, "You have watched The Matrix", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2.this, "You NEED To watch The Matrix", Toast.LENGTH_SHORT).show();
        }

        checkBoxMatrix.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity2.this, "You have watched The Matrix", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity2.this, "You NEED To watch The Matrix", Toast.LENGTH_SHORT).show();
                }

            }
        });

        // checking whether The Joker checkBox is Checked or not
        if(checkBoxJoker.isChecked()){
            Toast.makeText(MainActivity2.this, "You have watched The Joker", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(MainActivity2.this, "You NEED to watched The Joker", Toast.LENGTH_SHORT).show();
        }

        checkBoxJoker.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity2.this, "You have watched The Joker", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity2.this, "You NEED to watched The Joker", Toast.LENGTH_SHORT).show();
                }
            }
        });
        // ------------------------------------------------------------------------ RadioGroup Buttons ------------------------------------------------------------------------ //


        int checkedButton = rgMaritalStatus.getCheckedRadioButtonId();

        // check whether one of them is already checked
        switch (checkedButton){
            case R.id.rbMarried:
                Toast.makeText(MainActivity2.this, "Married", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSingle:
                Toast.makeText(MainActivity2.this, "Single", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbInRel:
                Toast.makeText(MainActivity2.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

        rgMaritalStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rbMarried:
                        Toast.makeText(MainActivity2.this, "Marries", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbSingle:
                        Toast.makeText(MainActivity2.this, "Single", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbInRel:
                        Toast.makeText(MainActivity2.this, "In a Relationship", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        // ------------------------------------------------------------------------ ProgressBar ------------------------------------------------------------------------ //





    }

}
