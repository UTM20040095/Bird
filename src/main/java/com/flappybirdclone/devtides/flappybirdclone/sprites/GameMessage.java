package com.flappybirdclone.devtides.flappybirdclone.sprites;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;

import com.flappybirdclone.devtides.flappybirdclone.R;

public class GameMessage implements Sprite {

    private int screenHeight, screenWidth;
    private Bitmap message;
    private Bitmap playbutton;
    private Bitmap credits;
    public GameMessage(Resources resources, int screenHeight, int screenWidth) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        message = BitmapFactory.decodeResource(resources, R.drawable.message);
        playbutton = BitmapFactory.decodeResource(resources, R.drawable.playbutton);
        credits = BitmapFactory.decodeResource(resources, R.drawable.credits);

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(message, screenWidth / 2 - message.getWidth() / 2, screenHeight / 4, null);
        canvas.drawBitmap(playbutton, screenWidth / 2 - playbutton.getWidth() / 2, 4 * screenHeight / 4 - playbutton.getHeight(), null);
        canvas.drawBitmap(credits, screenWidth / 2 - credits.getWidth() / 2, 1 * screenHeight / 4 - credits.getHeight(), null);
    }

    @Override
    public void update() {

    }
}
