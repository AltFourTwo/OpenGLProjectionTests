package com.example.alex.openglprojectiontests;

import android.content.Context;
import android.graphics.Canvas;
import android.opengl.GLSurfaceView;
import android.view.MotionEvent;
import android.view.SurfaceHolder;

import javax.microedition.khronos.opengles.GL10;

public class GamePanel extends GLSurfaceView {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 360;
    public static final int MOVESPEED = -5;

    public GamePanel(Context context) {
        super(context);


        Constants.CURRENT_CONTEXT = context;
    }



    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        super.surfaceCreated(holder);

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        super.surfaceChanged(holder, format, width, height);
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        super.surfaceDestroyed(holder);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                //Constants.CURRENT_GL.glTranslatef(event.getX(), event.getY(),0);
                    //playerPoint.set((int)event.getX(), (int)event.getY());
                break;
        }

        return true;
    }
}
