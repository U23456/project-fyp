package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.eventplanner.ratingstar;



import com.example.eventplanner.R;

public class UI extends AppCompatActivity {
    ImageView hotel,res,cat,loc,payment,rating,admob,qrcode,ins,phone,budget,userlocation,call,hotelenter,resenter,cater;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i);
        hotel=(ImageView)findViewById(R.id.hhotel);
        res=(ImageView)findViewById(R.id.hrest);
        cat=(ImageView) findViewById(R.id.hmcata);
        payment=(ImageView) findViewById(R.id.payat);
        loc=(ImageView) findViewById(R.id.hloc);
        ins=(ImageView) findViewById(R.id.insa);
        qrcode=(ImageView) findViewById(R.id.qrc);
        userlocation=(ImageView) findViewById(R.id.gmaila);
        rating=(ImageView) findViewById(R.id.ratta);
       admob=(ImageView) findViewById(R.id.ada);
        qrcode=(ImageView) findViewById(R.id.qrc);
        budget=(ImageView) findViewById(R.id.hbud);
        call=(ImageView) findViewById(R.id.hcall);
        hotelenter=(ImageView)findViewById(R.id.hl);
        resenter=(ImageView)findViewById(R.id.hr);
        cater=(ImageView)findViewById(R.id.hcat);







        hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(com.UI.this,com.hotellist.class);
                startActivity(i);

            }
        });


       res.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i=new Intent(com.UI.this,com.restrutrant.class);
               startActivity(i);
           }
       });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.tentservice.class);
                startActivity(i);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.Bankallfallahwebsite.class);
                startActivity(i);
            }
        });
        loc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.Location.class);
                startActivity(i);
            }
        });
        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.videov.class);
                startActivity(i);
            }
        });
        qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.qrcode.class);
                startActivity(i);
            }
        });
        userlocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.currentlocation.class);
                startActivity(i);
            }
        });
        admob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.admmb.class);
                startActivity(i);
            }
        });
        budget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.example.eventplanner.Bud.class);
                startActivity(i);
            }
        });
        rating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.recommendation.class);
                startActivity(i);
            }
        });
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.booking.class);
                startActivity(i);
            }
        });
        hotelenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.arraylist.class);
                startActivity(i);
            }
        });
        resenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.Resenter.class);
                startActivity(i);
            }
        });
        cater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(com.UI.this,com.Catenter.class);
                startActivity(i);
            }
        });









    }
}