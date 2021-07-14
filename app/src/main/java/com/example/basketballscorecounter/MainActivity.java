package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int scoreA = 0;
    private static int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void scorePlus3_a(View view) {
        scoreA += 3;
        displayTeam_a(scoreA);
    }

    public void scorePlus2_a(View view) {
        scoreA += 2;
        displayTeam_a(scoreA);
    }

    public void FreeThrow_a(View view) {
        scoreA++;
        displayTeam_a(scoreA);
    }

    private void displayTeam_b(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scorePlus3_b(View view) {
        scoreB += 3;
        displayTeam_b(scoreB);
    }

    public void scorePlus2_b(View view) {
        scoreB += 2;
        displayTeam_b(scoreB);
    }

    public void FreeThrow_b(View view) {
        scoreB++;
        displayTeam_b(scoreB);
    }


    private void displayTeam_a(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void resetAllScores(View view){
        scoreA=0;
        scoreB=0;
        displayTeam_a(scoreA);
        displayTeam_b(scoreB);
    }
}