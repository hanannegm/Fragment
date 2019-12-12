package com.example.heba.fragmentexample;


import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SubjectListListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onItemClick(int id) {
       // Toast.makeText(getApplicationContext(), "bue", Toast.LENGTH_SHORT).show();
        View fragment = findViewById(R.id.detailfragment);
        if (fragment != null) {
           // Toast.makeText(getApplicationContext(), "jl", Toast.LENGTH_SHORT).show();
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            SubjectDetailFragment details = new SubjectDetailFragment();
            details.setId(id);
            ft.replace(R.id.detailfragment, details);
            ft.commit();
        }

    }
}
