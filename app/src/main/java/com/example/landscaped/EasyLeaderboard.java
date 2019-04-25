package com.example.landscaped;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class EasyLeaderboard extends AppCompatActivity {
    TextView score = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.leaderboard);

        SQLiteDatabase easyScore = this.openOrCreateDatabase("easy", Context.MODE_PRIVATE, null);
        easyScore.execSQL("Create table if not exists Scores (name text, score int)");

        score = findViewById(R.id.score);
        Bundle bundle= getIntent().getExtras();
        if(bundle != null ) {
            int scoreint = bundle.getInt("score");
            String name = bundle.getString("name");
            easyScore.execSQL("INSERT INTO Scores values (?,?)", new String[]{name, "" + scoreint});


            TextView first = findViewById(R.id.efirst);
            TextView second = findViewById(R.id.esecond);
            TextView third = findViewById(R.id.ethird);
            TextView fourth= findViewById(R.id.efourth);
            TextView fifth = findViewById(R.id.efifth);


            Cursor top5 = easyScore.rawQuery("SELECT * FROM Scores ORDER BY score DESC LIMIT 5", null);
            top5.moveToFirst();
            int i = 1;

            while(!top5.isAfterLast()){
                if(i == 1){
                    first.setText(top5.getString(0) + "   " + top5.getInt(1));

                }else if (i ==2){
                    second.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else if (i==3){
                    third.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else if (i ==4){
                    fourth.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else {
                    fifth.setText(top5.getString(0) + "   " + top5.getInt(1));
                }
                i++;
                top5.moveToNext();
            }

        }else{


            TextView first = findViewById(R.id.efirst);
            TextView second = findViewById(R.id.esecond);
            TextView third = findViewById(R.id.ethird);
            TextView fourth= findViewById(R.id.efourth);
            TextView fifth = findViewById(R.id.efifth);


            Cursor top5 = easyScore.rawQuery("SELECT * FROM Scores ORDER BY score DESC LIMIT 5", null);
            top5.moveToFirst();
            int i = 1;

            while(!top5.isAfterLast()){
                if(i == 1){
                    first.setText(top5.getString(0) + "   " + top5.getInt(1));

                }else if (i ==2){
                    second.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else if (i==3){
                    third.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else if (i ==4){
                    fourth.setText(top5.getString(0) + "   " + top5.getInt(1));
                }else {
                    fifth.setText(top5.getString(0) + "   " + top5.getInt(1));
                }
                top5.moveToNext();
                i++;
            }
        }

        //this checks the current contents of the database from highest score to lowest
        String db = "";
        Cursor c = easyScore.rawQuery("SELECT * FROM Scores ORDER BY score DESC", null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            db += c.getString(0) + " "+ c.getInt(1) + "\n";
            c.moveToNext();
        }
        Log.v("EasyDB", db);



    }

    public void onClickLeaderBoard(View v) {

        if (v.getId() == R.id.backleaderboard) {
            Intent y = new Intent(this, MainActivity.class);
            startActivity(y);
        }else if (v.getId() == R.id.medium){
            Intent x = new Intent(this, MediumLeaderboard.class);
            startActivity(x);
        }else if (v.getId() == R.id.hard){
            Intent x = new Intent(this, HardLeaderboard.class);
            startActivity(x);
        }
    }
}

