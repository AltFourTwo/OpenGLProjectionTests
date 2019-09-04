package com.example.alex.openglprojectiontests;

import android.graphics.Bitmap;

import javax.microedition.khronos.opengles.GL10;

public class Background {

    private Bitmap image;
    private int x, y , dx;

    private BackgroundDraw drawnForm;
    private boolean rFD = false;


    public Background(Bitmap res, GL10 gl) {
        image = res;
        readyForDraw(gl);
    }

    public Bitmap getImage() { return image; }

    public void update() {
        x+=dx;
        if (x < -GamePanel.WIDTH) {
            x = 0;
        }
    }

    public boolean isRFD() { return rFD; }

    public void readyForDraw(GL10 gl) {
        drawnForm = new BackgroundDraw(gl, this);
        rFD = true;
    }

    public void draw(GL10 gl) {
        //canvas.drawBitmap(image, x, y, null);
        //if (x <= 0) {
            //canvas.drawBitmap(image, x+ GamePanel.WIDTH, y, null);
        //}
            //TODO stuff
        drawnForm.draw(gl);

    }
}
