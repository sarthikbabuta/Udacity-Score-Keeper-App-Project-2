package com.example.sarthikbabuta.udacity2project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreteama=0,scoreteamb=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addonea(View view)
    {
        scoreteama=scoreteama+1;
        displayForTeamA(scoreteama);
    }
    public void addoneb(View view)
    {
        scoreteamb=scoreteamb+1;
        displayForTeamB(scoreteamb);
    }
    public void addtwoa(View view)
    {
        scoreteama=scoreteama+2;
        displayForTeamA(scoreteama);
    }
    public void addtwob(View view)
    {
        scoreteamb=scoreteamb+2;
        displayForTeamB(scoreteamb);
    }
    public void addthreea(View view)
    {
        scoreteama=scoreteama+3;
        displayForTeamA(scoreteama);
    }
    public void addthreeb(View view)
    {
        scoreteamb=scoreteamb+3;
        displayForTeamB(scoreteamb);
    }
    /*public void deletea(View view)
    {
        scoreteama=0;
        displayForTeamA(scoreteama);
    }*/
    public void delete(View view)
    {
        scoreteama=0;
        scoreteamb=0;
        displayForTeamA(scoreteama);
        displayForTeamB(scoreteamb);

    }
    public void displayForTeamA(int scorea) {
        TextView scoreViewa = (TextView) findViewById(R.id.team_a_score);
        scoreViewa.setText(" "+scorea);
    }
    public void displayForTeamB(int scoreb) {
        TextView scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreViewb.setText(" "+scoreb);
    }
}