package com.yamidev.actividad6;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Scene pouHome, pouPlayground;
    TransitionManager transitionManager;
    ImageButton ibPlayground, ibHome;





    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.playground, null);

        pouHome = Scene.getSceneForLayout(findViewById(R.id.main), R.layout.home, this);
        pouPlayground = Scene.getSceneForLayout(findViewById(R.id.main), R.layout.playground, this);


        ibPlayground = findViewById(R.id.ibPlayground);



        ibPlayground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PlayGround.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in, R.anim.zoom_in);
            }
        });
    }

    public void changePlayground(View view) {
        Transition fadeTransition = new Fade();
        TransitionManager.go(pouHome, fadeTransition);
    }

    public void changeHome(View view) {
        Transition fadeTransition = new Fade();
        TransitionManager.go(pouPlayground, fadeTransition);
    }

}