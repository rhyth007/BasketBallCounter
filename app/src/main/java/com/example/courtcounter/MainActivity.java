package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoreTeamA = 0;
    int ScoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreViewb.setText(String.valueOf(score));
    }
   public void plustwo(View view){
       ScoreTeamA=ScoreTeamA+2;
       displayForTeamA(ScoreTeamA);
   }
    public void plusthree(View view){
        ScoreTeamA=ScoreTeamA+3;
        displayForTeamA(ScoreTeamA);
    }
    public void plusone(View view){
        ScoreTeamA=ScoreTeamA+1;
        displayForTeamA(ScoreTeamA);
    }
    public void plustwob(View view){
        ScoreTeamB=ScoreTeamB+2;
        displayForTeamB(ScoreTeamB);
    }
    public void plusthreeb(View view){
        ScoreTeamB=ScoreTeamB+3;
        displayForTeamB(ScoreTeamB);
    }
    public void plusoneb(View view){
        ScoreTeamB=ScoreTeamB+1;
        displayForTeamB(ScoreTeamB);
    }
    public  void reset(View v){
        ScoreTeamA=0;
        ScoreTeamB=0;
        displayForTeamA(ScoreTeamA);
        displayForTeamB(ScoreTeamB);

    }
}