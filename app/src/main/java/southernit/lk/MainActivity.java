package southernit.lk;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
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

        Button btnRoll = (Button) findViewById(R.id.button_roll);

        final ImageView imageLeftDice = (ImageView) findViewById(R.id.image_dice_left);
        final ImageView imageRightDice = (ImageView) findViewById(R.id.image_dice_right);

        final int diceArr[] = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };


        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "Button pressed");

                Random randomGenerator = new Random ();
                int randomNo1 = randomGenerator.nextInt(6);
                int randomNo2 = randomGenerator.nextInt(6);

                Log.d("Dicee", "Random no is : "+randomNo1);
                Log.d("Dicee", "Random no is : "+randomNo2);

                imageLeftDice.setImageResource(diceArr[randomNo1]);
                imageRightDice.setImageResource(diceArr[randomNo2]);
            }
        });


    }
}
