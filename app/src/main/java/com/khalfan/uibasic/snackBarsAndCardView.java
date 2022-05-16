package com.khalfan.uibasic;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class snackBarsAndCardView extends AppCompatActivity{

    private ConstraintLayout parent ;
    private Button btnShowSnackBar;
    private MaterialCardView cardView;

    @RequiresApi (api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_bars_and_card_view);

        parent = findViewById(R.id.parent);
        btnShowSnackBar = findViewById(R.id.btnShow);
        cardView = findViewById(R.id.cardView);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(snackBarsAndCardView.this, "Card Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        btnShowSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });


    }

    private void showSnackBar(){
        Snackbar.make(parent , "This is a Snackbar" , Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(snackBarsAndCardView.this, "Retry Clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setTextColor(Color.YELLOW)
                .show();
    }
}
