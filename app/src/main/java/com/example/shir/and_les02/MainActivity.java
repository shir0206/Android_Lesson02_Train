package com.example.shir.and_les02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView  backGroundImage, upArrow, downArrow, gpsImage, newsImage;
    TextView trainName,currentlyLabel, detailHeader, upText, downText, gpsText, newsText;
    Button bookButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backGroundImage=findViewById(R.id.backgroundImage);
        trainName=findViewById(R.id.trainName);
        currentlyLabel=findViewById(R.id.currentlyLabel);
        bookButton=findViewById(R.id.bookButton);
        detailHeader=findViewById(R.id.detailHeader);
        upArrow=findViewById(R.id.upArrow);
        upText=findViewById(R.id.upText);
        downArrow=findViewById(R.id.downArrow);
        downText=findViewById(R.id.downText);
        gpsImage=findViewById(R.id.gpsImage);
        gpsText=findViewById(R.id.gpsText);
        newsImage=findViewById(R.id.newsImage);
        newsText=findViewById(R.id.newsText);



        upArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                upText.setText("מוקדם יותר \n            16:28");

            }
        });


        downArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                downText.setText("מאוחר יותר \n            17:58");

            }
        });


        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bookButton.setText("זה עווובדדד\n יאי :))");

            }
        });


    }
}
