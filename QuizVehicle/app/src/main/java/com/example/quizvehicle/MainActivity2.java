package com.example.quizvehicle;

import android.content.DialogInterface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    // Creating 4 variables of type Button
    Button button1, button2, button3, button4;
    // Creating varaible of type image view
    ImageView iv_Flag;
    List<Item> list;
    int turn=1;
     Random r;
     Animation shakeAnimation;
     Animation incorrectAnimation;
     int score=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Assign variable to resource on design layout
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r=new Random();
        button1=(Button)findViewById(R.id.option1);
        button2=(Button)findViewById(R.id.option2);
        button3=(Button)findViewById(R.id.option3);
        button4=(Button)findViewById(R.id.option4);

        //Loading the animation from the resource file in to variable created
        shakeAnimation= AnimationUtils.loadAnimation(this, R.anim.shake);
        incorrectAnimation=AnimationUtils.loadAnimation(this,R.anim.incorrect);

         iv_Flag=(ImageView) findViewById(R.id.imageView2);
         list = new ArrayList<>();
        for(int i=0;i<new DataBase().answer.length;i++)
        {
            list.add(new Item(new DataBase().answer[i], new DataBase().vehicle[i]));
        }
        //Collections.shuffle(list);
        newQuestion(turn);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(button1.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())) {
                     button1.startAnimation(shakeAnimation);
                     score++;
                     Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();


                     if (turn < list.size()) {
                         turn++;
                         newQuestion(turn);
                     } else {
                  //       Toast.makeText(MainActivity2.this, "Game Over!", Toast.LENGTH_SHORT).show();
                  //        Toast.makeText(MainActivity2.this,"score:"+score,Toast.LENGTH_SHORT).show()
                         AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);

                         builder.setTitle("Well done!")
                                 //
                                 .setMessage("Your score is " + score)
                                 .setPositiveButton("O.K",
                                         new DialogInterface.OnClickListener(){
                                             @Override
                                             public void onClick(DialogInterface dialog, int which) {
                                                 finish();
                                             }
                                         })

                                 .create()
                                 .show();


                     }
                     } else {
                    // button1.startAnimation(incorrectAnimation);
                     //  button1.setVisibility(View.GONE);
                         Toast.makeText(MainActivity2.this, "Incorrect!", Toast.LENGTH_SHORT).show();


                 }

             }
         });

         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(button2.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())) {
                     button2.startAnimation(shakeAnimation);
                     score++;
                     Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();

                     if(turn<list.size()) {
                         turn++;
                         newQuestion(turn);
                     }
                     else {
                       //  Toast.makeText(MainActivity2.this, "Game Over!", Toast.LENGTH_SHORT).show();
                       //  Toast.makeText(MainActivity2.this,"score:"+score,Toast.LENGTH_SHORT).show();
                         AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);
                            // Dialogue box displaying score
                         builder.setTitle("Well done!")
                                 .setMessage("Your score is " + score)
                                 .setPositiveButton("O.K",
                                         new DialogInterface.OnClickListener(){
                                             @Override
                                             public void onClick(DialogInterface dialog, int which) {
                                                 finish();
                                             }
                                         })
                                 .create()
                                 .show();
                     }
                 }
                     else {
                       //  button2.startAnimation(incorrectAnimation);
                      //   button2.setVisibility(View.GONE);
                         Toast.makeText(MainActivity2.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                     }

             }


         });
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(button3.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())) {
                     button3.startAnimation(shakeAnimation);
                     score++;

                     Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();

                     if(turn<list.size()) {
                         turn++;
                         newQuestion(turn);
                     }
                                          else {
                       //  Toast.makeText(MainActivity2.this, "Game Over!", Toast.LENGTH_SHORT).show();
                      // Toast.makeText(MainActivity2.this,"score:"+score,Toast.LENGTH_SHORT).show();
                         AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);

                         builder.setTitle("Well done!")
                                 .setMessage("Your score is " + score)
                                 .setPositiveButton("O.K",
                                         new DialogInterface.OnClickListener(){
                                             @Override
                                             public void onClick(DialogInterface dialog, int which) {
                                                 finish();
                                             }
                                         })
                                 .create()
                                 .show();

                     }
                 }
                     else {
                      //  button3.startAnimation(incorrectAnimation);
                     //    button3.setVisibility(View.GONE);
                         Toast.makeText(MainActivity2.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                     }
                 }



         });
         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 if(button4.getText().toString().equalsIgnoreCase(list.get(turn-1).getName())) {
                     button4.startAnimation(shakeAnimation);
                     score++;

                     Toast.makeText(MainActivity2.this, "Correct!", Toast.LENGTH_SHORT).show();

                     if (turn < list.size()) {
                         turn++;
                         newQuestion(turn);
                     } else {
                         //Toast.makeText(MainActivity2.this, "Game Over!", Toast.LENGTH_SHORT).show();
                         AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity2.this);

                         builder.setTitle("Well done!")
                                 .setMessage("Your score is " + score)
                                 .setPositiveButton("O.K",
                                         new DialogInterface.OnClickListener(){
                                             @Override
                                             public void onClick(DialogInterface dialog, int which) {
                                                 finish();
                                             }
                                         })
                                 .create()
                                 .show();
                     }
                 }
                     else {
                    //button4.startAnimation(incorrectAnimation);
                    // button4.setVisibility(View.GONE);
                         Toast.makeText(MainActivity2.this, "Incorrect!", Toast.LENGTH_SHORT).show();
                     }
                 }

         });
    }
    private void newQuestion(int number) {
        iv_Flag.setImageResource(list.get(number - 1).getImage());

        int correct_answer = r.nextInt(4) + 1;

        int firstButton = number - 1;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correct_answer) {
            case 1:

                button1.setText(list.get(firstButton).getName());
                do {
                    secondButton = r.nextInt(list.size());
                }
                while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                button2.setText(list.get(secondButton).getName());
                button3.setText(list.get(thirdButton).getName());
                button4.setText(list.get(fourthButton).getName());


                break;
            case 2:


                    button2.setText(list.get(firstButton).getName());


                do {
                    secondButton = r.nextInt(list.size());

                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                button1.setText(list.get(secondButton).getName());
                button3.setText(list.get(thirdButton).getName());
                button4.setText(list.get(fourthButton).getName());

                break;
            case 3:
                button3.setText(list.get(firstButton).getName());


                do {
                    secondButton = r.nextInt(list.size());

                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                button2.setText(list.get(secondButton).getName());
                button1.setText(list.get(thirdButton).getName());
                button4.setText(list.get(fourthButton).getName());

                break;
            case 4:
                button4.setText(list.get(firstButton).getName());


                do {
                    secondButton = r.nextInt(list.size());

                } while (secondButton == firstButton);
                do {
                    thirdButton = r.nextInt(list.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);
                do {
                    fourthButton = r.nextInt(list.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);
                Toast.makeText(MainActivity2.this,"score:"+score,Toast.LENGTH_SHORT).show();
                button2.setText(list.get(secondButton).getName());
                button3.setText(list.get(thirdButton).getName());
                button1.setText(list.get(fourthButton).getName());

                break;

        }
    }
                    }