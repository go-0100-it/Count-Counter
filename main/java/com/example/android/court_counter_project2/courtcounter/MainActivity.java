package com.example.android.court_counter_project2.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plusThree = (Button) findViewById(R.id.plus_three_btn);
        plusThree.setOnClickListener(this);
        Button plusTwo = (Button) findViewById(R.id.plus_two_btn);
        plusTwo.setOnClickListener(this);
        Button plusOne = (Button) findViewById(R.id.free_throw_btn);
        plusOne.setOnClickListener(this);
        Button plusThreeB = (Button) findViewById(R.id.plus_three_b_btn);
        plusThreeB.setOnClickListener(this);
        Button plusTwoB = (Button) findViewById(R.id.plus_two_b_btn);
        plusTwoB.setOnClickListener(this);
        Button plusOneB = (Button) findViewById(R.id.free_throw_b_btn);
        plusOneB.setOnClickListener(this);
        Button reset = (Button) findViewById(R.id.reset_btn);
        reset.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.plus_three_btn:
                addScore(3,"A");
                displayScore("A");
                break;
            case R.id.plus_two_btn:
                addScore(2,"A");
                displayScore("A");
                break;
            case R.id.free_throw_btn:
                addScore(1,"A");
                displayScore("A");
                break;
            case R.id.plus_three_b_btn:
                addScore(3,"B");
                displayScore("B");
                break;
            case R.id.plus_two_b_btn:
                addScore(2,"B");
                displayScore("B");
                break;
            case R.id.free_throw_b_btn:
                addScore(1,"B");
                displayScore("B");
                break;
            case R.id.reset_btn:
                reset();
                displayScore("A");
                displayScore("B");
                break;
            default:
                break;
        }
    }
    public void addScore(int score,String team){
        switch (team){
            case "A":
                scoreTeamA = scoreTeamA + score;
                break;
            case "B":
                scoreTeamB = scoreTeamB + score;
                break;
            default:
                break;
        }
    }
    public void displayScore(String team){
        switch (team){
            case "A":
                TextView scoreViewTeamA = (TextView)findViewById(R.id.team_a_score);
                scoreViewTeamA.setText(String.valueOf(scoreTeamA));
                break;
            case "B":
                TextView scoreViewTeamB = (TextView)findViewById(R.id.team_b_score);
                scoreViewTeamB.setText(String.valueOf(scoreTeamB));
                break;
            default:
                break;
        }
    }
    public void reset(){
        scoreTeamA = 0;
        scoreTeamB = 0;
    }
}
