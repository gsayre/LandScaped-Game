package com.example.landscaped;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class EasyMap extends AppCompatActivity {

    ImageButton sq1 = null;
    ImageButton sq2 = null;
    ImageButton sq3 = null;
    ImageButton sq4 = null;
    ImageButton sq5 = null;
    ImageButton sq6 = null;
    ImageButton sq7 = null;
    ImageButton sq8 = null;
    ImageButton sq9 = null;
    ImageButton sq10 = null;
    ImageButton sq11 = null;
    ImageButton sq12 = null;
    ImageButton sq13 = null;
    ImageButton sq14 = null;
    ImageButton sq15 = null;
    ImageButton sq16 = null;
    ImageButton sq17 = null;
    ImageButton sq18 = null;
    ImageButton sq19 = null;
    ImageButton sq20 = null;
    ImageButton sq21 = null;
    ImageButton sq22 = null;
    ImageButton sq23 = null;
    ImageButton sq24 = null;
    ImageButton sq25 = null;

    int position = 0;
    int timeEasy = 90;
    int[][] positionArr = new int[][] {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
    };

    TextView time = null;
    TextView score = null;
    Integer timeleft = 30;
    Integer scoreCountE = 0;
    int tilesLeftE = 21;

    Bundle bundle = new Bundle();

    ArrayList<ImageButton> arrayList = new ArrayList<>();
    ArrayList<Integer> objectList = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy_map);

        time = findViewById(R.id.time);
        score = findViewById(R.id.score);
        
        objectList = new ArrayList<>();


        final Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (timeleft > 0) {
                        timeleft--;
                    }
                    EasyMap.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            time.setText("Time Left: " + timeleft);
                        }
                    });

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, 1000);

        final Timer t2 = new Timer();
        t2.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (tilesLeftE == 0) {
                        t.cancel();
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                bundle.putInt("score", scoreCountE);
                                Intent intent = new Intent(EasyMap.this, PopupEasy.class);
                                intent.putExtras(bundle);
                                startActivity(intent);
                            }
                        });
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        },0 ,10);

        final Timer t3 = new Timer();
        t3.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (tilesLeftE == 0) {
                        tilesLeftE = 21;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        },4000 ,10);


        sq1 = findViewById(R.id.ESq1);
        sq2 = findViewById(R.id.ESq2);
        sq3 = findViewById(R.id.ESq3);
        sq4 = findViewById(R.id.ESq4);
        sq5 = findViewById(R.id.ESq5);
        sq6 = findViewById(R.id.ESq6);
        sq7 = findViewById(R.id.ESq7);
        sq8 = findViewById(R.id.ESq8);
        sq9 = findViewById(R.id.ESq9);
        sq10 = findViewById(R.id.ESq10);
        sq11 = findViewById(R.id.ESq11);
        sq12 = findViewById(R.id.ESq12);
        sq13 = findViewById(R.id.ESq13);
        sq14 = findViewById(R.id.ESq14);
        sq15 = findViewById(R.id.ESq15);
        sq16 = findViewById(R.id.ESq16);
        sq17 = findViewById(R.id.ESq17);
        sq18 = findViewById(R.id.ESq18);
        sq19 = findViewById(R.id.ESq19);
        sq20 = findViewById(R.id.ESq20);
        sq21 = findViewById(R.id.ESq21);
        sq22 = findViewById(R.id.ESq22);
        sq23 = findViewById(R.id.ESq23);
        sq24 = findViewById(R.id.ESq24);
        sq25 = findViewById(R.id.ESq25);

        arrayList.add(sq1);
        arrayList.add(sq2);
        arrayList.add(sq3);
        arrayList.add(sq4);
        arrayList.add(sq5);
        arrayList.add(sq6);
        arrayList.add(sq7);
        arrayList.add(sq8);
        arrayList.add(sq9);
        arrayList.add(sq10);
        arrayList.add(sq11);
        arrayList.add(sq12);
        arrayList.add(sq13);
        arrayList.add(sq14);
        arrayList.add(sq15);
        arrayList.add(sq16);
        arrayList.add(sq17);
        arrayList.add(sq18);
        arrayList.add(sq19);
        arrayList.add(sq20);
        arrayList.add(sq21);
        arrayList.add(sq22);
        arrayList.add(sq23);
        arrayList.add(sq24);
        arrayList.add(sq25);

        positionArr[0][0] = 3;


        sq1.setBackgroundResource(R.drawable.grasswmower);
        for (int i = 0; i < 2; i++) {
            createRock();
        }
        createTree();
    }

    public void onClick(View v) {
        positionArr[0][0] = 0;

        if (v.getId() == R.id.backeasy) {
            Intent y = new Intent(this, MainActivity.class);
            startActivity(y);
        }else {
             if (position == arrayList.indexOf(findViewById(v.getId())) - 1 || position == arrayList.indexOf(findViewById(v.getId())) + 1 || position == arrayList.indexOf(findViewById(v.getId())) - 5 || position == arrayList.indexOf(findViewById(v.getId())) + 5) {

                 if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 5)][arrayList.indexOf(findViewById(v.getId())) - (5 * (arrayList.indexOf(findViewById(v.getId())) / 5))] == 2) {
                     Toast.makeText(this, "Trying to mow over rock or tree", Toast.LENGTH_LONG).show();

                 }

                 if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 5)][arrayList.indexOf(findViewById(v.getId())) - (5 * (arrayList.indexOf(findViewById(v.getId())) / 5))] == 0) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.mowwmower);
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountE = ((int) Math.floor(scoreCountE + (100 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));
                     tilesLeftE--;
                     Log.v("MYTAG", "" + tilesLeftE);
                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 5)][arrayList.indexOf(findViewById(v.getId())) - (5 * (arrayList.indexOf(findViewById(v.getId())) / 5))] == 1) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountE = ((int) Math.floor(scoreCountE + (100 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 5)][arrayList.indexOf(findViewById(v.getId())) - (5 * (arrayList.indexOf(findViewById(v.getId())) / 5))] == 3) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountE = ((int) Math.floor(scoreCountE - (50 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountE = ((int) Math.floor(scoreCountE + (100 * Math.pow((1+0.01), timeleft))));
                        EasyMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountE);
                            }
                        });
                        positionArr[(int) Math.floor(position / 5)][((position) - (5 * (position / 5)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }
            }
        }
    }

    public void createRock() {
        
        int randomR = new Random().nextInt(25);
        for (int i = 0; i < objectList.size(); i++){
            while (positionArr[(int) Math.floor(randomR / 5)][(int)(randomR - (5 * Math.floor(randomR / 5)))] == 3 || randomR == objectList.get(i)) {
                Log.v("MYTAG", "Rock: " + randomR);
                randomR = new Random().nextInt(25);
                Log.v("MYTAG", "Rock: " + randomR);
            }
        }

        if (randomR/5 < 1) {
            positionArr[0][randomR] = 2;
        } else if (randomR/5 < 2) {
            positionArr[1][randomR - 5] = 2;
        } else if (randomR/5 < 3) {
            positionArr[2][randomR - 10] = 2;
        } else if (randomR/5 < 4) {
            positionArr[3][randomR - 15] = 2;
        } else {
            positionArr[4][randomR - 20] = 2;
        }
        arrayList.get(randomR).setBackgroundResource(R.drawable.grasswrock);
        objectList.add(randomR);
    }

    public void createTree() {
        
        int randomT = new Random().nextInt(25);
        for (int i = 0; i < objectList.size(); i++){
            while (positionArr[(int) Math.floor(randomT / 5)][(int)(randomT - (5 * Math.floor(randomT / 5)))] == 3 || randomT == objectList.get(i) ) {
                Log.v("MYTAG", "Rock: " + randomT);
                randomT = new Random().nextInt(25);
                Log.v("MYTAG", "Rock: " + randomT);
            }
        }

        if (randomT/5 < 1) {
            positionArr[0][randomT] = 2;
        } else if (randomT/5 < 2) {
            positionArr[1][randomT - 5] = 2;
        } else if (randomT/5 < 3) {
            positionArr[2][randomT - 10] = 2;
        } else if (randomT/5 < 4) {
            positionArr[3][randomT - 15] = 2;
        } else {
            positionArr[4][randomT - 20] = 2;
        }
        arrayList.get(randomT).setBackgroundResource(R.drawable.grasswtree);
        objectList.add(randomT);
    }

    public boolean checkPathEasy(int randomNum) {
        positionArr[(int) Math.floor(randomNum / 5)][(int)(randomNum - (5 * Math.floor(randomNum / 5)))] = 2;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (positionArr[i + 1][j] == 0 || positionArr[i - 1][j] == 0 || positionArr[i][j - 5] == 0 || positionArr[i][j + 5] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
