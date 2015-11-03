package com.example.gemini.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class PotatoheadMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potatohead_main);
    }

    public void armsClicked(View arms) {
        if (((CheckBox) arms).isChecked()) {
            ImageView potatoArms = (ImageView) findViewById(R.id.potatoArms);
            potatoArms.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoArms = (ImageView) findViewById(R.id.potatoArms);
            potatoArms.setVisibility(View.INVISIBLE);
        }
    }


    public void shoesClicked(View shoes) {
        if (((CheckBox) shoes).isChecked()) {
            ImageView potatoShoes = (ImageView) findViewById(R.id.potatoShoes);
            potatoShoes.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoShoes = (ImageView) findViewById(R.id.potatoShoes);
            potatoShoes.setVisibility(View.INVISIBLE);
        }
    }


    public void noseClicked(View nose) {
        if (((CheckBox) nose).isChecked()) {
            ImageView potatoNose = (ImageView) findViewById(R.id.potatoNose);
            potatoNose.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoNose = (ImageView) findViewById(R.id.potatoNose);
            potatoNose.setVisibility(View.INVISIBLE);
        }
    }


    public void mustacheClicked(View mustache) {
        if (((CheckBox) mustache).isChecked()) {
            ImageView potatoMustache = (ImageView) findViewById(R.id.potatoMustache);
            potatoMustache.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoMustache = (ImageView) findViewById(R.id.potatoMustache);
            potatoMustache.setVisibility(View.INVISIBLE);
        }
    }


    public void mouthClicked(View mouth) {
        if (((CheckBox) mouth).isChecked()) {
            ImageView potatoMouth = (ImageView) findViewById(R.id.potatoMouth);
            potatoMouth.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoMouth = (ImageView) findViewById(R.id.potatoMouth);
            potatoMouth.setVisibility(View.INVISIBLE);
        }
    }


    public void hatClicked(View hat) {
        if (((CheckBox) hat).isChecked()) {
            ImageView potatoHat = (ImageView) findViewById(R.id.potatoHat);
            potatoHat.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoHat = (ImageView) findViewById(R.id.potatoHat);
            potatoHat.setVisibility(View.INVISIBLE);
        }
    }


    public void glassesClicked(View glasses) {
        if (((CheckBox) glasses).isChecked()) {
            ImageView potatoGlasses = (ImageView) findViewById(R.id.potatoGlasses);
            potatoGlasses.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoGlasses = (ImageView) findViewById(R.id.potatoGlasses);
            potatoGlasses.setVisibility(View.INVISIBLE);
        }
    }


    public void earsClicked(View ears) {
        if (((CheckBox) ears).isChecked()) {
            ImageView potatoEars = (ImageView) findViewById(R.id.potatoEars);
            potatoEars.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoEars = (ImageView) findViewById(R.id.potatoEars);
            potatoEars.setVisibility(View.INVISIBLE);
        }
    }


    public void eyebrowsClicked(View eyebrows) {
        if (((CheckBox) eyebrows).isChecked()) {
            ImageView potatoEyebrows = (ImageView) findViewById(R.id.potatoEyebrows);
            potatoEyebrows.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoEyebrows = (ImageView) findViewById(R.id.potatoEyebrows);
            potatoEyebrows.setVisibility(View.INVISIBLE);
        }
    }


    public void eyesClicked(View eyes) {
        if (((CheckBox) eyes).isChecked()) {
            ImageView potatoEyes = (ImageView) findViewById(R.id.potatoEyes);
            potatoEyes.setVisibility(View.VISIBLE);
        } else {
            ImageView potatoEyes = (ImageView) findViewById(R.id.potatoEyes);
            potatoEyes.setVisibility(View.INVISIBLE);
        }
    }
}
