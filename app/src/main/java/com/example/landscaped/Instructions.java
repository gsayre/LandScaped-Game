package com.example.landscaped;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Instructions extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);

        TextView instructions = (TextView) findViewById(R.id.instruction);

        instructions.setText("How To Play: \n " +
                "               \n" +
                "             The objective of the game is to mow every block of lawn that does not contain" +
                " a rock or tree! Mowing over a square once will turn it light green and will add" +
                " points to your score. Mowing over a square more than once will turn it to dirt and " +
                " subtract points from your score. Each setting has its own time limit, increasing with" +
                " the difficulty of each level.\n \n" +
                "             " +
                "Things to remember: \n" +
                " ~You may only move to a square that is directly next to    you (up or down, left or right)" +
                " ... NO DIAGONALS\n" +
                "~Creating dirt blocks DECREASES your score\n" +
                "~The faster you finish... the higher your score \n \n" +
                " " +
                "Play against your friends, try to beat their scores and top the leaderboards!");
    }

    public void back(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}
