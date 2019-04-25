package com.example.landscaped;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MediumMap extends AppCompatActivity {

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
    ImageButton sq26 = null;
    ImageButton sq27 = null;
    ImageButton sq28 = null;
    ImageButton sq29 = null;
    ImageButton sq30 = null;
    ImageButton sq31 = null;
    ImageButton sq32 = null;
    ImageButton sq33 = null;
    ImageButton sq34 = null;
    ImageButton sq35 = null;
    ImageButton sq36 = null;
    ImageButton sq37 = null;
    ImageButton sq38 = null;
    ImageButton sq39 = null;
    ImageButton sq40 = null;
    ImageButton sq41 = null;
    ImageButton sq42 = null;
    ImageButton sq43 = null;
    ImageButton sq44 = null;
    ImageButton sq45 = null;
    ImageButton sq46 = null;
    ImageButton sq47 = null;
    ImageButton sq48 = null;
    ImageButton sq49 = null;
    ImageButton sq50 = null;
    ImageButton sq51 = null;
    ImageButton sq52 = null;
    ImageButton sq53 = null;
    ImageButton sq54 = null;
    ImageButton sq55 = null;
    ImageButton sq56 = null;
    ImageButton sq57 = null;
    ImageButton sq58 = null;
    ImageButton sq59 = null;
    ImageButton sq60 = null;
    ImageButton sq61 = null;
    ImageButton sq62 = null;
    ImageButton sq63 = null;
    ImageButton sq64 = null;

    int position = 0;
    int[][] positionArr = new int[][] {
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0}
    };

    TextView time = null;
    TextView score = null;
    Integer timeleft = 60;
    Integer scoreCountM = 0;
    int tilesLeftM = 51;

    Bundle bundle = new Bundle();

    ArrayList<ImageButton> arrayList = new ArrayList<>();
    ArrayList<Integer> objectList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium_map);

        time = findViewById(R.id.timeMedium);
        score = findViewById(R.id.scoreMedium);

        final Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (timeleft > 0) {
                        timeleft--;
                    }
                    MediumMap.this.runOnUiThread(new Runnable() {
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
                    if (tilesLeftM == 0) {
                        t.cancel();
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                bundle.putInt("score", scoreCountM);
                                Intent intent = new Intent(MediumMap.this, PopupMedium.class);
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
                    if (tilesLeftM == 0) {
                        tilesLeftM = 51;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        },4000 ,10);


        sq1 = findViewById(R.id.MSq1);
        sq2 = findViewById(R.id.MSq2);
        sq3 = findViewById(R.id.MSq3);
        sq4 = findViewById(R.id.MSq4);
        sq5 = findViewById(R.id.MSq5);
        sq6 = findViewById(R.id.MSq6);
        sq7 = findViewById(R.id.MSq7);
        sq8 = findViewById(R.id.MSq8);
        sq9 = findViewById(R.id.MSq9);
        sq10 = findViewById(R.id.MSq10);
        sq11 = findViewById(R.id.MSq11);
        sq12 = findViewById(R.id.MSq12);
        sq13 = findViewById(R.id.MSq13);
        sq14 = findViewById(R.id.MSq14);
        sq15 = findViewById(R.id.MSq15);
        sq16 = findViewById(R.id.MSq16);
        sq17 = findViewById(R.id.MSq17);
        sq18 = findViewById(R.id.MSq18);
        sq19 = findViewById(R.id.MSq19);
        sq20 = findViewById(R.id.MSq20);
        sq21 = findViewById(R.id.MSq21);
        sq22 = findViewById(R.id.MSq22);
        sq23 = findViewById(R.id.MSq23);
        sq24 = findViewById(R.id.MSq24);
        sq25 = findViewById(R.id.MSq25);
        sq26 = findViewById(R.id.MSq26);
        sq27 = findViewById(R.id.MSq27);
        sq28 = findViewById(R.id.MSq28);
        sq29 = findViewById(R.id.MSq29);
        sq30 = findViewById(R.id.MSq30);
        sq31 = findViewById(R.id.MSq31);
        sq32 = findViewById(R.id.MSq32);
        sq33 = findViewById(R.id.MSq33);
        sq34 = findViewById(R.id.MSq34);
        sq35 = findViewById(R.id.MSq35);
        sq36 = findViewById(R.id.MSq36);
        sq37 = findViewById(R.id.MSq37);
        sq38 = findViewById(R.id.MSq38);
        sq39 = findViewById(R.id.MSq39);
        sq40 = findViewById(R.id.MSq40);
        sq41 = findViewById(R.id.MSq41);
        sq42 = findViewById(R.id.MSq42);
        sq43 = findViewById(R.id.MSq43);
        sq44 = findViewById(R.id.MSq44);
        sq45 = findViewById(R.id.MSq45);
        sq46 = findViewById(R.id.MSq46);
        sq47 = findViewById(R.id.MSq47);
        sq48 = findViewById(R.id.MSq48);
        sq49 = findViewById(R.id.MSq49);
        sq50 = findViewById(R.id.MSq50);
        sq51 = findViewById(R.id.MSq51);
        sq52 = findViewById(R.id.MSq52);
        sq53 = findViewById(R.id.MSq53);
        sq54 = findViewById(R.id.MSq54);
        sq55 = findViewById(R.id.MSq55);
        sq56 = findViewById(R.id.MSq56);
        sq57 = findViewById(R.id.MSq57);
        sq58 = findViewById(R.id.MSq58);
        sq59 = findViewById(R.id.MSq59);
        sq60 = findViewById(R.id.MSq60);
        sq61 = findViewById(R.id.MSq61);
        sq62 = findViewById(R.id.MSq62);
        sq63 = findViewById(R.id.MSq63);
        sq64 = findViewById(R.id.MSq64);

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
        arrayList.add(sq26);
        arrayList.add(sq27);
        arrayList.add(sq28);
        arrayList.add(sq29);
        arrayList.add(sq30);
        arrayList.add(sq31);
        arrayList.add(sq32);
        arrayList.add(sq33);
        arrayList.add(sq34);
        arrayList.add(sq35);
        arrayList.add(sq36);
        arrayList.add(sq37);
        arrayList.add(sq38);
        arrayList.add(sq39);
        arrayList.add(sq40);
        arrayList.add(sq41);
        arrayList.add(sq42);
        arrayList.add(sq43);
        arrayList.add(sq44);
        arrayList.add(sq45);
        arrayList.add(sq46);
        arrayList.add(sq47);
        arrayList.add(sq48);
        arrayList.add(sq49);
        arrayList.add(sq50);
        arrayList.add(sq51);
        arrayList.add(sq52);
        arrayList.add(sq53);
        arrayList.add(sq54);
        arrayList.add(sq55);
        arrayList.add(sq56);
        arrayList.add(sq57);
        arrayList.add(sq58);
        arrayList.add(sq59);
        arrayList.add(sq60);
        arrayList.add(sq61);
        arrayList.add(sq62);
        arrayList.add(sq63);
        arrayList.add(sq64);


        positionArr[0][0] = 3;

        sq1.setBackgroundResource(R.drawable.grasswmower);

        for (int i = 0; i < 8; i++) {
            createRock();
        }
        for (int i = 0; i < 4; i++) {
            createTree();
        }
    }

    public void onClickMedium(View v) {
        positionArr[0][0] = 0;

        if (v.getId() == R.id.backmedium) {
            Intent y = new Intent(this, MainActivity.class);
            startActivity(y);
        } else {
            if (position == arrayList.indexOf(findViewById(v.getId())) - 1 || position == arrayList.indexOf(findViewById(v.getId())) + 1 || position == arrayList.indexOf(findViewById(v.getId())) - 8 || position == arrayList.indexOf(findViewById(v.getId())) + 8) {

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 8)][arrayList.indexOf(findViewById(v.getId())) - (8 * (arrayList.indexOf(findViewById(v.getId())) / 8))] == 2) {
                    Toast.makeText(this, "Trying to mow over rock or tree", Toast.LENGTH_LONG).show();

                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 8)][arrayList.indexOf(findViewById(v.getId())) - (8 * (arrayList.indexOf(findViewById(v.getId())) / 8))] == 0) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.mowwmower);
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountM = ((int) Math.floor(scoreCountM + (100 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 1;
                    }
                    tilesLeftM--;
                    Log.v("MYTAG","Medium Tiles: " + tilesLeftM);
                    position = arrayList.indexOf(findViewById(v.getId()));
                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 8)][arrayList.indexOf(findViewById(v.getId())) - (8 * (arrayList.indexOf(findViewById(v.getId())) / 8))] == 1) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountM = ((int) Math.floor(scoreCountM + (100 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 8)][arrayList.indexOf(findViewById(v.getId())) - (8 * (arrayList.indexOf(findViewById(v.getId())) / 8))] == 3) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountM = ((int) Math.floor(scoreCountM - (50 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountM = ((int) Math.floor(scoreCountM + (100 * Math.pow((1+0.01), timeleft))));
                        MediumMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountM);
                            }
                        });
                        positionArr[(int) Math.floor(position / 8)][((position) - (8 * (position / 8)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }
            }
        }
    }

    public void createRock() {

        int randomR = new Random().nextInt(64);
        for (int i = 0; i < objectList.size(); i++) {
            while (positionArr[(int) Math.floor(randomR / 8)][(int)(randomR - (8 * Math.floor(randomR / 8)))] == 3 || randomR == objectList.get(i)) {
                Log.v("MYTAG", "Rock: " + randomR);
                randomR = new Random().nextInt(64);
                Log.v("MYTAG", "Rock: " + randomR);
            }
        }
        
        if (randomR/8 < 1) {
            positionArr[0][randomR] = 2;
        } else if (randomR/8 < 2) {
            positionArr[1][randomR - 8] = 2;
        } else if (randomR/8 < 3) {
            positionArr[2][randomR - 16] = 2;
        } else if (randomR/8 < 4) {
            positionArr[3][randomR - 24] = 2;
        } else if (randomR/8 < 5){
            positionArr[4][randomR - 32] = 2;
        } else if (randomR/8 < 6){
            positionArr[5][randomR - 40] = 2;
        } else if (randomR/8 < 7){
            positionArr[6][randomR - 48] = 2;
        } else {
            positionArr[7][randomR - 56] = 2;
        }
        
        arrayList.get(randomR).setBackgroundResource(R.drawable.grasswrock);
        objectList.add(randomR);
    }

    public void createTree() {
        
        int randomT = new Random().nextInt(64);
        for (int i = 0; i < objectList.size(); i++) {
            while (positionArr[(int) Math.floor(randomT / 8)][(int)(randomT - (8 * Math.floor(randomT / 8)))] == 3 || randomT == objectList.get(i)) {
                Log.v("MYTAG", "Rock: " + randomT);
                randomT = new Random().nextInt(64);
                Log.v("MYTAG", "Rock: " + randomT);
            }
        }

        if (randomT/8 < 1) {
            positionArr[0][randomT] = 2;
        } else if (randomT/8 < 2) {
            positionArr[1][randomT - 8] = 2;
        } else if (randomT/8 < 3) {
            positionArr[2][randomT - 16] = 2;
        } else if (randomT/8 < 4) {
            positionArr[3][randomT - 24] = 2;
        } else if (randomT/8 < 5){
            positionArr[4][randomT - 32] = 2;
        } else if (randomT/8 < 6){
            positionArr[5][randomT - 40] = 2;
        } else if (randomT/8 < 7){
            positionArr[6][randomT - 48] = 2;
        } else {
            positionArr[7][randomT - 56] = 2;
        }

        arrayList.get(randomT).setBackgroundResource(R.drawable.grasswtree);
        objectList.add(randomT);
    }
}
