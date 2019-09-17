package com.muhib.splashactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
//        RotateAnimation rotate = new RotateAnimation(-359, 0, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//        rotate.setDuration(2000);
//        rotate.setInterpolator(new LinearInterpolator());
//
//        //Load animation
//        Animation slide_down = AnimationUtils.loadAnimation(getApplicationContext(),
//                R.anim.slide_down);
//
//        ImageView image = (ImageView) findViewById(R.id.imageView);
//
//        AnimationSet s = new AnimationSet(false);//false means don't share interpolators
//        s.addAnimation(slide_down);
//        s.addAnimation(rotate);
//
//        image.startAnimation(s);
    }
}
