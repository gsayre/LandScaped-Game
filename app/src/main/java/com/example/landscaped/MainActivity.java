package com.example.landscaped;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick (View v) {
        switch (v.getId()) {
            case R.id.easymap : {
                Intent y = new Intent(this, EasyMap.class);
                startActivity(y);
                break;
            }

            case R.id.mediummap : {
                Intent y = new Intent(this, MediumMap.class);
                startActivity(y);
                break;
            }

            case R.id.hardmap : {
                Intent y = new Intent(this, HardMap.class);
                startActivity(y);
                break;
            }
            case R.id.leaderboard: {
                Intent x = new Intent(this, EasyLeaderboard.class);
                startActivity(x);
                break;
            }
            case R.id.instructions:{
                Intent x = new Intent(this, Instructions.class);
                startActivity(x);
                break;
            }

        }
    }
}
