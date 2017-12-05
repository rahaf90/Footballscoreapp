package com.example.toshiba_pc.footballscoreapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    int scoreing;
    int cards;
    int foul;
    int scoring2;
    int cards2;
    int foul2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void addforteam1(View v) {
        scoreing = scoreing + 1;
        displayforteam1(scoreing);

    }

    public void displayforteam1(int score) {
        TextView s1 = (TextView) findViewById(R.id.goal1);
        s1.setText(String.valueOf(score));
    }

    public void addcard1(View v) {

        cards = cards + 1;
        displaycard(cards);
    }

    public void displaycard(int c) {

        TextView card1 = (TextView) findViewById(R.id.red1);
        card1.setText(String.valueOf(c));
    }


    public void addfoul(View v) {
        foul = foul + 1;
        displayfoul(foul);
    }

    public void displayfoul(int f) {

        TextView f1 = (TextView) findViewById(R.id.f1);
        f1.setText(String.valueOf(f));

    }


    public void addforteam2(View v) {
        scoring2 = scoring2 + 1;
        displayforteam2(scoring2);

    }

    public void displayforteam2(int score) {
        TextView s2 = (TextView) findViewById(R.id.goal2);
        s2.setText(String.valueOf(score));
    }

    public void addcard2(View v) {

        cards2 = cards2 + 1;
        displaycard2(cards2);
    }

    public void displaycard2(int c) {

        TextView card2 = (TextView) findViewById(R.id.red2);
        card2.setText(String.valueOf(c));
    }

    public void addfoul2(View v) {
        foul2 = foul2 + 1;
        displayfoul2(foul2);
    }

    public void displayfoul2(int f) {

        TextView f2 = (TextView) findViewById(R.id.f2);
        f2.setText(String.valueOf(f));

    }



    public void reset(View v){

        TextView s1 = (TextView) findViewById(R.id.goal1);
         s1.setText("0");
        TextView card1 = (TextView) findViewById(R.id.red1);
        card1.setText("0");
        TextView f1 = (TextView) findViewById(R.id.f1);
        f1.setText("0");
        TextView s2 = (TextView) findViewById(R.id.goal2);
        s2.setText("0");
        TextView card2 = (TextView) findViewById(R.id.red2);
        card2.setText("0");
        TextView f2 = (TextView) findViewById(R.id.f2);
        f2.setText("0");


    }

}
































