package com.example.administrator.facemaker;

import android.content.Context;
import android.graphics.Canvas;

import java.util.Random;

/**
 * Created by hall18 on 2/10/2016.
 */
public class Face {

    protected int[] skinColor = {0,0,0};
    protected int[] eyeColor = {0,0,0};
    protected int[] hairColor = {0,0,0};
    protected int hairStyleIndex;
    protected int eyeStyleIndex;
    protected int noseStyleIndex;


    public Face (Context context){
    //super(context);

    }
    public void randomize(){
        Random rand = new Random();
        skinColor[0] = rand.nextInt(256);
        skinColor[1] = rand.nextInt(256);
        skinColor[2] = rand.nextInt(256);

        eyeColor[0] = rand.nextInt(256);
        eyeColor[1] = rand.nextInt(256);
        eyeColor[2] = rand.nextInt(256);

        hairColor[0] = rand.nextInt(256);
        hairColor[1] = rand.nextInt(256);
        hairColor[2] = rand.nextInt(256);

        hairStyleIndex = rand.nextInt(3);

        eyeStyleIndex = rand.nextInt(3);

        noseStyleIndex = rand.nextInt(3);
    }

    //public void onDraw(Canvas canvas){

    }

}
