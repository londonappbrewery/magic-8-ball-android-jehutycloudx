package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /* This is the type */
    /* This is the assigned operator function */

        Button AskButton;
        AskButton = findViewById(R.id.Askbutton);


    /* This code statement is taking the the object type "ImageView" (from design) and calling
       the "variable"...'ballDisplay', next, it is equalizing to
       the value 'image_Eightball' (which was assigned from design)*/


        final   ImageView ballDisplay;
                ballDisplay = findViewById(R.id.image_Eightball);

    /* This code statement is define the list of values or 'array' function and call
       it variable 'ballarray' */
    /* We also need to use "int" for type, as since we are using integer we will
       eventually use a random integer generator to generate corresponding values
       defined in the array */


        final int[] ballArray = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5,

            };


    /* the variable we defined earlier, 'ballDisplay', will have it's image replaced by a corresponding
       integer from the array we defined above, using a random number generator */

    AskButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v)
        {

        Log.d("magiceightball", "the ask button has been pressed =)");

    /* The following will generate a random new number, */


        Random RNG = new Random ();
        int number = RNG.nextInt(5);

            ballDisplay.setImageResource(ballArray[number]);
            number = RNG.nextInt(5);

        }




    });



        }









    }






