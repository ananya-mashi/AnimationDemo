package com.example.fadinganimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

boolean bartI =true;
    public void fade(View v) {
        ImageView biv = (ImageView) findViewById(R.id.bartImageView2);
        ImageView hiv = (ImageView) findViewById(R.id.homerImageView3);


        //biv.animate().translationYBy(1000).setDuration(2000);
        //biv.animate().translationXBy(-1000).setDuration(2000);

       // biv.animate().rotation(100).setDuration(1000);
        //biv.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

      /*  if (bartI) {
bartI=false;
            biv.animate().alpha(0).setDuration(2000);

            hiv.animate().alpha(1).setDuration(2000);

        }
        else
        { bartI=true;
            biv.animate().alpha(1).setDuration(2000);

            hiv.animate().alpha(0).setDuration(2000);

        }*/
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            ImageView biv = (ImageView) findViewById(R.id.bartImageView2);
          biv.setX(-1000);
            biv.animate().translationXBy(1000).rotation(360).setDuration(2000);
    }
}
