package com.khalfan.uibasic;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class RecycleView extends AppCompatActivity{

    private RecyclerView contactsRecView;

    @RequiresApi (api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view);

        contactsRecView = findViewById(R.id.contactRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Margot Robbie" ," Marot@gmail.com" , "https://i.pinimg.com/736x/c0/ff/5b/c0ff5be1deb59a06e0d4a4c303e986cf.jpg"));
        contacts.add(new Contact("Cillian Murphy" , "Cillian@gmail.com" , "https://wallpaperaccess.com/full/2656009.jpg"));
        contacts.add(new Contact("Saoirse Ronan" , "Saoirse@gmail.com" , "https://cdn.vox-cdn.com/thumbor/QmYUW4WDPUe5cakWg1doB00HdBk=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/19656977/5986912410_682fed19e2_b.jpg"));
        contacts.add(new Contact("Emma watson" , "Emma@gmail.com" , "https://i0.wp.com/omnitos.com/wp-content/uploads/2020/02/sololeveling107.jpg"));
        contacts.add(new Contact("Cristian Bale" , "Cristial@gmail.com" , "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1574895616l/43824485._SX318_.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
//        contactsRecView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL , false));
        contactsRecView.setLayoutManager(new GridLayoutManager(this  , 2));



    }



}
