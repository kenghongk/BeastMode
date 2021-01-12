package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;
import pl.droidsonroids.gif.GifTextView;

public class ExerciseDetails extends AppCompatActivity {

    private TextView mName;
    private TextView discription;
    private TextView workout;
    private GifImageView gif;
    private TextView rep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_execise_details);

        mName = (TextView)findViewById(R.id.tv_title);
        discription = (TextView)findViewById(R.id.tv_discription) ;
        workout = (TextView)findViewById(R.id.tv_discription2) ;
        gif = (GifImageView) findViewById(R.id.gif_image);
        rep = (TextView) findViewById(R.id.tv_rep) ;


        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Name");
        String Details = intent.getExtras().getString("Details");
        String Workout = intent.getExtras().getString("Workout");
        Integer Gif = intent.getExtras().getInt("Gif");
        String Rep = intent.getExtras().getString("Rep");

        mName.setText(Title);
        discription.setText(Details);
        workout.setText(Workout);
        gif.setImageResource(Gif);
        rep.setText(Rep);

    }
}