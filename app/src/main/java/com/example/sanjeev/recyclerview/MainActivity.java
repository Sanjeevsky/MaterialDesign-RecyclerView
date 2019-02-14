package com.example.sanjeev.recyclerview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    RecyclerView recyclerView;
    String name[]={
            "User1",
            "User2",
            "User3",
            "User4",
            "User5",
            "User6",
            "User7",
            "User8"


    };
    String desc[]={
            "Discription1",
            "Discription2",
            "Discription3",
            "Discription4",
            "Discription5",
            "Discription6",
            "Discription7",
            "Discription8"


    };
    int images[]={
            R.drawable.logo1,
            R.drawable.logo2,
            R.drawable.logo3,
            R.drawable.logo4,
            R.drawable.logo5,
            R.drawable.logo6,
            R.drawable.logo7,
            R.drawable.logo8

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);
        recyclerView=(RecyclerView) findViewById(R.id.recyclerView_id);
        List<User> sampleusers=new ArrayList<>();
        for(int i=0;i<name.length;i++){
            User user=new User();
            user.userName=name[i];
            user.userdesc=desc[i];
            user.userimage=images[i];
            sampleusers.add(user);
        }
        /*For Linear Output*/
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        /*For Grid Layout*/
        //GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
       // recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new RecyclerAdapter(getApplicationContext(), sampleusers));


    }
}
