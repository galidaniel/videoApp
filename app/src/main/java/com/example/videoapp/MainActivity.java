package com.example.videoapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends Activity {
    private VideoView v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.v=findViewById(R.id.videoView);
        v.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.wallw);
        MediaController mc=new MediaController(this);
        mc.setAnchorView(v);
        v.setMediaController(mc);
        v.start();
    }
}