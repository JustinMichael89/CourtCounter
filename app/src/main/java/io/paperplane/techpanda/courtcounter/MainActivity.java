package io.paperplane.techpanda.courtcounter;

/*
    This is a Basketball score keeping app that I, Justin Eichenlaub, learned to make
    while taking the Udacity Android Basics: User Input course on 16 SEP 2017. This app
    allows you to keep score of 2 different teams' scores in a basketball match with buttons
    for the 3 different point types as well as a reset button.
*/

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
        Variables
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // This will display the score for team A
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    // This wil display the score for Team B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    // This is Team A's Free Throw
    public void freeThrowTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    // This is Team B's Free Throw
    public void freeThrowTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    // This is Team A's 2 pointer
    public void addTwoPoints(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    // This is Team B's 2 pointer
    public void addTwoPointsB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    // This is Team A's 3 pointer
    public void addThreePoints(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    // This is Team B's 3 pointer
    public void addThreePointsB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    // This will reset the scores for both teams
    public void resetScores(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }


}
