package com.example.realstate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView ap1Button = (TextView) findViewById(R.id.apt1);
        final TextView ap2Button = (TextView) findViewById(R.id.apt2);
        final TextView ap3Button = (TextView) findViewById(R.id.apt3);
        final TextView ap4Button = (TextView) findViewById(R.id.apt4);
        final TextView ap5Button = (TextView) findViewById(R.id.apt5);
        final TextView ap6Button = (TextView) findViewById(R.id.apt6);
        final TextView ap7Button = (TextView) findViewById(R.id.apt7);
        final TextView ap8Button = (TextView) findViewById(R.id.apt8);
        final TextView ap9Button = (TextView) findViewById(R.id.apt9);
        final TextView ap10Button = (TextView) findViewById(R.id.apt10);

        ap1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt1.class);
                startActivity(registerIntent);
            }
        });

        ap2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt2.class);
                startActivity(registerIntent);
            }
        });

        ap3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt3.class);
                startActivity(registerIntent);
            }
        });

        ap4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt4.class);
                startActivity(registerIntent);
            }
        });

        ap5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt5.class);
                startActivity(registerIntent);
            }
        });

        ap6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt6.class);
                startActivity(registerIntent);
            }
        });

        ap7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt7.class);
                startActivity(registerIntent);
            }
        });

        ap8Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt8.class);
                startActivity(registerIntent);
            }
        });

        ap9Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt9.class);
                startActivity(registerIntent);
            }
        });

        ap10Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(MainActivity.this, Apt10.class);
                startActivity(registerIntent);
            }
        });
    }
}