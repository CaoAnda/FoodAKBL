package com.example.foodakbl;

import android.content.Context;
import android.media.MediaPlayer;

public class utils {
    public static void new_player(Context context, int resid){
        MediaPlayer mMediaPlayer = MediaPlayer.create(context, resid);
        mMediaPlayer.setLooping(true);
        mMediaPlayer.start();
    }
}
