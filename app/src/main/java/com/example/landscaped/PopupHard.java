package com.example.landscaped;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PopupHard extends Activity {

    TextView scorePop = null;
    Button submitB = null;
    Bundle bundle = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_hard);

        scorePop = findViewById(R.id.scorePopHard);
        submitB = findViewById(R.id.submitButtonHard);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        bundle = getIntent().getExtras();
        int score = bundle.getInt("score");
        scorePop.setText("Score: " + score);

        getWindow().setLayout((int) (width * .8), (int) (height * .3));
    }

    public void clickableHard(View v) {
        EditText nameField = (EditText) findViewById(R.id.nameEnterHard);
        String name = nameField.getText().toString();

        if(TextUtils.isEmpty(nameField.getText())){
            Toast.makeText(this, "Please enter a name for the leaderboard!", Toast.LENGTH_LONG).show();
        }else{
            Bundle bundle = getIntent().getExtras();
            bundle.putString("name", name);
            Intent intent = new Intent(PopupHard.this, HardLeaderboard.class);
            intent.putExtras(bundle);
            startActivity(intent);
        }

    }


}