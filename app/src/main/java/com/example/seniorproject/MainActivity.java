package com.example.seniorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagetwo);
        fragmentManager=getSupportFragmentManager();
    }




    public void mainClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new MainFragment()).commit();

    }

    public void offerClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new OfferFragment()).commit();
    }

    public void timeClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new TimeFragment()).commit();
    }

    public void likeClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new LikeFragment()).commit();
    }

    public void moreClick(View view) {
        fragmentManager.beginTransaction().replace(R.id.place_holder,new MoreFragment()).commit();
    }


}