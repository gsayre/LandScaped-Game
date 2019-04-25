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

public class HardMap extends AppCompatActivity {

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
    ImageButton sq65 = null;
    ImageButton sq66 = null;
    ImageButton sq67 = null;
    ImageButton sq68 = null;
    ImageButton sq69 = null;
    ImageButton sq70 = null;
    ImageButton sq71 = null;
    ImageButton sq72 = null;
    ImageButton sq73 = null;
    ImageButton sq74 = null;
    ImageButton sq75 = null;
    ImageButton sq76 = null;
    ImageButton sq77 = null;
    ImageButton sq78 = null;
    ImageButton sq79 = null;
    ImageButton sq80 = null;
    ImageButton sq81 = null;
    ImageButton sq82 = null;
    ImageButton sq83 = null;
    ImageButton sq84 = null;
    ImageButton sq85 = null;
    ImageButton sq86 = null;
    ImageButton sq87 = null;
    ImageButton sq88 = null;
    ImageButton sq89 = null;
    ImageButton sq90 = null;
    ImageButton sq91 = null;
    ImageButton sq92 = null;
    ImageButton sq93 = null;
    ImageButton sq94 = null;
    ImageButton sq95 = null;
    ImageButton sq96 = null;
    ImageButton sq97 = null;
    ImageButton sq98 = null;
    ImageButton sq99 = null;
    ImageButton sq100 = null;

    int position = 0;
    int[][] positionArr = new int[][] {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0}
    };

    TextView time = null;
    TextView score = null;
    Integer timeleft = 90;
    Integer scoreCountH = 0;
    int tilesLeftH = 74;

    Bundle bundle = new Bundle();

    ArrayList<ImageButton> arrayList = new ArrayList<>();
    ArrayList<Integer> objectList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard_map);

        time = findViewById(R.id.timeHard);
        score = findViewById(R.id.scoreHard);

        final Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    if (timeleft > 0) {
                        timeleft--;
                    }
                    HardMap.this.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            time.setText("Time Left: " + ((int)Math.floor(timeleft/60)) + ":" + (timeleft % 60));
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
                    if (tilesLeftH == 0) {
                        t.cancel();
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                bundle.putInt("score", scoreCountH);
                                Intent intent = new Intent(HardMap.this, PopupHard.class);
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
                    if (tilesLeftH == 0) {
                        tilesLeftH = 74;
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        },4000 ,10);


        sq1 = findViewById(R.id.HSq1);
        sq2 = findViewById(R.id.HSq2);
        sq3 = findViewById(R.id.HSq3);
        sq4 = findViewById(R.id.HSq4);
        sq5 = findViewById(R.id.HSq5);
        sq6 = findViewById(R.id.HSq6);
        sq7 = findViewById(R.id.HSq7);
        sq8 = findViewById(R.id.HSq8);
        sq9 = findViewById(R.id.HSq9);
        sq10 = findViewById(R.id.HSq10);
        sq11 = findViewById(R.id.HSq11);
        sq12 = findViewById(R.id.HSq12);
        sq13 = findViewById(R.id.HSq13);
        sq14 = findViewById(R.id.HSq14);
        sq15 = findViewById(R.id.HSq15);
        sq16 = findViewById(R.id.HSq16);
        sq17 = findViewById(R.id.HSq17);
        sq18 = findViewById(R.id.HSq18);
        sq19 = findViewById(R.id.HSq19);
        sq20 = findViewById(R.id.HSq20);
        sq21 = findViewById(R.id.HSq21);
        sq22 = findViewById(R.id.HSq22);
        sq23 = findViewById(R.id.HSq23);
        sq24 = findViewById(R.id.HSq24);
        sq25 = findViewById(R.id.HSq25);
        sq26 = findViewById(R.id.HSq26);
        sq27 = findViewById(R.id.HSq27);
        sq28 = findViewById(R.id.HSq28);
        sq29 = findViewById(R.id.HSq29);
        sq30 = findViewById(R.id.HSq30);
        sq31 = findViewById(R.id.HSq31);
        sq32 = findViewById(R.id.HSq32);
        sq33 = findViewById(R.id.HSq33);
        sq34 = findViewById(R.id.HSq34);
        sq35 = findViewById(R.id.HSq35);
        sq36 = findViewById(R.id.HSq36);
        sq37 = findViewById(R.id.HSq37);
        sq38 = findViewById(R.id.HSq38);
        sq39 = findViewById(R.id.HSq39);
        sq40 = findViewById(R.id.HSq40);
        sq41 = findViewById(R.id.HSq41);
        sq42 = findViewById(R.id.HSq42);
        sq43 = findViewById(R.id.HSq43);
        sq44 = findViewById(R.id.HSq44);
        sq45 = findViewById(R.id.HSq45);
        sq46 = findViewById(R.id.HSq46);
        sq47 = findViewById(R.id.HSq47);
        sq48 = findViewById(R.id.HSq48);
        sq49 = findViewById(R.id.HSq49);
        sq50 = findViewById(R.id.HSq50);
        sq51 = findViewById(R.id.HSq51);
        sq52 = findViewById(R.id.HSq52);
        sq53 = findViewById(R.id.HSq53);
        sq54 = findViewById(R.id.HSq54);
        sq55 = findViewById(R.id.HSq55);
        sq56 = findViewById(R.id.HSq56);
        sq57 = findViewById(R.id.HSq57);
        sq58 = findViewById(R.id.HSq58);
        sq59 = findViewById(R.id.HSq59);
        sq60 = findViewById(R.id.HSq60);
        sq61 = findViewById(R.id.HSq61);
        sq62 = findViewById(R.id.HSq62);
        sq63 = findViewById(R.id.HSq63);
        sq64 = findViewById(R.id.HSq64);
        sq65 = findViewById(R.id.HSq65);
        sq66 = findViewById(R.id.HSq66);
        sq67 = findViewById(R.id.HSq67);
        sq68 = findViewById(R.id.HSq68);
        sq69 = findViewById(R.id.HSq69);
        sq70 = findViewById(R.id.HSq70);
        sq71 = findViewById(R.id.HSq71);
        sq72 = findViewById(R.id.HSq72);
        sq73 = findViewById(R.id.HSq73);
        sq74 = findViewById(R.id.HSq74);
        sq75 = findViewById(R.id.HSq75);
        sq76 = findViewById(R.id.HSq76);
        sq77 = findViewById(R.id.HSq77);
        sq78 = findViewById(R.id.HSq78);
        sq79 = findViewById(R.id.HSq79);
        sq80 = findViewById(R.id.HSq80);
        sq81 = findViewById(R.id.HSq81);
        sq82 = findViewById(R.id.HSq82);
        sq83 = findViewById(R.id.HSq83);
        sq84 = findViewById(R.id.HSq84);
        sq85 = findViewById(R.id.HSq85);
        sq86 = findViewById(R.id.HSq86);
        sq87 = findViewById(R.id.HSq87);
        sq88 = findViewById(R.id.HSq88);
        sq89 = findViewById(R.id.HSq89);
        sq90 = findViewById(R.id.HSq90);
        sq91 = findViewById(R.id.HSq91);
        sq92 = findViewById(R.id.HSq92);
        sq93 = findViewById(R.id.HSq93);
        sq94 = findViewById(R.id.HSq94);
        sq95 = findViewById(R.id.HSq95);
        sq96 = findViewById(R.id.HSq96);
        sq97 = findViewById(R.id.HSq97);
        sq98 = findViewById(R.id.HSq98);
        sq99 = findViewById(R.id.HSq99);
        sq100 = findViewById(R.id.HSq100);


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
        arrayList.add(sq65);
        arrayList.add(sq66);
        arrayList.add(sq67);
        arrayList.add(sq68);
        arrayList.add(sq69);
        arrayList.add(sq70);
        arrayList.add(sq71);
        arrayList.add(sq72);
        arrayList.add(sq73);
        arrayList.add(sq74);
        arrayList.add(sq75);
        arrayList.add(sq76);
        arrayList.add(sq77);
        arrayList.add(sq78);
        arrayList.add(sq79);
        arrayList.add(sq80);
        arrayList.add(sq81);
        arrayList.add(sq82);
        arrayList.add(sq83);
        arrayList.add(sq84);
        arrayList.add(sq85);
        arrayList.add(sq86);
        arrayList.add(sq87);
        arrayList.add(sq88);
        arrayList.add(sq89);
        arrayList.add(sq90);
        arrayList.add(sq91);
        arrayList.add(sq92);
        arrayList.add(sq93);
        arrayList.add(sq94);
        arrayList.add(sq95);
        arrayList.add(sq96);
        arrayList.add(sq97);
        arrayList.add(sq98);
        arrayList.add(sq99);
        arrayList.add(sq100);

        positionArr[0][0] = 3;

        sq1.setBackgroundResource(R.drawable.grasswmower);

        for(int i = 0; i < 19; i++) {
            createRock();
        }
        for(int i = 0; i < 6; i++) {
            createTree();
        }
    }

    public void onClickHard(View v) {
        if (v.getId() == R.id.backhard) {
            Intent y = new Intent(this, MainActivity.class);
            startActivity(y);
        } else {
            if (position == arrayList.indexOf(findViewById(v.getId())) - 1 || position == arrayList.indexOf(findViewById(v.getId())) + 1 || position == arrayList.indexOf(findViewById(v.getId())) - 10 || position == arrayList.indexOf(findViewById(v.getId())) + 10) {

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 10)][arrayList.indexOf(findViewById(v.getId())) - (10 * (arrayList.indexOf(findViewById(v.getId())) / 10))] == 2) {
                    Toast.makeText(this, "Trying to mow over rock or tree", Toast.LENGTH_LONG).show();

                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 10)][arrayList.indexOf(findViewById(v.getId())) - (10 * (arrayList.indexOf(findViewById(v.getId())) / 10))] == 0) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.mowwmower);
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountH = ((int) Math.floor(scoreCountH + (100 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 1;
                    }
                    tilesLeftH--;
                    Log.v("MYTAG", "Tiles left: " + tilesLeftH);
                    position = arrayList.indexOf(findViewById(v.getId()));
                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 10)][arrayList.indexOf(findViewById(v.getId())) - (10 * (arrayList.indexOf(findViewById(v.getId())) / 10))] == 1) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountH = ((int) Math.floor(scoreCountH + (100 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }

                if (positionArr[(int) Math.floor( arrayList.indexOf(findViewById(v.getId())) / 10)][arrayList.indexOf(findViewById(v.getId())) - (10 * (arrayList.indexOf(findViewById(v.getId())) / 10))] == 3) {
                    findViewById(v.getId()).setBackgroundResource(R.drawable.dirtwmower);
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 1) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 3) {
                        arrayList.get(position).setBackgroundResource(R.drawable.dirt);
                        scoreCountH = ((int) Math.floor(scoreCountH - (50 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 3;
                    }
                    if (positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] == 0) {
                        arrayList.get(position).setBackgroundResource(R.drawable.mowedgrass);
                        scoreCountH = ((int) Math.floor(scoreCountH + (100 * Math.pow((1+0.01), timeleft))));
                        HardMap.this.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                score.setText("Score: " + scoreCountH);
                            }
                        });
                        positionArr[(int) Math.floor(position / 10)][((position) - (10 * (position / 10)))] = 1;
                    }
                    position = arrayList.indexOf(findViewById(v.getId()));

                }
            }
        }
    }

    public void createRock() {

        int randomR = new Random().nextInt(100);
        for (int i = 0; i < objectList.size(); i++) {
            while (objectList.get(i) == randomR || positionArr[(int) Math.floor(randomR / 10)][(int)(randomR - (10 * Math.floor(randomR / 10)))] == 3) {
                Log.v("MYTAG", "Rock: " + randomR);
                randomR = new Random().nextInt(100);
                Log.v("MYTAG", "Rock: " + randomR);
            }
        }

        if (randomR/10 < 1) {
            positionArr[0][randomR] = 2;
        } else if (randomR/10 < 2) {
            positionArr[1][randomR - 10] = 2;
        } else if (randomR/10 < 3) {
            positionArr[2][randomR - 20] = 2;
        } else if (randomR/10 < 4) {
            positionArr[3][randomR - 30] = 2;
        } else if (randomR/10 < 5){
            positionArr[4][randomR - 40] = 2;
        } else if (randomR/10 < 6){
            positionArr[5][randomR - 50] = 2;
        } else if (randomR/10 < 7){
            positionArr[6][randomR - 60] = 2;
        } else if (randomR/10 < 8){
            positionArr[7][randomR - 70] = 2;
        } else if (randomR/10 < 9){
            positionArr[8][randomR - 80] = 2;
        } else {
            positionArr[9][randomR - 90] = 2;
        }

        arrayList.get(randomR).setBackgroundResource(R.drawable.grasswrock);
        objectList.add(randomR);
    }

    public void createTree() {

        int randomT = new Random().nextInt(100);
        for (int i = 0; i < objectList.size(); i++) {
            while (objectList.get(i) == randomT || positionArr[(int) Math.floor(randomT / 10)][(int)(randomT - (10 * Math.floor(randomT / 10)))] == 3) {
                Log.v("MYTAG", "Tree: " + randomT);
                randomT = new Random().nextInt(100);
                Log.v("MYTAG", "Tree: " + randomT);
            }
        }

        if (randomT/10 < 1) {
            positionArr[0][randomT] = 2;
        } else if (randomT/10 < 2) {
            positionArr[1][randomT - 10] = 2;
        } else if (randomT/10 < 3) {
            positionArr[2][randomT - 20] = 2;
        } else if (randomT/10 < 4) {
            positionArr[3][randomT - 30] = 2;
        } else if (randomT/10 < 5){
            positionArr[4][randomT - 40] = 2;
        } else if (randomT/10 < 6){
            positionArr[5][randomT - 50] = 2;
        } else if (randomT/10 < 7){
            positionArr[6][randomT - 60] = 2;
        } else if (randomT/10 < 8){
            positionArr[7][randomT - 70] = 2;
        } else if (randomT/10 < 9){
            positionArr[8][randomT - 80] = 2;
        } else {
            positionArr[9][randomT - 90] = 2;
        }

        arrayList.get(randomT).setBackgroundResource(R.drawable.grasswtree);
        objectList.add(randomT);
    }

}
